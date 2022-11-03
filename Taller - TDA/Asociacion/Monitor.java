package Asociacion;

public class Monitor extends Persona{
    private String Funcion;
    private String Correo;
    private double Sueldo;

    public Monitor(String Nombre, String Apellido, String id, double Tel, String Funcion, String Correo, double Sueldo) {
        super(Nombre, Apellido, id, Tel);
        this.Funcion = Funcion;
        this.Correo = Correo;
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "Monitor{" + "Funcion: " + Funcion + 
                ", Correo: " + Correo + 
                ", Sueldo:" + Sueldo + '}';
    }
}