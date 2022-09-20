package basic;

import javax.swing.JOptionPane;

public class persona {
    String id;
    String nombre;
    float sueldo;

    void mostrar(){
        JOptionPane.showMessageDialog(null, "Identificacion: "+ id);
        JOptionPane.showMessageDialog(null, "Nombre: "+nombre);
        JOptionPane.showMessageDialog(null, "Sueldo: "+sueldo);
    }
    public static void main(String[] args){
        //Crear nuevas personas (clases)
        persona per1=new persona();
        persona per2=new persona();

        //Asignarle los valores a persona1
        per1.id="1003239022";
        per1.nombre="Jose";
        per1.sueldo=(float)2000.3;
        per1.mostrar();

        //Asignarle los valores a persona2
        per2.id="aña";
        per2.nombre="Mini Pekka";
        per2.sueldo=2000000000;
        per2.mostrar();
    }
}