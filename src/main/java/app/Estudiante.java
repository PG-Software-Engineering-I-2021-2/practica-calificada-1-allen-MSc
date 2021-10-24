package app;

import java.util.logging.Logger;

public class Estudiante {
    private static Logger logger = Logger.getLogger(Estudiante.class.getName());

    private final String correo;

    private final String celular;

    private final String categoriaDeInteres;

    public Estudiante(String correo, String celular, String categoriaDeInteres) {
        this.correo = correo;
        this.celular = celular;
        this.categoriaDeInteres = categoriaDeInteres;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCelular() {
        return celular;
    }

    public String getCategoriaDeInteres() {
        return categoriaDeInteres;
    }

    public void notificar(){
        logger.info("Se le notificó nueva oferta...");
    }
}
