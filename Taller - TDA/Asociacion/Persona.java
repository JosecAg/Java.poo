package Asociacion;

public abstract class Persona {
    private String Nombre;
    private String Apellido;
    private String id;
    private double Tel;

    public Persona(String Nombre, String Apellido, String id, double Tel) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.id = id;
        this.Tel = Tel;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre: " + Nombre + 
                ", Apellido: " + Apellido + 
                ", ID:" + id + ", Telefono: " + Tel + '}';
    } 
}