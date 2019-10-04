package com.fkazeredo.persistence;

import com.fkazeredo.model.Poligono;

import java.util.Set;

public interface PoligonoRepository {

    Set<Poligono> buscarTudo();

    void save(Poligono poligono);

}
