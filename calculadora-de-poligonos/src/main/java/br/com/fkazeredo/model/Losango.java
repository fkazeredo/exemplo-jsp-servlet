package br.com.fkazeredo.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Losango extends Poligono {

    private static final Integer ARESTAS = 4;
    private BigDecimal diagonalMaior;
    private BigDecimal diagonalMenor;

    public Losango(BigDecimal diagonalMaior, BigDecimal diagonalMenor) {
        super(ARESTAS);
        if (diagonalMaior == null || diagonalMaior.equals(new BigDecimal(0)))
            throw new IllegalArgumentException("Diagonal Maior não pode ser nula ou igual a zero");
        if (diagonalMenor == null || diagonalMenor.equals(new BigDecimal(0)))
            throw new IllegalArgumentException("Diagonal Menor não pode ser nula ou igual a zero");
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    protected BigDecimal calcularArea() {
        return diagonalMaior.multiply(diagonalMenor).divide(new BigDecimal(2), 2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal getDiagonalMaior() {
        return diagonalMaior;
    }

    public BigDecimal getDiagonalMenor() {
        return diagonalMenor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Losango losango = (Losango) o;
        return diagonalMaior.equals(losango.diagonalMaior) &&
                diagonalMenor.equals(losango.diagonalMenor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diagonalMaior, diagonalMenor);
    }

    @Override
    public String toString() {
        return "Losango{" +
                "diagonalMaior=" + diagonalMaior +
                ", diagonalMenor=" + diagonalMenor +
                ", arestas=" + arestas +
                '}';
    }
}
