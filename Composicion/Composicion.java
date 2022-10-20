package Composicion;

public class Composicion {
    public static void main(String[] args){
        TarjetaHabiente cliente = new TarjetaHabiente("Jose", "Calle 13", "3203012",
                new Tarjeta("444", "12/27", 782));
        
        cliente.addTarjeta(new Tarjeta("555", "12/23", 777));
        
        
        System.out.println(cliente);
    }
}
