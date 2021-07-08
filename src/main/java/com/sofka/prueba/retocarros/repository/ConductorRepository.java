package com.sofka.prueba.retocarros.repository;

import com.sofka.prueba.retocarros.entity.Conductor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConductorRepository extends CrudRepository<Conductor, String> {
}
