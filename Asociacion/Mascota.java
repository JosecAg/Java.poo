package Asociacion;

public class Mascota {

    private String tipoAnimal;
    private String nombre;
    private String raza;
   
    public Mascota(){
       
    }

    public Mascota(String tipoAnimal, String nombre, String raza) {
        this.tipoAnimal = tipoAnimal;
        this.nombre = nombre;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Mascota{" +
               "tipoAnimal = " + tipoAnimal +
               ", nombre = " + nombre +
               ", raza = " + raza + '}';
    }
   
   
   
   
}