package br.com.fkazeredo.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Triangulo extends Poligono {

    private static final Integer ARESTAS = 3;
    private BaseEAltura baseEAltura;

    public Triangulo(BigDecimal base, BigDecimal altura) {
        super(ARESTAS);
        baseEAltura = new BaseEAltura(base, altura);
    }

    @Override
    protected BigDecimal calcularArea() {
        return baseEAltura.getBaseVezesAltura().divide(new BigDecimal(2), 2, RoundingMode.HALF_EVEN);
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
        Triangulo triangulo = (Triangulo) o;
        return baseEAltura.equals(triangulo.baseEAltura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), baseEAltura);
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "baseEAltura=" + baseEAltura +
                ", arestas=" + arestas +
                '}';
    }
}
