package poo3;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class controlTriangulo {
    float base;
    float altura;
    float res;

    // Constructor vacío.
    public controlTriangulo(float a, float b) {

        //Siempre se trabaja acá dentro
        float base = b;
        float altura = a;
    }

    void mostrar() {
        JTextArea salida = new JTextArea(20, 30);
        salida.setText("Resultados \n");
        salida.append(base * altura / 2 + "\n");
        JOptionPane.showMessageDialog(null, salida);
    }

    public static void main(String[] args) {
        controlTriangulo ob = new controlTriangulo();
        controlTriangulo ob2 = new controlTriangulo(4,5);
        ob.base = 2;
        ob.altura = 3;
        ob.mostrar();
        ob2.mostrar();
    }
}
