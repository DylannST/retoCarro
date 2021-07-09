import React from "react";
import "./Menu.css";
export default function Juego() {

  
  return (
    <div className="container">
      <form className="row g-3">
        <div className="col-12">
          <p className="pJuego">Juego: 34783478</p>
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
              <tr>
                <td>jose</td>
                <td>1000</td>
                <td>1000</td>
                <td>1</td>
              </tr>
              <tr>
                <td>jose</td>
                <td>1000</td>
                <td>1000</td>
                <td>1</td>
              </tr>
              <tr>
                <td>jose</td>
                <td>1000</td>
                <td>1000</td>
                <td>1</td>
              </tr>
              <tr>
                <td>jose</td>
                <td>1000</td>
                <td>1000</td>
                <td>1</td>
              </tr>
              <tr>
                <td>jose</td>
                <td>1000</td>
                <td>1000</td>
                <td>1</td>
              </tr>
            </tbody>
          </table>
        </div>
        <div className="col-6">
          <p className="pMeta">Meta: 34783478km</p>
        </div>

        <div className="col-4">
          <label for="inputPassword4" className="form-label">
            El turno siguente:
          </label>
          <p className="pGanadas">5</p>
        </div>
        <div className="col-4 mt-30">
          <button className="btn btn-success m-10 buttonMargin">
            Comenzar
          </button>
        </div>
        <div className="col-4">
          <button className="btn btn-warning m-10 buttonMargin">
            Lanzar dado
          </button>
          <p className="pGanadas">5</p>
        </div>

        <div className="col-12">
          <button className="btn btn-info buttonVolver">
            Ver podio
          </button>
        </div>
      </form>
    </div>
  );
}
