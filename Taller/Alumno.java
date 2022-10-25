package Taller;

public class Alumno extends Persona {
    private String Carrera;
    private String correoIns;

    public Alumno(String nombre, String apellido, String id, double tel, String Carrera, String correoIns) {
        super(nombre, apellido, id, tel);
        this.Carrera = Carrera;
        this.correoIns = correoIns;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Carrera: " + Carrera + ", Correo Institucional: " + correoIns + '}';
    }
}