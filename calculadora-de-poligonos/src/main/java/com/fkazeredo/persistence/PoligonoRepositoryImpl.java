package com.fkazeredo.persistence;

import com.fkazeredo.model.Poligono;

import java.util.HashSet;
import java.util.Set;

class PoligonoRepositoryImpl implements PoligonoRepository {

    private static PoligonoRepositoryImpl instancia;

    private Set<Poligono> poligonos;

    private PoligonoRepositoryImpl() {
        poligonos = new HashSet<>();
    }

    public static PoligonoRepositoryImpl getInstancia() {
        if (instancia == null)
            instancia = new PoligonoRepositoryImpl();
        return instancia;
    }

    @Override
    public Set<Poligono> buscarTudo() {
        return poligonos;
    }

    @Override
    public void save(Poligono poligono) {
        poligonos.add(poligono);
    }

}
