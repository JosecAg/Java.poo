package ClaseAbstracta;

import javax.swing.JOptionPane;

public class Abstracto {
    public static void main(String[] args) {
         String cc, nom, cel, estado;
        int eda;
        double sueld;
        
        cc = JOptionPane.showInputDialog("Ingrese la identificacion: ");
        nom = JOptionPane.showInputDialog("Ingrese el nombre: ");
        eda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
        sueld = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo: "));
        estado = JOptionPane.showInputDialog("Ingrese Estado Civil");
        cel = JOptionPane.showInputDialog("Ingrese el numero de telefono: ");
        
        
        Empleado emp1 = new Empleado(cc,nom,eda,sueld,estado,cel);
        emp1.mostrarDatos();
    }
}
