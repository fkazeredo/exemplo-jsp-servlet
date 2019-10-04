package com.fkazeredo.web;

import java.math.BigDecimal;

public class CalculoResposta {

    private BigDecimal area;
    private Integer arestas;

    public CalculoResposta() {
    }

    public CalculoResposta(BigDecimal area, Integer arestas) {
        this.area = area;
        this.arestas = arestas;
    }

    public BigDecimal getArea() {
        return area;
    }

    public Integer getArestas() {
        return arestas;
    }
}
