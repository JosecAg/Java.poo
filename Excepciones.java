package poo3.Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excepciones {
    public static void main(String[] args) throws IOException {
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        float a, b, r;
        
        try{
            System.out.println("Ingrese un valor: ");
            a = Float.parseFloat(leer.readLine());
            System.out.println("Ingresar un valor: ");
            b = Float.parseFloat(leer.readLine());

            r=a/b;

            System.out.println("La division es: "+r);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
