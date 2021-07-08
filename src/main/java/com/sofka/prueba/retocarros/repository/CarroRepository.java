package com.sofka.prueba.retocarros.repository;


import com.sofka.prueba.retocarros.entity.Carro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends CrudRepository<Carro, String> {
}
