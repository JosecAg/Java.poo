package Interface;

import javax.swing.JOptionPane;

public class MainIn {
    public static void main(String[] args) {
        String nomA, apeA, idA, telA, carr, correoin;
        
        JOptionPane.showInputDialog("A continuacion la informacion del alumno.");

        nomA = JOptionPane.showInputDialog("Ingrese el nombre: ");
        apeA = JOptionPane.showInputDialog("Ingrese el apellido: ");
        idA = JOptionPane.showInputDialog("Ingrese la identificacion: ");
        telA = JOptionPane.showInputDialog("Ingrese el telefono: ");
        carr = JOptionPane.showInputDialog("Ingrese la carrera cursada: ");
        correoin = JOptionPane.showInputDialog("Ingrese el correo institucional: ");
        
        Alumno alum1 = new Alumno(nomA, apeA, idA, telA, carr, correoin) {};
        alum1.mostrarDatos();
        alum1.cabello();
        alum1.piel();
        alum1.ropa();
    }
}