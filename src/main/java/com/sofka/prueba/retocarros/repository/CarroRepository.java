package com.sofka.prueba.retocarros.repository;


import com.sofka.prueba.retocarros.entity.Carro;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

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

}
