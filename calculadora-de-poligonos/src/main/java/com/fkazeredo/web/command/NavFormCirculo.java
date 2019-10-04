package com.fkazeredo.web.command;

import com.fkazeredo.model.TipoDePoligono;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NavFormCirculo extends AcaoPoligono {

    @Override
    public String executar(HttpServletRequest req, HttpServletResponse res)  {
        adicionarTitulo(TipoDePoligono.CIRCULO, req);
        return "/pages/circulo.jsp";
    }
}
