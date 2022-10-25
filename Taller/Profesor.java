
package Taller;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{
    private String Profesion;
    private String Asignatura;
    private double Sueldo;
    private List<Alumno> alum = new ArrayList();

    public Profesor(String nombre, String apellido, String id, double tel, String Profesion, String Asignatura, double Sueldo) {
        super(nombre, apellido, id, tel);
        this.Profesion = Profesion;
        this.Asignatura = Asignatura;
        this.Sueldo = Sueldo;
    }

    public Profesor(String nombre, String apellido, String id, double tel) {
        super(nombre, apellido, id, tel);
    }
    
    public void addAlumno (Alumno alumno){
        alum.add(alumno);
    }

    @Override
    public String toString() {
        return "Profesor{" + "Profesion: " + Profesion + ", Asignatura: " + Asignatura + ", Sueldo: " + Sueldo + '}';
    }   
}