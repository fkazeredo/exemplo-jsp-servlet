package com.fkazeredo.web.command;

import com.fkazeredo.services.PoligonoService;
import com.fkazeredo.services.ServiceContext;
import com.fkazeredo.model.TipoDePoligono;
import com.fkazeredo.web.TituloDaPagina;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AcaoPoligono {

    protected PoligonoService poligonoService = ServiceContext.getInstancia().getPoligonoService();

    public abstract String executar(HttpServletRequest req, HttpServletResponse res)
            throws Exception;

    protected void adicionarTitulo(String id, String descricao, HttpServletRequest req){
        TituloDaPagina titulo = new TituloDaPagina(id, descricao);
        req.setAttribute("titulo", titulo);
    }

    protected void adicionarTitulo(TipoDePoligono tipo, HttpServletRequest req) {
        adicionarTitulo(tipo.name(), tipo.getDescricao(), req);
    }

}