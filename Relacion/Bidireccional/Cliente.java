package Bidireccional;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Cliente {

    private String identificacion;
    private String apellido;
    private String nombre;

    CuentaBancaria cuentaB;

    public Cliente() {
    }

    public Cliente(String identificacion, String apellido, String nombre, Bidireccional.CuentaBancaria cuentaB) {
        this.identificacion = identificacion;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cuentaB = cuentaB;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Bidireccional.CuentaBancaria getCuentaB() {
        return cuentaB;
    }

    public void setCuentaB(Bidireccional.CuentaBancaria cuentaB) {
        this.cuentaB = cuentaB;
    }

    void mostrar() {
        JTextArea salida = new JTextArea();
        salida.setText("Identify\tApellido\tNombre\tNo Cuenta\tTipo Cuenta\tSaldo\n");
        salida.append(identificacion + "\t" + apellido + "\t" + nombre + "\t" + cuentaB.getNoCuenta() + "\t"
                + cuentaB.getTipoCuenta() + "\t" + cuentaB.getSaldo());
        JOptionPane.showMessageDialog(null, salida);
    
    }
}