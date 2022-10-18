package Agregacion;

public class Gerente {
    private String nombre;
    private String telefono;    

    public Gerente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Gerente{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
}

