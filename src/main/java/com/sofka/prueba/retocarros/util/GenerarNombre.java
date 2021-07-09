package com.sofka.prueba.retocarros.util;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

import static com.sofka.prueba.retocarros.util.GeneradorRamdon.palabraAleatoria;

public class GenerarNombre implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        return palabraAleatoria(3);
    }
}
