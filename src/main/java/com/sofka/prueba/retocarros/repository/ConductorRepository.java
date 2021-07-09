package com.sofka.prueba.retocarros.repository;

import com.sofka.prueba.retocarros.entity.Conductor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ConductorRepository extends CrudRepository<Conductor, String> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE conductor\n" +
            "SET no_veces_ganado = no_veces_ganado + 1\n" +
            "WHERE nombre=?1", nativeQuery = true)
    void actualizarNoVecesGanado(String nombre);
}
