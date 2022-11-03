package Agregacion;

public class Profesor extends Persona {
    private String Profesion;
    private String Asignatura;
    private double Sueldo;
    private Alumno alumno;

    public Profesor(String Nombre, String Apellido, String id, String Tel, String Profesion, String Asignatura, double Sueldo, Alumno alumno){
        super(Nombre, Apellido, id, Tel);
        this.Profesion = Profesion;
        this.Asignatura = Asignatura;
        this.Sueldo = Sueldo;
        this.alumno = alumno;
    }
}