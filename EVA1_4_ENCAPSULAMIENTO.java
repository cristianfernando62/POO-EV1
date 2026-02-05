package eva1_4_encapsulamiento;
public class EVA1_4_ENCAPSULAMIENTO {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona perso = new Persona();
        perso.setNombre("Juanita");
        perso.setapellido("Perez");
        perso.setedad(32);
        perso.setsexo('F');
        System.out.println("Nombre:" + perso.getNombre());
        System.out.println("Apellido:" + perso.getapellido());
        System.out.println("Edad:" + perso.getedad());
        System.out.println("Sexo:" + perso.getsexo());
        perso.imprimirdatos();
    }
    
}
