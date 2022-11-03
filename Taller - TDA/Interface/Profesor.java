package Interface;

import javax.swing.JOptionPane;

public class Profesor extends Persona{
    private String Profesion;
    private String Asignatura;
    private double Sueldo;

    public Profesor(String Nombre, String Apellido, String id, String Tel, String Profesion, String Asignatura, double Sueldo) {
        super(Nombre, Apellido, id, Tel);
        this.Profesion = Profesion;
        this.Asignatura = Asignatura;
        this.Sueldo = Sueldo;
    }


    @Override
    public void mostrarDatos(){
        JOptionPane.showInternalMessageDialog(null, "Profesor: "+
                "\nProfesion: "+Profesion+
                "\nAsignatura: "+Asignatura+
                "\nSueldo: "+Sueldo);
    }
}