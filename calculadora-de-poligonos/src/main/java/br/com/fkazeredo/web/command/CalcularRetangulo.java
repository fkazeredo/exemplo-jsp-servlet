package br.com.fkazeredo.web.command;

import br.com.fkazeredo.model.Poligono;
import br.com.fkazeredo.web.CalculoResposta;
import br.com.fkazeredo.model.TipoDePoligono;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

public class CalcularRetangulo extends AcaoPoligono {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse res) throws Exception {
        String base = req.getParameter("base");
        if (base == null || "".equals(base))
            res.sendError(HttpServletResponse.SC_BAD_REQUEST);
        String altura = req.getParameter("altura");
        if (altura == null || "".equals(altura))
            res.sendError(HttpServletResponse.SC_BAD_REQUEST);
        Poligono poligono = poligonoService.calcularRetangulo(new BigDecimal(base), new BigDecimal(altura));
        req.setAttribute("resposta",  new CalculoResposta(poligono.getArea(), poligono.getArestas()));
        adicionarTitulo(TipoDePoligono.RETANGULO, req);
        return "/pages/retangulo.jsp";
    }
}
