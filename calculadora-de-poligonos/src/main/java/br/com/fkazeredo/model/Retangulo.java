package br.com.fkazeredo.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Retangulo extends Poligono {

    private static final Integer ARESTAS = 4;
    private BaseEAltura baseEAltura;

    public Retangulo(BigDecimal base, BigDecimal altura) {
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
        if (!super.equals(o)) return false;
        Retangulo retangulo = (Retangulo) o;
        return baseEAltura.equals(retangulo.baseEAltura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), baseEAltura);
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "baseEAltura=" + baseEAltura +
                ", arestas=" + arestas +
                '}';
    }
}
