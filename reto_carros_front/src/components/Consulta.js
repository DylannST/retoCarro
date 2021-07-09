import React, { useState } from "react";
import "./Menu.css";
import { consultarJugador } from "../service/JuegoService";

export default function Consulta() {
  const [nombre, setNombre] = useState("");
  const [resultado, setResultado] = useState(null);
  const consultar = async (e) => {
    e.preventDefault();
    if (nombre !== "") {
      const resultado = await consultarJugador(nombre);
      if (resultado !== null) {
        setResultado(resultado);
      }
    }
  };
  const cambiarEstadoNombre = (event) => {
    setNombre(event.target.value);
  };

  const volver = () => {
    window.location = "/";
  };

  return (
    <div className="container ">
      <form className="row g-3" onSubmit={consultar}>
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
          <button className="btn btn-primary m-10 buttonMargin">
            consultar
          </button>
        </div>
        {resultado !== null && (
          <div className="col-md-4">
            <label className="form-label">Numero de veces ganado</label>
            <p className="pGanadas">{resultado.noVecesGanado}</p>
          </div>
        )}
        <div className="col-12">
          <button
            className="btn btn-danger buttonVolver"
            onClick={() => volver()}
          >
            Volver
          </button>
        </div>
      </form>
    </div>
  );
}
