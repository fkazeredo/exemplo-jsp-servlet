package com.fkazeredo.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Trapezio extends Poligono {

    private static final Integer ARESTAS = 4;
    private BigDecimal baseMaior;
    private BigDecimal baseMenor;
    private BigDecimal altura;

    public Trapezio(BigDecimal baseMaior, BigDecimal baseMenor, BigDecimal altura) {
        super(ARESTAS);
        if (baseMaior == null || baseMaior.equals(new BigDecimal(0)))
            throw new IllegalArgumentException("Base Maior não pode ser nula ou igual a zero");
        if (baseMenor == null || baseMenor.equals(new BigDecimal(0)))
            throw new IllegalArgumentException("Base Menor não pode ser nula ou igual a zero");
        if (altura == null || altura.equals(new BigDecimal(0)))
            throw new IllegalArgumentException("Altura não pode ser nula ou igual a zero");
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    protected BigDecimal calcularArea() {
        return baseMaior.add(baseMenor).multiply(altura).divide(new BigDecimal(2), 2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal getBaseMaior() {
        return baseMaior;
    }

    public BigDecimal getBaseMenor() {
        return baseMenor;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Trapezio trapezio = (Trapezio) o;
        return baseMaior.equals(trapezio.baseMaior) &&
                baseMenor.equals(trapezio.baseMenor) &&
                altura.equals(trapezio.altura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), baseMaior, baseMenor, altura);
    }

    @Override
    public String toString() {
        return "Trapezio{" +
                "baseMaior=" + baseMaior +
                ", baseMenor=" + baseMenor +
                ", altura=" + altura +
                ", arestas=" + arestas +
                '}';
    }
}
