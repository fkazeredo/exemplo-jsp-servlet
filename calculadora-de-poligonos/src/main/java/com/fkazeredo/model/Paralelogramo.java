package com.fkazeredo.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Paralelogramo extends Poligono {

    private static final Integer ARESTAS = 4;
    private BaseEAltura baseEAltura;

    public Paralelogramo(BigDecimal base, BigDecimal altura) {
        super(ARESTAS);
        baseEAltura = new BaseEAltura(base, altura);
    }

    @Override
    protected BigDecimal calcularArea() {
        return baseEAltura.getBaseVezesAltura();
    }

    public BigDecimal getBase(){
       return baseEAltura.getBase();
    }

    public BigDecimal getAltura(){
        return baseEAltura.getAltura();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paralelogramo that = (Paralelogramo) o;
        return baseEAltura.equals(that.baseEAltura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseEAltura);
    }

    @Override
    public String toString() {
        return "Paralelogramo{" +
                "baseEAltura=" + baseEAltura +
                ", arestas=" + arestas +
                '}';
    }
}
