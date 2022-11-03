package Interface;

public abstract class Persona {
    private String Nombre;
    private String Apellido;
    private String id;
    private String Tel;

    public Persona(String Nombre, String Apellido, String id, String Tel) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.id = id;
        this.Tel = Tel;
    }
    abstract public void mostrarDatos();
}