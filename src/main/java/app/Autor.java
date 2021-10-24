package app;

public class Autor {

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
