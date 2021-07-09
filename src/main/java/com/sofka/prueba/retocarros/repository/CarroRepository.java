package com.sofka.prueba.retocarros.repository;


import com.sofka.prueba.retocarros.entity.Carro;
import com.sofka.prueba.retocarros.entity.DtoJuego;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CarroRepository extends CrudRepository<Carro, String> {

    @Modifying
    @Transactional
    @Query(value = "UPDATE carro as c INNER JOIN conductor as co ON c.placa=co.placa_carro set c.avance=c.avance+(?1*100) where co.nombre=?2", nativeQuery = true)
    void actualizarCarro(Long avance, String nombre);

    @Query(value = "SELECT * FROM carro", nativeQuery = true)
    Iterable<Carro> consultaCarros();

    @Modifying
    @Transactional
    @Query(value = "UPDATE carro as c SET c.posicion=?1 WHERE c.placa=?2", nativeQuery = true)
    void actualizarPosicion(Long posicion, String placa);


    @Query(value = "SELECT con.nombre AS nombre,ca.placa AS placa,ca.avance AS avance,ca.posicion AS \"posicion\" from juego as j \n" +
            "INNER JOIN juego_jugador as jj on j.numero_juego=jj.id_juego\n" +
            "INNER JOIN jugador as ju ON ju.nombre=jj.id_jugador INNER JOIN pista as p ON\n" +
            "p.id=j.id_pista INNER JOIN carril as c ON c.numero_pista=p.id INNER JOIN carro as ca ON\n" +
            "ca.placa=c.placa_carro INNER JOIN conductor as con ON con.placa_carro=ca.placa\n" +
            "WHERE j.numero_juego=?1\n" +
            "GROUP BY ca.posicion\n" +
            "ORDER BY ca.posicion ASC", nativeQuery = true)
    List<Object[]> obtenerCarrosJuego(Long juego);

}
