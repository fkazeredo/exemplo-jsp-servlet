package br.com.fkazeredo.web.command;

import br.com.fkazeredo.services.PoligonoService;
import br.com.fkazeredo.services.ServiceContext;
import br.com.fkazeredo.model.TipoDePoligono;
import br.com.fkazeredo.web.TituloDaPagina;

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