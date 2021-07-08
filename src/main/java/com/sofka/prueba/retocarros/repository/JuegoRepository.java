package com.sofka.prueba.retocarros.repository;


import com.sofka.prueba.retocarros.entity.Juego;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegoRepository extends CrudRepository<Juego, Long> {
}
