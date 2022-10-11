package poo4;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class pmain {

  public static void main(String[] args) {
    ArrayList<alumno> alum = new ArrayList<alumno>();

    boolean activo = true;
    do {

      int op = Integer.parseInt(JOptionPane.showInputDialog("\n Elija su Opcion" +
          "************\n" +
          "[1] Crear \n" +
          "[2] Consular \n" +
          "[3] Modificar\n" +
          "[4] Eliminar\n" +
          "[5] Salir \n" +

          "Ingresa una opcion:"));

      switch (op) {
        case 1:// "[1] Crear \n"
          String cod, ape, nom;
          int eda;
          cod = JOptionPane.showInputDialog("Digitar el codigo estudiante");
          nom = JOptionPane.showInputDialog("Digitar el Nombre estudiante");
          ape = JOptionPane.showInputDialog("Digitar el apellido estudiante");
          eda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
          alumno a = new alumno();
          a.setCodigo(cod);
          a.setNombre(nom);
          a.setApellido(ape);
          a.setEdad(eda);
          alum.add(a);

          break;
        // ****************************
        case 2:
          JTextArea area = new JTextArea(20, 70);
          JScrollPane des = new JScrollPane(area);
          area.setText("Codigo\t Nombre\t apellido\t edad\n");
          for (alumno i : alum) {
            area.append(i.getCodigo() + "\t" + i.getNombre() + "\t" + i.getApellido() + "\t" + i.getEdad() + "\n");
          }
          JOptionPane.showMessageDialog(null, des);
          break;
        // ****************************
        case 3:
          cod = JOptionPane.showInputDialog("Digitar el codigo estudiante a modificar");
          Iterator<alumno> it1 = alum.iterator();
          while (it1.hasNext()) {
            alumno e = it1.next();
            if (e.getCodigo().equals(cod)) {
              String cod1, ape1, nom1;
              int eda1;
              cod1 = JOptionPane.showInputDialog("Digitar el codigo estudiante");
              nom1 = JOptionPane.showInputDialog("Digitar el Nombre estudiante");
              ape1 = JOptionPane.showInputDialog("Digitar el apellido estudiante");
              eda1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
              e.setCodigo(cod1);
              e.setNombre(nom1);
              e.setApellido(ape1);
              e.setEdad(eda1);

            }
          }

          break;
        // ****************************
        case 4:
          cod = JOptionPane.showInputDialog("Digitar el codigo estudiante a eliminar");
          Iterator<alumno> it = alum.iterator();
          while (it.hasNext()) {
            alumno e = it.next();
            if (e.getCodigo().equals(cod)) {
              it.remove();
            }
          }

          break;
        // ****************************
        case 5:

      }

    } while (activo);
  }
}
