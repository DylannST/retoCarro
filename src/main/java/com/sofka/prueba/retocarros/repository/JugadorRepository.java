package com.sofka.prueba.retocarros.repository;

import com.sofka.prueba.retocarros.entity.Jugador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends CrudRepository<Jugador, String> {
}
