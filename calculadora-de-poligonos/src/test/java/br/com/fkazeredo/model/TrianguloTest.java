package br.com.fkazeredo.model;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TrianguloTest {

    @Test
    public void deveCriarUmTriangulo() {
        Triangulo triangulo = new Triangulo(
                new BigDecimal(3),
                new BigDecimal(6)
        );
        assertNotNull(triangulo);
        assertEquals(new BigDecimal(3), triangulo.getBase());
        assertEquals(new BigDecimal(6), triangulo.getAltura());
        assertEquals(new Integer(3), triangulo.getArestas());
    }

    @Test
    public void deveCalcularAreaDeUmTriangulo() {
        Triangulo triangulo = new Triangulo(
                new BigDecimal(3),
                new BigDecimal(6)
        );
        assertEquals(new BigDecimal(9).setScale(2, RoundingMode.HALF_EVEN), triangulo.getArea());
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmTriangulo_baseEstaNula(){
        new Triangulo(
                null,
                new BigDecimal(6)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmTriangulo_basePossuiValorZero(){
        new Triangulo(
                new BigDecimal(0),
                new BigDecimal(6)
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmTriangulo_alturaEstaNula(){
        new Triangulo(
                new BigDecimal(3),
                null
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveCriarUmTriangulo_alturaPossuiValorZero(){
        new Triangulo(
                new BigDecimal(3),
                new BigDecimal(0)
        );
    }

}
