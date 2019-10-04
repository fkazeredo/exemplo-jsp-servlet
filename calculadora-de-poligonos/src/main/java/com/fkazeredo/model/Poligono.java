package com.fkazeredo.model;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Poligono {

    protected Integer arestas;

    public Poligono(Integer arestas) {
        this.arestas = arestas;
    }

    protected abstract BigDecimal calcularArea();

    public BigDecimal getArea() {
        return calcularArea();
    }

    public Integer getArestas() {
        return arestas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poligono poligono = (Poligono) o;
        return arestas.equals(poligono.arestas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arestas);
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "arestas=" + arestas +
                '}';
    }
}
