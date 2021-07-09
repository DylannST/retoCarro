const urlBase = "http://localhost:8080/api/";

export const consultarJugador = async (nombre) => {
  try {
    const result = await fetch(urlBase + `conductor/${nombre}`, {
      method: "GET",
      headers: { "Content-type": "application/json" },
    });
    return await result.json();
  } catch (error) {
    console.log(error);
    return null;
  }
};
export const registrarService = async (body, url) => {
  try {
    const result = await fetch(urlBase + url, {
      method: "POST",
      headers: { "Content-type": "application/json" },
      body: JSON.stringify(body),
    });
    return await result.json();
  } catch (error) {
    console.log(error);
    return null;
  }
};

export const consultaJuego = async (body, url) => {
  try {
    const result = await fetch(urlBase + url, {
      method: "POST",
      headers: { "Content-type": "application/json" },
      body: JSON.stringify(body),
    });
    return await result.json();
  } catch (error) {
    console.log(error);
    return null;
  }
};

export const consultarTabla = async (url) => {
  try {
    const result = await fetch(urlBase + url, {
      method: "GET",
      headers: { "Content-type": "application/json" },
    });
    return await result.json();
  } catch (error) {
    console.log(error);
    return null;
  }
};
