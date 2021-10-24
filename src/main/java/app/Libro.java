package app;

public class Libro {

    private final String nombre;
    private final String anio;
    private final Autor autor;
    private final String categoria;

    public Libro(String nombre, String anio, Autor autor, String categoria) {
        this.nombre = nombre;
        this.anio = anio;
        this.autor = autor;
        this.categoria = categoria;
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

    public String getCategoria() {
        return categoria;
    }
}
