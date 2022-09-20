package basic;

public class personaConstructor {
    String id;
    String nombre;
    float sueldo;

    public personaConstructor(){
        id="1003239022";
        nombre="Jose";
        sueldo=(float)2000.3;
    }

    public personaConstructor(String ced1, String name){
        this.id=ced1;
        this.nombre=name;
    }

    void mostrar(){
        System.out.println("Identificacion: "+ id+"\n");
        System.out.println("Nombre: "+nombre+"\n");
        System.out.println("Sueldo: "+sueldo+"\n");
    }

    public static void main(String[] args){
        //constructor vacio
        personaConstructor per1=new personaConstructor();

        personaConstructor per2=new personaConstructor("10203040", "Carlos");

        personaConstructor per3=new personaConstructor("5222222","Maria");


        per1.mostrar();
        System.out.println("\n");        
        per2.mostrar();
        per3.mostrar();
    }
}