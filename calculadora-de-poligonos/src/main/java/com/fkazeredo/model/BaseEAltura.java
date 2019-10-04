package com.fkazeredo.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class BaseEAltura {

    private BigDecimal base;
    private BigDecimal altura;

    public BaseEAltura(BigDecimal base, BigDecimal altura) {
        if (base == null || base.equals(new BigDecimal(0)))
            throw new IllegalArgumentException("Base não pode ser nula ou igual a zero");
        if (altura == null || altura.equals(new BigDecimal(0)))
            throw new IllegalArgumentException("Altura não pode ser nula ou igual a zero");
        this.base = base;
        this.altura = altura;
    }

    protected BigDecimal getBaseVezesAltura(){
        return base.multiply(altura).setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal getBase() {
        return base;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEAltura that = (BaseEAltura) o;
        return base.equals(that.base) &&
                altura.equals(that.altura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, altura);
    }

    @Override
    public String toString() {
        return "BaseEAltura{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
