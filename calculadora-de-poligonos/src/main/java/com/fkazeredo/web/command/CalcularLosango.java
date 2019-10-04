package com.fkazeredo.web.command;

import com.fkazeredo.model.Poligono;
import com.fkazeredo.model.TipoDePoligono;
import com.fkazeredo.web.CalculoResposta;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

public class CalcularLosango extends AcaoPoligono {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse res) throws Exception {
        String diagonalMaior = req.getParameter("diagonalMaior");
        if (diagonalMaior == null || "".equals(diagonalMaior))
            res.sendError(HttpServletResponse.SC_BAD_REQUEST);
        String diagonalMenor = req.getParameter("diagonalMenor");
        if (diagonalMenor == null || "".equals(diagonalMenor))
            res.sendError(HttpServletResponse.SC_BAD_REQUEST);
        Poligono poligono = poligonoService.calcularLosango(new BigDecimal(diagonalMaior), new BigDecimal(diagonalMenor));
        req.setAttribute("resposta", new CalculoResposta(poligono.getArea(), poligono.getArestas()));
        adicionarTitulo(TipoDePoligono.LOSANGO, req);
        return "/pages/losango.jsp";
    }
}
