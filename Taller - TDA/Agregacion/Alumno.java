package Agregacion;

public class Alumno extends Persona{
    private String Carrera;
    private String correoIns;

    public Alumno(String Carrera, String correoIns, String Nombre, String Apellido, String id, String Tel) {
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