package ClaseAbstracta;

public abstract class Persona {
    String id;
    String nombre;
    int edad;

    public Persona(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    abstract public void mostrarDatos();
}
