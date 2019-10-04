package br.com.fkazeredo.web.command;

import br.com.fkazeredo.model.TipoDePoligono;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NavFormQuadrado extends AcaoPoligono {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse res)  {
        adicionarTitulo(TipoDePoligono.QUADRADO, req);
        return "/pages/quadrado.jsp";
    }
}
