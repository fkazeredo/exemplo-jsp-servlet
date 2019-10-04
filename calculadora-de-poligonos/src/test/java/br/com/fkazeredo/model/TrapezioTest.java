package br.com.fkazeredo.model;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TrapezioTest {

    @Test
    public void deveCriarUmTrapezio() {
        Trapezio trapezio = new Trapezio(
                new BigDecimal(3),
                new BigDecimal(6),
                new BigDecimal(4)
        );
        assertNotNull(trapezio);
        assertEquals(new BigDecimal(3), trapezio.getBaseMaior());
        assertEquals(new BigDecimal(6), trapezio.getBaseMenor());
        assertEquals(new BigDecimal(4), trapezio.getAltura());
        assertEquals(new Integer(4), trapezio.getArestas());
    }

    @Test
    public void deveCalcularAreaDeUmTrapezio() {
        Trapezio trapezio = new Trapezio(
                new BigDecimal(3),
                new BigDecimal(6),
                new BigDecimal(4)
        );
        assertEquals(new BigDecimal(18).setScale(2, RoundingMode.HALF_EVEN), trapezio.getArea());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmTrapezio_baseMaiorEstaNula(){
        new Trapezio(
                null,
                new BigDecimal(6),
                new BigDecimal(4)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmTrapezio_baseMaiorPossuiValorZero(){
        new Trapezio(
                new BigDecimal(0),
                new BigDecimal(6),
                new BigDecimal(4)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmTrapezio_baseMenorEstaNula(){
        new Trapezio(
                new BigDecimal(3),
                null,
                new BigDecimal(4)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmTrapezio_baseMenorPossuiValorZero(){
        new Trapezio(
                new BigDecimal(3),
                new BigDecimal(0),
                new BigDecimal(4)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmTrapezio_alturaEstaNula(){
        new Trapezio(
                new BigDecimal(3),
                new BigDecimal(6),
               null
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmTrapezio_alturaPossuiValorZero(){
        new Trapezio(
                new BigDecimal(3),
                new BigDecimal(6),
                new BigDecimal(0)
        );
    }
    
}
