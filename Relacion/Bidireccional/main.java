package Bidireccional;

import Direccional.*;
import javax.swing.JOptionPane;

public class main {
    
    public static void main(String[] args) {
        String nCuenta, tCuenta, id, ape, nom;
        float sal;
        
        nCuenta = JOptionPane.showInputDialog("Ingrese el numero de cuenta: ");
        tCuenta = JOptionPane.showInputDialog("Ingrese el tipo de cuenta: ");
        sal = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el saldo de cuenta: "));
        
        id = JOptionPane.showInputDialog("Ingrese la identificacion del cliente: ");
        ape = JOptionPane.showInputDialog("Ingrese el apellido del cliente: ");
        nom = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        
        Cliente c = new Cliente();
        c.setIdentificacion(id);
        c.setApellido(ape);
        c.setNombre(nom);
        
        CuentaBancaria cb = new CuentaBancaria(nCuenta,tCuenta,sal,c);
        cb.mostrar();
        
        Cliente c2 = new Cliente(id, ape, nom, cb);
        c2.mostrar();
    }
}
