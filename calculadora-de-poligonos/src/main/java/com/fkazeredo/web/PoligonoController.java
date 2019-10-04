package com.fkazeredo.web;

import com.fkazeredo.web.command.AcaoPoligono;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/calculadora")
public class PoligonoController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String parametro = lerAcao(req, res);
        String nomeDaClasse = AcaoPoligono.class.getPackage().getName() + "." + parametro;

        try {

            Class<?> classe = Class.forName(nomeDaClasse);
            AcaoPoligono acao = (AcaoPoligono) classe.newInstance();
            String pagina = acao.executar(req, res);
            req.getRequestDispatcher(pagina).forward(req, res);

        } catch (Exception e) {
            res.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            e.printStackTrace();
        }

    }

    private String lerAcao(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String parametro = req.getParameter("acao");
        if (parametro == null || "".equals(parametro.trim())) {
            res.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            System.out.println("Ação está nula ou vazia");
        }
        return parametro;
    }

}
