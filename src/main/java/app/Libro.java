package app;

import java.util.logging.Logger;

public class Libro {
    private static Logger logger = Logger.getLogger(Libro.class.getName());

    private final String nombre;
    private final String anio;
    private final Autor autor;
    private final String categoría;

    public Libro(String nombre, String anio, Autor autor, String categoría) {
        this.nombre = nombre;
        this.anio = anio;
        this.autor = autor;
        this.categoría = categoría;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAnio() {
        return anio;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getCategoría() {
        return categoría;
    }
}
