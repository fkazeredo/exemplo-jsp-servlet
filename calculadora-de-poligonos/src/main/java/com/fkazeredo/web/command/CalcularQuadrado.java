package com.fkazeredo.web.command;

import com.fkazeredo.model.Poligono;
import com.fkazeredo.web.CalculoResposta;
import com.fkazeredo.model.TipoDePoligono;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

public class CalcularQuadrado extends AcaoPoligono {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse res) throws Exception {
        String lado = req.getParameter("lado");
        if (lado == null || "".equals(lado))
            res.sendError(HttpServletResponse.SC_BAD_REQUEST);
        Poligono poligono = poligonoService.calcularQuadrado(new BigDecimal(lado));
        req.setAttribute("resposta",  new CalculoResposta(poligono.getArea(), poligono.getArestas()));
        adicionarTitulo(TipoDePoligono.QUADRADO, req);
        return "/pages/quadrado.jsp";
    }
}
