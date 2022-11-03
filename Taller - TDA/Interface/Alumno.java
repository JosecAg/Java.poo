package Interface;

import javax.swing.JOptionPane;

public abstract class Alumno extends Persona implements Caracteristicas{
    private String Carrera;
    private String correoIns;

    public Alumno(String Nombre, String Apellido, String id, String Tel, String Carrera, String correoIns) {
        super(Nombre, Apellido, id, Tel);
        this.Carrera = Carrera;
        this.correoIns = correoIns;
    }

    @Override
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null, "Alumno:"+
                "\nCarrera: "+ Carrera+
                "\nCorreo: "+ correoIns);
    }
        
    @Override
    public void cabello(){
        JOptionPane.showMessageDialog(null, "Cabello Azul");
    }
    @Override
    public void piel(){
        JOptionPane.showMessageDialog(null, "Piel tes morena");
    }
    @Override
    public void ropa(){
        JOptionPane.showMessageDialog(null, "Traje de negro");
    }
}
