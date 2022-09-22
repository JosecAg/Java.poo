package Java.poo3;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class triangulo {
    float base;
    float altura;
    float res;

    // Constructor vacío.
    public triangulo() {

        //Siempre se trabaja acá dentro
        base = 5;
        altura = 2;
    }

    public triangulo(float b, float a) {
        base = b;
        altura = a;
        }

    void mostrar() {
        JTextArea salida = new JTextArea(20, 30);
        salida.setText("Resultados \n");
        salida.append(base * altura / 2 + "\n");
        JOptionPane.showMessageDialog(null, salida);
    }

}
