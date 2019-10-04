package br.com.fkazeredo.web.command;

import br.com.fkazeredo.model.Poligono;
import br.com.fkazeredo.model.TipoDePoligono;
import br.com.fkazeredo.web.CalculoResposta;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

public class CalcularCirculo extends AcaoPoligono {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse res) throws Exception {
        String raio = req.getParameter("raio");
        if (raio == null || "".equals(raio))
            res.sendError(HttpServletResponse.SC_BAD_REQUEST);
        Poligono poligono = poligonoService.calcularCirculo(new BigDecimal(raio));
        req.setAttribute("resposta", new CalculoResposta(poligono.getArea(), poligono.getArestas()));
        adicionarTitulo(TipoDePoligono.CIRCULO,  req);
        return "/pages/circulo.jsp";
    }

}
