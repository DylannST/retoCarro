package com.sofka.prueba.retocarros.repository;

import com.sofka.prueba.retocarros.entity.Podio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodioRepository extends CrudRepository<Podio, Integer> {
}
