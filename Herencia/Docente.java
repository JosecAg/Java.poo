package Herencia;

//Super: Metodo para invocar el constructor de una clase superior.
//"extends": Para que reciba la herencia a: extends -> "algo"

public class Docente extends Persona{
    private String asignatura;
    private double sueldo;

    public Docente(String nombre, String id, String asignatura, double sueldo) {
        super(nombre, id);
        this.asignatura = asignatura;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Docente{" + super.toString() + "\nAsignatura: " + asignatura 
                + ", Sueldo: " + sueldo + '}';
    }
    
    
}
