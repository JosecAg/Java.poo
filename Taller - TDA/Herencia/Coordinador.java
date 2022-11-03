package Herencia;

public class Coordinador extends Persona{
    private String Rol;
    private String Funcion;
    private double Sueldo;

    public Coordinador(String Nombre, String Apellido, String id, double Tel, String Rol, String Funcion, double Sueldo) {
        super(Nombre, Apellido, id, Tel);
        this.Rol = Rol;
        this.Funcion = Funcion;
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Coordinador{" + "Rol: " + Rol + ", Funcion: " + Funcion + ", Sueldo: " + Sueldo + '}';
    } 
}