package Composicion;

public class Tarjeta {
    private String numTarjeta;
    private String vigencia;
    private int cvv;

    public Tarjeta(String numTarjeta, String vigencia, int cvv) {
        this.numTarjeta = numTarjeta;
        this.vigencia = vigencia;
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "\nNumero de la tarjeta es: " + numTarjeta +
                ", Vigencia: " + vigencia +
                ", cvv: " + cvv + '}';
    }
    
    
}
