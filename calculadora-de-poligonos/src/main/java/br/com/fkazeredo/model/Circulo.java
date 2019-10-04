package br.com.fkazeredo.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Circulo extends Poligono {

    private static final Integer ARESTAS = 0;
    private static final BigDecimal PI = new BigDecimal(3.1416);
    private BigDecimal raio;

    public Circulo(BigDecimal raio) {
        super(ARESTAS);
        if (raio == null || raio.equals(new BigDecimal(0)))
            throw new IllegalArgumentException("Raio não pode ser nula ou igual a zero");
        this.raio = raio;
    }

    @Override
    protected BigDecimal calcularArea() {
        return PI.multiply(raio).pow(2).setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    public BigDecimal getRaio() {
        return raio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return raio.equals(circulo.raio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
