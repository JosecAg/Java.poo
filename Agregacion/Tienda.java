package Agregacion;

public class Tienda {
    private String nombreTienda;
    private String direccion;
    private Gerente gerente; //

    public Tienda(String nombreTienda, String direccion, Gerente gerente) {
        this.nombreTienda = nombreTienda;
        this.direccion = direccion;
        this.gerente = gerente;
    }

    Tienda(String wachos, String la_sabana) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Tienda{" + "nombreTienda=" + nombreTienda + ", direccion=" + direccion + ", gerente=" + gerente + '}';
    }

    
    
}
