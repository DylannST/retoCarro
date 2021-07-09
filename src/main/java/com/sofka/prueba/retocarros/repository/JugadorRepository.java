package com.sofka.prueba.retocarros.repository;

import com.sofka.prueba.retocarros.entity.Jugador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends CrudRepository<Jugador, String> {

    @Query(value ="SELECT ju.nombre AS nombre,ju.turno AS turno from juego as j \n" +
            "INNER JOIN juego_jugador as jj on j.numero_juego=jj.id_juego\n" +
            "INNER JOIN jugador as ju ON ju.nombre=jj.id_jugador\n" +
            "where j.numero_juego=?1",nativeQuery = true)
    Iterable<Object[]> obtenerJugadoresPorJuego(Long juego);
}
