package Agregacion;

import javax.swing.JOptionPane;

public class Agregacion {
    public static void main(String[] args) {
        Tienda tienda=new Tienda("Wachos","La sabana", new Gerente("Waos", "555"));
        
        JOptionPane.showMessageDialog(null, tienda);
    }
}