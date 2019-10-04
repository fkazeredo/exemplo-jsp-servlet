package br.com.fkazeredo.services;

import br.com.fkazeredo.persistence.PoligonoRepository;
import br.com.fkazeredo.model.*;

import java.math.BigDecimal;
import java.util.Set;

class PoligonoServiceImpl implements PoligonoService {

    private final PoligonoRepository poligonoRepository;

    public PoligonoServiceImpl(PoligonoRepository poligonoRepository) {
        this.poligonoRepository = poligonoRepository;
    }

    @Override
    public Poligono calcularCirculo(BigDecimal raio) {
        Circulo circulo = new Circulo(raio);
        poligonoRepository.save(circulo);
        return circulo;
    }

    @Override
    public Poligono calcularLosango(BigDecimal diagonalMaior, BigDecimal diagonalMenor) {
        Losango losango = new Losango(diagonalMaior, diagonalMenor);
        poligonoRepository.save(losango);
        return losango;
    }

    @Override
    public Poligono calcularParalelogramo(BigDecimal base, BigDecimal altura) {
        Paralelogramo paralelogramo = new Paralelogramo(base, altura);
        poligonoRepository.save(paralelogramo);
        return paralelogramo;
    }

    @Override
    public Poligono calcularQuadrado(BigDecimal lado) {
        Quadrado quadrado = new Quadrado(lado);
        poligonoRepository.save(quadrado);
        return quadrado;
    }

    @Override
    public Poligono calcularRetangulo(BigDecimal base, BigDecimal altura) {
        Retangulo retangulo = new Retangulo(base, altura);
        poligonoRepository.save(retangulo);
        return retangulo;
    }

    @Override
    public Poligono calcularTrapezio(BigDecimal baseMaior, BigDecimal baseMenor, BigDecimal altura) {
        Trapezio trapezio = new Trapezio(baseMaior, baseMenor, altura);
        poligonoRepository.save(trapezio);
        return trapezio;
    }

    @Override
    public Poligono calcularTriangulo(BigDecimal base, BigDecimal altura) {
        Triangulo triangulo = new Triangulo(base, altura);
        poligonoRepository.save(triangulo);
        return triangulo;
    }

    @Override
    public Set<Poligono> buscarHistorico() {
        return poligonoRepository.buscarTudo();
    }
}
