package br.com.fkazeredo.model;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class QuadradoTest {

    @Test
    public void deveCriarUmQuadrado() {
        Quadrado quadrado = new Quadrado(
                new BigDecimal(4)
        );
        assertNotNull(quadrado);
        assertEquals(new BigDecimal(4), quadrado.getLado());
        assertEquals(new Integer(4), quadrado.getArestas());
    }

    @Test
    public void deveCalcularAreaDeUmQuadrado() {
        Quadrado quadrado = new Quadrado(
                new BigDecimal(4)
        );
        BigDecimal resultado = quadrado.getArea();
        assertEquals(new BigDecimal(16).setScale(2, RoundingMode.HALF_EVEN), resultado);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmQuadrado_ladoEstaNulo() {
        new Quadrado(
                null
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmQuadrado_ladoPossuiValorZero() {
        new Quadrado(
                new BigDecimal(0.)
        );
    }

}
