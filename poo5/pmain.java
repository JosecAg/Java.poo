package poo5;

import javax.swing.*;
import java.util.ArrayList;

public class pmain {
    public static void main(String[] args) {
        ArrayList<alumno> arl = new ArrayList<alumno>();
        boolean activo=true;

        do {



        int op = Integer.parseInt(JOptionPane.showInputDialog("---Elija su Opcion---\n" +
                "[1] Crear \n" +
                "[2] Consultar \n" +
                "[3] Modificar\n" +
                "[4] Eliminar\n" +
                "[5] Salir \n" +

                "Ingresa una opcion:"));

        switch (op) {
            case 1:
                String cod, nom, ape;
                int eda;
                cod = JOptionPane.showInputDialog("Ingrese el codigo del estudiante: ");
                nom = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
                ape = JOptionPane.showInputDialog("Ingrese el apellido del estudiante: ");
                eda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante: "));

                alumno alum = new alumno();
                alum.setCodigo(cod);
                alum.setNombre(nom);
                alum.setApellido(ape);
                alum.setEdad(eda);

                arl.add(alum);
                break;
            //**********
            case 2:
                JTextArea area=new JTextArea(20,70);
                JScrollPane des=new JScrollPane(area);
                area.setText("Codigo\t Nombre\t Apellido\t Edad\t");
                /*for(int i = 0; i < arl.size(); i++){
                    area.append(arl.get(i).getCodigo()+"\t"+arl.get(i).getNombre()+"\t"+
                            arl.get(i).getApellido()+"\t"+arl.get(i).getEdad()+"\n");
                }*/
                for(alumno i: arl){
                    area.append(i.getCodigo()+"\t"+i.getNombre()+"\t"+i.getApellido()+"\t"+
                            i.getEdad()+"\n");
                }
            JOptionPane.showMessageDialog(null, des);
                break;
            //**********
            case 3:

                break;
            //**********
            case 4:

                break;
            //**********
            case 5:

        }

        }while (activo);
    }
}
