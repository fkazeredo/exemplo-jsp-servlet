package com.fkazeredo.model;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ParalelogramoTest {

    @Test
    public void deveCriarUmParalelogramo() {
        Paralelogramo paralelogramo = new Paralelogramo(
                new BigDecimal(3),
                new BigDecimal(6)
        );
        assertNotNull(paralelogramo);
        assertEquals(new BigDecimal(3), paralelogramo.getBase());
        assertEquals(new BigDecimal(6), paralelogramo.getAltura());
        assertEquals(new Integer(4), paralelogramo.getArestas());
    }

    @Test
    public void deveCalcularAreaDeUmParalelogramo() {
        Paralelogramo paralelogramo = new Paralelogramo(
                new BigDecimal(3),
                new BigDecimal(6)
        );
        assertEquals(new BigDecimal(18).setScale(2, RoundingMode.HALF_EVEN), paralelogramo.getArea());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmParalelogramo_baseEstaNula(){
        new Paralelogramo(
                null,
                new BigDecimal(6)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmParalelogramo_basePossuiValorZero(){
        new Paralelogramo(
                new BigDecimal(0),
                new BigDecimal(6)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmParalelogramo_alturaEstaNula(){
        new Paralelogramo(
                new BigDecimal(3),
                null
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmParalelogramo_alturaPossuiValorZero(){
        new Paralelogramo(
                new BigDecimal(3),
                new BigDecimal(0)
        );
    }

}
