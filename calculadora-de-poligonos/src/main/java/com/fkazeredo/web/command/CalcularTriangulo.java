package com.fkazeredo.web.command;

import com.fkazeredo.model.Poligono;
import com.fkazeredo.model.TipoDePoligono;
import com.fkazeredo.web.CalculoResposta;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

public class CalcularTriangulo extends AcaoPoligono {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse res) throws Exception {
        String base = req.getParameter("base");
        if (base == null || "".equals(base))
            res.sendError(HttpServletResponse.SC_BAD_REQUEST);
        String altura = req.getParameter("altura");
        if (altura == null || "".equals(altura))
            res.sendError(HttpServletResponse.SC_BAD_REQUEST);
        Poligono poligono = poligonoService.calcularTriangulo(new BigDecimal(base), new BigDecimal(altura));
        req.setAttribute("resposta",  new CalculoResposta(poligono.getArea(), poligono.getArestas()));
        adicionarTitulo(TipoDePoligono.TRIANGULO, req);
        return "/pages/triangulo.jsp";
    }
}
