package com.fkazeredo.model;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RetanguloTest {

    @Test
    public void deveCriarUmRetangulo() {
        Retangulo retangulo = new Retangulo(
                new BigDecimal(3),
                new BigDecimal(6)
        );
        assertNotNull(retangulo);
        assertEquals(new BigDecimal(3), retangulo.getBase());
        assertEquals(new BigDecimal(6), retangulo.getAltura());
        assertEquals(new Integer(4), retangulo.getArestas());
    }

    @Test
    public void deveCalcularAreaDeUmRetangulo() {
        Retangulo retangulo = new Retangulo(
                new BigDecimal(3),
                new BigDecimal(6)
        );
        assertEquals(new BigDecimal(18).setScale(2, RoundingMode.HALF_EVEN), retangulo.getArea());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmRetangulo_baseEstaNula(){
        new Retangulo(
                null,
                new BigDecimal(6)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmRetangulo_basePossuiValorZero(){
        new Retangulo(
                new BigDecimal(0),
                new BigDecimal(6)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmRetangulo_alturaEstaNula(){
        new Retangulo(
                new BigDecimal(3),
                null
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmRetangulo_alturaPossuiValorZero(){
        new Retangulo(
                new BigDecimal(3),
                new BigDecimal(0)
        );
    }

}
