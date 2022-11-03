package Asociacion;

public class Alumno extends Persona{
    private String Carrera;
    private String correoIns;

    public Alumno(String Nombre, String Apellido, String id, double Tel, String Carrera, String correoIns) {
        super(Nombre, Apellido, id, Tel);
        this.Carrera = Carrera;
        this.correoIns = correoIns;
    }
    
    @Override
    public String toString() {
        return "Alumno{" + "Carrera: " + Carrera + 
                ", Correo: " + correoIns + '}';
    }  
}