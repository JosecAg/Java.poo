package Taller;

public class Coordinador extends Persona{
    private String Rol;
    private String Funcion;
    private double Sueldo;

    public Coordinador(String Rol, String Funcion, double Sueldo, String nombre, String apellido, String id, double tel) {
        super(nombre, apellido, id, tel);
        this.Rol = Rol;
        this.Funcion = Funcion;
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Coordinador{" + "Rol: " + Rol + ", Funcion: " + Funcion + ", Sueldo: " + Sueldo + '}';
    } 
}