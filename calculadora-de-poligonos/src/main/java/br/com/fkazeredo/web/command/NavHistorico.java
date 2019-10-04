package br.com.fkazeredo.web.command;

import br.com.fkazeredo.model.Poligono;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Set;

public class NavHistorico extends AcaoPoligono {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse res) {
        Set<Poligono> poligonos = poligonoService.buscarHistorico();
        req.setAttribute("poligonos", poligonos);
        adicionarTitulo("HISTORICO", "Histórico", req);
        return "/pages/historico.jsp";
    }

}
