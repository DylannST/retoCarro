package com.sofka.prueba.retocarros.repository;

import com.sofka.prueba.retocarros.entity.Carril;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrilRepository extends CrudRepository<Carril, Long> {
}
