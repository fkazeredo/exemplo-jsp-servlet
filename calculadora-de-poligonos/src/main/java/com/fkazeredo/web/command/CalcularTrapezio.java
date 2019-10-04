package com.fkazeredo.web.command;

import com.fkazeredo.model.Poligono;
import com.fkazeredo.model.TipoDePoligono;
import com.fkazeredo.web.CalculoResposta;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

public class CalcularTrapezio extends AcaoPoligono {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse res) throws Exception {
        String baseMaior = req.getParameter("baseMaior");
        if (baseMaior == null || "".equals(baseMaior))
            res.sendError(HttpServletResponse.SC_BAD_REQUEST);
        String baseMenor = req.getParameter("baseMenor");
        if (baseMenor == null || "".equals(baseMenor))
            res.sendError(HttpServletResponse.SC_BAD_REQUEST);
        String altura = req.getParameter("altura");
        if (altura == null || "".equals(altura))
            res.sendError(HttpServletResponse.SC_BAD_REQUEST);
        Poligono poligono = poligonoService.calcularTrapezio(new BigDecimal(baseMaior), new BigDecimal(baseMenor), new BigDecimal(altura));
        req.setAttribute("resposta",  new CalculoResposta(poligono.getArea(), poligono.getArestas()));
        adicionarTitulo(TipoDePoligono.TRAPEZIO, req);
        return "/pages/trapezio.jsp";
    }
}
