package Herencia;

public class Persona {
    private String nombre;
    private String id;

    public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre: " + nombre + ", id: " + id + '}';
    }
    
    
}
