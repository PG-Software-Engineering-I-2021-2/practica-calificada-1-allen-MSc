package app;

import java.util.logging.Logger;

public class Autor {
    private static Logger logger = Logger.getLogger(Autor.class.getName());

    private final String nombre;
    private final String fechaNacimiento;

    public Autor(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
}
