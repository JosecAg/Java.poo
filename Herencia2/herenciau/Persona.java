package herenciau;

public class Persona {
    String id;
    String nombre;
    int edad;

    public Persona(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos(){} //Cuando lo vuelva a llamar es polimorfismo de estructura
}