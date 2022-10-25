
package Taller;

public class main {
    public static void main(String[] args) {
        Profesor prof = new Profesor("Manuel","Mejia","1003",344,"Ingeniero", "P1", 1234);
        prof.addAlumno(new Alumno("Alfonso", "Barreras","1234",666,"Sistemas","alfonsito@edu"));
        
        System.out.println(prof);
    }
}
