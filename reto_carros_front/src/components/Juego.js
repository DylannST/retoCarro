import React, { useState } from "react";
import "./Menu.css";
import {
  actualizarAvance,
  actualizarPosicion,
  consultar,
  consultarTabla,
  registrarService,
} from "../service/JuegoService";
const carga = (e) => {
  e.preventDefault();
};
export default function Juego({ juego }) {
  const [tabla, setTabla] = useState([]);
  const [dado, setDado] = useState(0);
  const [pista, setPista] = useState(null);
  const [jugadores, setJugadores] = useState([]);
  const [jugadorAc, setJugadorAc] = useState({
    nombre: "",
  });
  const [acum, setAcum] = useState(1);
  const [juegoTerminado, setJuegoTerminado] = useState(false);

  async function llenar() {
    const resultado = await consultarTabla(`carros/${juego.numeroJuego}`);
    setAcum(1);
    setTabla(resultado);
    setPista(juego.pista);
    console.log("jeugo jugadores", juego.jugadores);
    setJugadores(juego.jugadores);

    const jugadorActual = juego.jugadores.filter((ju) => {
      return ju.turno === acum;
    });
    setJugadorAc(jugadorActual[0]);
    setAcum(acum + 1);
  }

  async function aleatorio() {
    const resultadoDado = getRandomArbitrary(1, 6);
    setDado(parseInt(resultadoDado));

    if (jugadores.length > 0) {
      var jugadorActual = jugadores.filter((ju) => {
        if (ju.turno === acum) {
          return ju;
        }
      });

      setJugadorAc(
        jugadorActual.length > 0 ? jugadorActual[0] : { nombre: "" }
      );
      console.log("jugadorActual", jugadorActual, "jugadores", jugadores);
      await actualizarAvance(
        `carro/${parseInt(resultadoDado)}/${jugadorActual[0].nombre}`
      );
      var resultado = await consultarTabla(`carros/${juego.numeroJuego}`);
      console.log("resultado inicial", resultado);

      resultado = resultado.sort(function (a, b) {
        return b.avance - a.avance;
      });

      resultado.forEach((result, index) => {
        result.posicion = index + 1;
        result.avance =
          result.avance >= pista.tamanio * 1000
            ? pista.tamanio * 1000
            : result.avance;
      });

      setTabla(resultado);

      if (resultado[0].avance >= pista.tamanio * 1000) {
        setJuegoTerminado(true);
        var listPodio = [];

        if (resultado.length < 4) {
          await actualizarPosicion(resultado, "carros");
          resultado.forEach((value) => {
            listPodio.push({
              puesto: value.posicion,
              conductor: {
                nombre: value.nombre,
              },
            });
          });
        } else {
          await actualizarPosicion(
            [resultado[0], resultado[1], resultado[2]],
            "carros"
          );

          resultado.forEach((value, index) => {
            if (index < 3) {
              listPodio.push({
                puesto: value.posicion,
                conductor: {
                  nombre: value.nombre,
                  carro: {}
                },
              });
            }
          });
        }

        await registrarService(listPodio, "podio");
      }

      if (acum <= tabla.length) {
        if (acum === tabla.length) {
          setAcum(1);
        } else {
          setAcum(acum + 1);
        }
      }
    }
  }
  function getRandomArbitrary(min, max) {
    return Math.random() * (max - min) + min;
  }

  return (
    <div className="container">
      <form className="row g-3" onSubmit={carga}>
        <div className="col-12">
          <p className="pJuego">Juego: {juego.numeroJuego}</p>
        </div>

        <div className="col-6 tableM">
          <table className="table table-dark col">
            <thead>
              <tr key={1}>
                <th scope="col">Nombre</th>
                <th scope="col">Placa carro</th>
                <th scope="col">Avance</th>
                <th scope="col">Posición</th>
              </tr>
            </thead>

            <tbody>
              {tabla.map((vae) => (
                <tr key={vae.nombre}>
                  <td>{vae.nombre}</td>
                  <td>{vae.placa}</td>
                  <td>{vae.avance}</td>
                  <td>{vae.posicion}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
        <div className="col-6">
          <p className="pMeta">
            Meta: {pista !== null && pista.tamanio * 1000} Metros
          </p>
        </div>

        <div className="col-4">
          <label className="form-label">El turno siguente:</label>
          <p className="pGanadas">{jugadorAc.nombre}</p>
        </div>
        <div className="col-4 mt-30">
          <button
            className="btn btn-success m-10 buttonMargin "
            onClick={llenar}
          >
            Comenzar
          </button>
        </div>
        <div className="col-4">
          <button
            className="btn btn-warning m-10 buttonMargin"
            onClick={() => aleatorio()}
            disabled={juegoTerminado}
          >
            Lanzar dado
          </button>
          <p className="pGanadas">{dado}</p>
        </div>
      </form>
    </div>
  );
}
