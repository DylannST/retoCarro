package com.sofka.prueba.retocarros.repository;


import com.sofka.prueba.retocarros.entity.Pista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PistaRepository extends CrudRepository<Pista, String> {
}
