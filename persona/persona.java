package persona;

public class persona {
    String id;
    String nombre;
    float sueldo;

    public persona() {
    }

    public persona(String id, String nombre, float sueldo) {
        this.id=id;
        this.nombre=nombre;
        this.sueldo=sueldo;
    }

    void mostrar(){
        System.out.println("Identificacion: "+ id+"\n");
        System.out.println("Nombre: "+nombre+"\n");
        System.out.println("Sueldo: "+sueldo+"\n");
    }
}