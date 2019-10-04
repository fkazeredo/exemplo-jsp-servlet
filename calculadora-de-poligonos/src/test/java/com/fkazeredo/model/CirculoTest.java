package com.fkazeredo.model;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CirculoTest {

    @Test
    public void deveCriarUmCirculo() {
        Circulo circulo = new Circulo(
                new BigDecimal(4)
        );
        assertNotNull(circulo);
        assertEquals(new BigDecimal(4), circulo.getRaio());
        assertEquals(new Integer(0), circulo.getArestas());
    }

    @Test
    public void deveCalcularAreaDeUmCirculo() {
        Circulo circulo = new Circulo(
                new BigDecimal(4)
        );
        BigDecimal resultado = circulo.getArea();
        assertEquals(new BigDecimal(157.91).setScale(2, BigDecimal.ROUND_HALF_EVEN), resultado);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmCirculo_raioEstaNulo() {
        new Circulo(
                null
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmCirculo_raioPossuiValorZero() {
        new Circulo(
                new BigDecimal(0.)
        );
    }
    
}
