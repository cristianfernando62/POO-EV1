
package eva1_2_modificadores_acceso;
public class EVA1_2_MODIFICADORES_ACCESO {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona perso = new Persona();
        System.out.println(perso);
        perso.apellido = "Gonzalez";
    }
    
}

class Persona{
public String nombre;
public String apellido;
public int edad;
}