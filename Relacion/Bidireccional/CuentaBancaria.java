package Bidireccional;

import Direccional.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class CuentaBancaria {
    
    private String noCuenta;
    private String tipoCuenta;
    private float saldo;
    
    Cliente client;
    
    public CuentaBancaria() {
    }
    
    public CuentaBancaria(String noCuenta, String tipoCuenta, float saldo, Cliente client) {
        this.noCuenta = noCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.client = client;
    }
    
    public String getNoCuenta() {
        return noCuenta;
    }
    
    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }
    
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public Cliente getClient() {
        return client;
    }
    
    public void setClient(Cliente client) {
        this.client = client;
    }
    
    void mostrar() {
        JTextArea salida = new JTextArea();
        salida.setText("N Cuenta\tTipo cuenta\tSaldo\tIdentificacion\tApellido\tNombre\n");
        salida.append(noCuenta + "\t" + tipoCuenta + "\t" + saldo + "\t" + client.getIdentificacion() + "\t"
                + client.getApellido() + "\t" + client.getNombre());
        JOptionPane.showMessageDialog(null, salida);
    }
    
}
