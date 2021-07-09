import React, { useState } from "react";
import { registrarService } from "../service/JuegoService";
import Juego from "./Juego";
import "./Menu.css";
export default function Registro() {
  const listaColores = [
    "azul",
    "verde",
    "negro",
    "morado",
    "gris",
    "plateado",
    "naranja",
    "cafe",
  ];
  function getRandomArbitrary(min, max) {
    return Math.random() * (max - min) + min;
  }

  const [nombre, setNombre] = useState("");
  const [acum, setAcum] = useState(1);
  const [pista, setPista] = useState(null);
  const [juego, setJuego] = useState(null);
  const [MenuJuego, setMenuJuego] = useState(0);

  const [listaJugadores, setListaJugadores] = useState([]);
  const [ListaConductores, setListaConductores] = useState([]);

  const eventHandle = (e) => {
    e.preventDefault();
  };

  const registrar = async () => {
    if (nombre !== "") {
      if (pista == null) {
        crearPista();
      }
      crearJugador();
    }
  };

  async function crearJugador() {
    const jugador = {
      nombre: nombre,
      turno: acum,
      juego: [],
    };

    const conductor = {
      nombre: nombre,
      noVecesGanado: 0,
      carro: {
        descripcion: listaColores[parseInt(getRandomArbitrary(0, 5))],
        avance: 0,
        posicion: acum,
      },
    };  
    setAcum(acum + 1);
    if (listaJugadores.filter((resp) => resp.nombre === nombre).length > 0) {
      alert("Nombre repetido");
    } else {
      setListaJugadores([...listaJugadores, jugador]);

      const resultado2 = await registrarService(conductor, "conductor");
      setListaConductores([...ListaConductores, resultado2]);
    }

  
  }

  async function crearPista() {
    const pista = {
      tamanio: 5,
      carriles: [],
    };

    const resultado = await registrarService(pista, "pista");

    if (resultado !== null) {
      setPista(resultado);
    }
  }

  async function crearJuego() {
    const juego = {
      pista: pista,
      jugadores: listaJugadores,
    };

    for (let i = 0; i < ListaConductores.length; i++) {
      const carril = {
        pista: {
          id: pista.id,
        },
        carro: {
          placa: ListaConductores[i].carro.placa,
        },
      };
      await registrarService(carril, "carril");
    }

    const resultado = await registrarService(juego, "juego");

    if (resultado !== null) {
      setJuego(resultado);
      setMenuJuego(1);
    }
  }

  const cambiarEstadoNombre = (event) => {
    setNombre(event.target.value);
  };

  return (
    <div className="container row g-3">
      {MenuJuego === 0 ? (
        <form className="row g-3" onSubmit={eventHandle}>
          <div className="col-md-4">
            <input
              type="text"
              className="form-control"
              placeholder="digite nombre"
              id="inputEmail4"
              onChange={cambiarEstadoNombre}
            />
          </div>
          <div className="col-md-2">
            <button
              className="btn btn-primary m-10 buttonMargin"
              onClick={registrar}
            >
              Registrar
            </button>
          </div>

          <div className="col-12">
            <table className="table table-dark col">
              <thead>
                <tr key={1}>
                  <th scope="col">Nombre</th>
                  <th scope="col">Turno</th>
                </tr>
              </thead>

              <tbody>
                {listaJugadores.map((jug, index) => (
                  <tr key={index}>
                    <td>{jug.nombre}</td>
                    <td>{jug.turno} </td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>

          <div className="col-12">
            <button
              className="btn btn-warning buttonVolver"
              onClick={crearJuego}
            >
              Iniciar Juego
            </button>
          </div>
        </form>
      ) : (
        <Juego juego={juego} />
      )}
    </div>
  );
}
