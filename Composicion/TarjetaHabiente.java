package Composicion;

import java.util.ArrayList;
import java.util.List;

public class TarjetaHabiente {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Tarjeta> tarjeta;

    
    //Las dos ultimas lineas se agregan manualmente
    public TarjetaHabiente(String nombre, String direccion, String telefono, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tarjeta = new ArrayList<>();
        this.tarjeta.add(tarjeta);
    }

    public void addTarjeta(Tarjeta tarjeta){
        this.tarjeta.add(tarjeta);
    }

    @Override
    public String toString() {
        return "TarjetaHabiente{" + "Mombre: " + nombre 
                + ", Direccion: " + direccion 
                + ", Telefono: " + telefono 
                + ", Tarjeta: " + tarjeta + '}';
    }
    
    
    
}
