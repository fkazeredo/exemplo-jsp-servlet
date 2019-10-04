package br.com.fkazeredo.persistence;

public class PersistenceContext {

    private static PersistenceContext instancia;

    private PersistenceContext() {
    }

    public static PersistenceContext getInstancia() {
        if (instancia == null)
            instancia = new PersistenceContext();
        return instancia;
    }

    public PoligonoRepository getPoligonoRepository(){
        return PoligonoRepositoryImpl.getInstancia();
    }

}
