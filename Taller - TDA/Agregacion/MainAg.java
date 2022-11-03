package Agregacion;

public class MainAg {
    public static void main(String[] args) {
        
        Profesor prof = new Profesor ("Manuel", "Mejia", "23455", "300256","Ingeniero de Sistemas", "Programacion II", 3000,
        new Alumno("Jose", "Araujo", "1003239022","3127300584", "Sistemas", "joseac@uni"));
        
        System.out.println(prof);
    }
}
