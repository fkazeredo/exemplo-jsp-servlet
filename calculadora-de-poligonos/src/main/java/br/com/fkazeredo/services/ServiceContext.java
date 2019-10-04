package br.com.fkazeredo.services;

import br.com.fkazeredo.persistence.PersistenceContext;

public class ServiceContext {

    private static ServiceContext instancia;

    private ServiceContext() {
    }

    public static ServiceContext getInstancia() {
        if (instancia == null)
            instancia = new ServiceContext();
        return instancia;
    }

    public PoligonoService getPoligonoService(){
        return new PoligonoServiceImpl(PersistenceContext.getInstancia().getPoligonoRepository());
    }

}
