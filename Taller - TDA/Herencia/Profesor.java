package Herencia;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{
    private String Profesion;
    private String Asignatura;
    private double Sueldo;
    private List<Alumno> alum = new ArrayList();

    public Profesor(String Nombre, String Apellido, String id, double Tel, String Profesion, String Asignatura, double Sueldo) {
        super(Nombre, Apellido, id, Tel);
        this.Profesion = Profesion;
        this.Asignatura = Asignatura;
        this.Sueldo = Sueldo;
    }

    public Profesor(String Nombre, String Apellido, String id, double Tel) {
        super(Nombre, Apellido, id, Tel);
    }

    public void addAlumno (Alumno alumno){
        alum.add(alumno);
    }

    @Override
    public String toString() {
        return "Profesor{" + "Profesion: " + Profesion + 
                ", Asignatura: " + Asignatura + 
                ", Sueldo: " + Sueldo + '}';
    }   
}