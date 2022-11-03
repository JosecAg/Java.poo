package Herencia;

public class MainHe {
    public static void main(String[] args) {
       Profesor prof = new Profesor ("Agustin" , "Larson", "26812" , 30048 , "Programacion  II" , "Abogado" , 5000);
       Alumno alum = new Alumno("Josue", "Pacheco", "100302", 312 ,"Sistemas", "pache@uni"); 
       Monitor mon = new Monitor ("Andres" , "Suarez" , "12234" , 3022 , "Monitor" , "andsua@uni", 4);
       Coordinador coord = new Coordinador("Paco" , "Mendez" , "6661" , 3244 , "C1", "Administracion academica", 10000);
     
       
        System.out.println("Profesor: "+prof);
        System.out.println("\nAlumno(s): "+alum);
        System.out.println("\nMonitor: "+mon);
        System.out.println("\nCoordinador: "+coord);
    }
}