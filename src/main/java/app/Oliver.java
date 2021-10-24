package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Oliver {
    private static Oliver instance;

    private Map<Integer, Libro> libros = new HashMap<>();

    private Map<Integer, Estudiante> estudiantes = new HashMap<>();

    private Oliver() {}

    public void regitrarLibro(String nombre, String anio, Autor autor, String categoria) {
        libros.put(libros.size(), new Libro(nombre, anio, autor, categoria));
    }

    public void regitrarEstudiante(String correo, String celular, String categoriaDeInteres) {
        estudiantes.put(estudiantes.size(), new Estudiante(correo, celular, categoriaDeInteres));
    }

    public List<Libro> buscarLibrosPorAutor(Autor autor) {
        ArrayList<Libro> librosEncontrados = new ArrayList<>();

        for (Map.Entry<Integer, Libro> entry : libros.entrySet()) {
            if(entry.getValue().getAutor().equals(autor))
                librosEncontrados.add(libros.get(entry.getKey()));
        }
        return librosEncontrados;
    }

    public List<Estudiante> notificarOfertasPorCategoría(String categoria) {
        ArrayList<Estudiante> estudiantesNotificados = new ArrayList<>();

        for (Map.Entry<Integer, Estudiante> entry : estudiantes.entrySet()) {
            if(entry.getValue().getCategoriaDeInteres() == categoria) {
                Estudiante estudiante = estudiantes.get(entry.getKey());
                estudiante.notificar();

                estudiantesNotificados.add(estudiante);
            }
        }

        return estudiantesNotificados;
    }

    public void limpiar() {
        this.libros.clear();
        this.estudiantes.clear();
    }

    public static Oliver getInstance() {
        if(instance == null){
            instance = new Oliver();
        }
        return instance;
    }

    public Map<Integer, Libro> getLibros() {
        return libros;
    }

    public Map<Integer, Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
