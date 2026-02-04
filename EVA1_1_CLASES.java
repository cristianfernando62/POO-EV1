package eva1_1_clases;

public class EVA1_1_CLASES {
    public static void main(String[] args) {
        // TODO code application logic here
        //una clase sirve para crear un objeto 
        //1. DECLARAR IN IDENTIDICADOR DEL TIPO DE LA CALSE 
        Persona perso1;
        //2. INSTANCIAR EL OBJETO --> new (crea el objeto en la memoria ram o principal )
        // identificador = new NOMBRE_DE_LA_CALSE(argumentos);
        perso1 = new Persona();
        System.out.println(perso1);// REFERENCIAS 
        Persona perso2= new Persona();
        System.out.println(perso2);//REFERENCIAS
        perso1.apellido = "Hernandez";
        perso1.nombre = "Ruben";
        perso1.edad = 44;
        perso1.imprimir();
        
        perso2.nombre = "Cristian";
        perso2.apellido = "Gonzalez";
        perso2.edad = 33;
        perso2.imprimir();
        
    }
    
}
//Clases inician el Mayusculas 
//MiClasePersona
// TODAS LAS CLASES SON TIPOS DE DATOS 
class Persona{
    //Estado --> Datos (variables) --> ATRIBUTOS
    
    String nombre;
    String apellido;
    int edad;
    //Comportamiento --> Métodos 
    void imprimir(){
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido:"+ apellido);
        System.out.println("Edad:" + edad);
    }

}
