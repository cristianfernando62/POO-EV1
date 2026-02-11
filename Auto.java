
package pooauto;

import java.util.Scanner;

public class Auto {
    
    //Atributos
    private String marca;
    private String modelo;
    private String color;
    private String placas;
    private int anyo;
    private boolean motorencendido;
    private boolean enmovimiento;
    private int Velocidad;
    
    private Scanner teclado = new Scanner(System.in);
    // Constructor 
    public void Auto (){
    this.marca="";
    this.modelo="";
    this.color="";
    this.placas="";
    this.anyo=0;
    this.Velocidad=0;
    this.motorencendido = false;
        }
    // Metodos 
    public void PedirDatos(){
    
    System.out.println("Dame la marca del auto:");
    this.marca=teclado.nextLine();
    System.out.println("Dame la modelo del auto:");
    this.modelo=teclado.nextLine();
        System.out.println("Dame el color del auto");
        this.color=teclado.nextLine();
        System.out.println("Dame las placas del auto");
        this.placas=teclado.nextLine();
        System.out.println("Dame el año del auto");
        this.anyo=teclado.nextInt();   
    }
     public void MostrarDatos(){
            System.out.println("Datos del vehiculo ");
            System.out.println("marca: " +this.marca);
            System.out.println("modelo: " +this.modelo);
            System.out.println("placas: " +this.placas);
            System.out.println("Color: "+ this.color);
            System.out.println("Año: "+ this.anyo);

}
     
     public void EncenderMotor(){
         if (!motorencendido){
         motorencendido = true;
             System.out.println(" Se acaba de encender el motor");
         } else {
             System.out.println("El motor ya estaba encendido");
         }
     
     }
     
     public void ApagarMotor(){
     if (motorencendido && !enmovimiento){
     motorencendido = false;
         System.out.println("El motor acaba de ser apagado");
     } else if (enmovimiento){
         System.out.println("No puedes apagar el motor mientras el auto esta en movimiento");
     } else {
         System.out.println("El motor ya estaba apagado");
     }
         
     }
     
     public void Manejar( int velocidad ){
     // Para manejar el auto primero debe de estar encendido 
     //Pedir al usuario la velocidad de manejo 
     if (motorencendido){
     if (!enmovimiento){
     enmovimiento = true;
         System.out.println("El auto esta en movimiento a "+ velocidad + "km/h");
     }else {System.out.println("El auto ya estaba en movimiento");
     }
     }else{
         System.out.println("No puedes manejar el auto si el motor está apagado");
     }
     }
     
     public void DetenerAuto(){
     // Para detener el auto primero debe de estar a una cierta velocidad 
     if (enmovimiento){
     enmovimiento = false;
         System.out.println("El auto se ha detenido");
     }else{
         System.out.println("El auto ya estaba estatico");
     }
     }
     // Hacer un menu
     
}
