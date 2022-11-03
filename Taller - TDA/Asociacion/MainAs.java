package Asociacion;

public class MainAs {
    public static void main(String[] args) {
        Profesor prof  = new Profesor ( "Jose", "Angarita", "32451", 3241, "Ingeniero", "Calculo", 4000);
        prof.addAlumno(new Alumno("Josue", "Pacheco", "100302", 312 ,"Sistemas", "pache@uni"));
    
        System.out.println(prof);
     }
}