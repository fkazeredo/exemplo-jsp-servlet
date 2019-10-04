package com.fkazeredo.model;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LosangoTest {

    @Test
    public void deveCriarUmLosango() {
        Losango losango = new Losango(
                new BigDecimal(3),
                new BigDecimal(6)
        );
        assertNotNull(losango);
        assertEquals(new BigDecimal(3), losango.getDiagonalMaior());
        assertEquals(new BigDecimal(6), losango.getDiagonalMenor());
        assertEquals(new Integer(4), losango.getArestas());
    }

    @Test
    public void deveCalcularAreaDeUmLosango() {
        Losango losango = new Losango(
                new BigDecimal(3),
                new BigDecimal(6)
        );
        assertEquals(new BigDecimal(9).setScale(2, RoundingMode.HALF_EVEN), losango.getArea());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmLosango_diagonalMaiorEstaNula(){
        new Losango(
                null,
                new BigDecimal(6)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmLosango_diagonalMaiorPossuiValorZero(){
        new Losango(
                new BigDecimal(0),
                new BigDecimal(6)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmLosango_diagonalMenorEstaNula(){
        new Losango(
                new BigDecimal(3),
                null
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmLosango_diagonalMenorPossuiValorZero(){
        new Losango(
                new BigDecimal(3),
                new BigDecimal(0)
        );
    }
    
}
