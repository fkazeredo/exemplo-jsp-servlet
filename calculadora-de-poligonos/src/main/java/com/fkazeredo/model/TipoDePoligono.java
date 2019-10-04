package com.fkazeredo.model;

public enum TipoDePoligono {

    CIRCULO("Círculo"),
    LOSANGO("Losango"),
    PARALELOGRAMO("Paralelogramo"),
    QUADRADO("Quadrado"),
    RETANGULO("Retangulo"),
    TRAPEZIO("Trapezio"),
    TRIANGULO("Triangulo");

    private String descricao;

    TipoDePoligono(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "TipoDePoligono{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
