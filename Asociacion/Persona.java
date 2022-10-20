package Asociacion;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String id;
    private String nombre;
    private List<Mascota> masco = new ArrayList<>();
   
    public Persona(){
       
    }

    public Persona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
   
    public void addMascota(Mascota mascota){
        masco.add(mascota);
    }

    @Override
    public String toString() {
        return "Persona{" +
               "id=" + id +
               ", nombre=" + nombre +
               ", masco=" + masco + '}';
    }
       
   
}