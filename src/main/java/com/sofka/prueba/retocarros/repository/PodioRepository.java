package com.sofka.prueba.retocarros.repository;

import com.sofka.prueba.retocarros.entity.Podio;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PodioRepository extends CrudRepository<Podio, Integer> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO podio (codigo_podio, puesto,nombre_jugador)\n" +
            "  VALUES (1, ?1, ?2);", nativeQuery = true)
    void guardarPodio(int puesto, String nombre);
}
