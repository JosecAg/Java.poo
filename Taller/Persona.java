package Taller;

public class Persona {
    private String nombre;
    private String apellido;
    private String id;
    private double tel;

    public Persona(String nombre, String apellido, String id, double tel) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "persona{" + "Nombre: " + nombre + ", Apellido: " + apellido + ", id: " + id + ", tel. " + tel + '}';
    }  
}