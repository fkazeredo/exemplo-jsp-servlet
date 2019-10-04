package br.com.fkazeredo.services;

import br.com.fkazeredo.model.Poligono;

import java.math.BigDecimal;
import java.util.Set;

public interface PoligonoService {

    Poligono calcularCirculo(BigDecimal raio);

    Poligono calcularLosango(BigDecimal diagonalMaior, BigDecimal diagonalMenor);

    Poligono calcularParalelogramo(BigDecimal base, BigDecimal altura);

    Poligono calcularQuadrado(BigDecimal lado);

    Poligono calcularRetangulo(BigDecimal base, BigDecimal altura);

    Poligono calcularTrapezio(BigDecimal baseMaior, BigDecimal baseMenor, BigDecimal altura);

    Poligono calcularTriangulo(BigDecimal base, BigDecimal altura);

    Set<Poligono> buscarHistorico();

}
