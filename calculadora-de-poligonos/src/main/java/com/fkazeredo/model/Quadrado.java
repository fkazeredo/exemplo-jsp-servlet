package com.fkazeredo.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Quadrado extends Poligono {

    private static final Integer ARESTAS = 4;

    private BigDecimal lado;

    public Quadrado(BigDecimal lado) {
        super(ARESTAS);
        if (lado == null || lado.equals(new BigDecimal(0)))
            throw new IllegalArgumentException("Lado não pode ser nula ou igual a zero");
        this.lado = lado;
    }

    @Override
    protected BigDecimal calcularArea() {
        return lado.pow(2).setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal getLado() {
        return lado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Quadrado quadrado = (Quadrado) o;
        return lado.equals(quadrado.lado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lado);
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                ", arestas=" + arestas +
                '}';
    }
}
