package Taller;

public class Monitor extends Persona{
    private String Funcion;
    private String Correo;
    private double Sueldo;

    public Monitor(String Funcion, String Correo, double Sueldo, String nombre, String apellido, String id, double tel) {
        super(nombre, apellido, id, tel);
        this.Funcion = Funcion;
        this.Correo = Correo;
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Monitor{" + "Funcion: " + Funcion + ", Correo: " + Correo + ", Sueldo: " + Sueldo + '}';
    }
    
    
}
