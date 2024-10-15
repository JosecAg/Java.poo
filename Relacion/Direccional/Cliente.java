package Direccional;

public class Cliente {

    private String identificacion;
    private String apellido;
    private String nombre;

    public Cliente() {
    }

    public Cliente(String identificacion, String apellido, String nombre) {
        this.identificacion = identificacion;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
