package Asociacion;

public class Asociaciones {

    public static void main(String[] args) {
       
        Persona p = new Persona("1111", "Juan");
        p.addMascota(new Mascota("Perro","Homero","Lobo siberiano"));
       
        System.out.println(p);
        System.out.println("");
       
        Persona tu = new Persona("4444","Maria");
        tu.addMascota(new Mascota("ave","periquito","loro"));
        tu.addMascota(new Mascota("culebra","lapica","mapaná"));
       
        System.out.println(tu);
        System.out.println("");
       
        Persona ella = new Persona("2222","Martha");
        System.out.println(ella);
       
       
    }
    }