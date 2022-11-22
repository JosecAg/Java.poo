package com.mycompany.ar;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Ar {

    public static void main(String[] args) {
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String nombre="";
        String dir="";
        String correo="";
        
        archivo = new File("estudiante.txt");
        if (!archivo.exists())
        try{
            archivo.createNewFile();
            nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
            dir = JOptionPane.showInputDialog("Ingrese su dir: ");
            correo = JOptionPane.showInputDialog("Ingrese su E-mail: ");
            
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.print(nombre);
            linea.print(dir);
            linea.print(correo);
            linea.print("\n");
            linea.close();
                    
        } catch (Exception e){
        }
    }
}