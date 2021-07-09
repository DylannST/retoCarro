import React, { useState } from "react";
import "./Menu.css";
import Registro from "./Registro";
import Consulta from "./Consulta";

export default function Menu() {
 
  const [MenuJuego, setMenuJuego] = useState(0);

  const cambiarEstado = (estado) => {
    setMenuJuego(estado);
  };

  return (
    <div>
      {MenuJuego}
      {MenuJuego === 0 ? (
        <div className="container">
          <div>
            <h1>Menu</h1>
          </div>
          <div>
            <button
              className="btn btn-success btn1 buttons"
              onClick={()=>cambiarEstado(1)}
            >
              Registro
            </button>

            <button
              className="btn btn-warning buttons"
              onClick={()=>cambiarEstado(2)}
            >
              {" "}
              Consultar veces ganadas
            </button>
          </div>
        </div>
      ) : MenuJuego === 1 ? (
        <Registro />
      ) : (
        <Consulta />
      )}
    </div>
  );
}
