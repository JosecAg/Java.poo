
package ClaseAbstracta;

import javax.swing.JOptionPane;

public class Empleado extends Persona{
    private double sueldo;
    private String estadoCivil;
    private String telefono;

    public Empleado(String id, String nombre, int edad, double sueldo, String estadoCivil, String telefono) {
        super(id, nombre, edad);
        this.sueldo = sueldo;
        this.estadoCivil = estadoCivil;
        this.telefono = telefono;
    }
    
    public void mostrarDatos(){
    JOptionPane.showMessageDialog(null, "Identificacion: "+ id+
            "\nNombre: "+nombre+
            "\nEdad: "+edad+
            "\nSueldo: "+sueldo+
            "\nEstado Civil: "+estadoCivil+
            "\nTelefono: "+telefono);
    }
    
}
