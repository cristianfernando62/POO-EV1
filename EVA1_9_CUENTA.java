package eva1_9_cuenta;
public class EVA1_9_CUENTA {
    public static void main(String[] args) {
        // TODO code application logic here
        //constructores retirar, ingresar,mostrar datos
        cuentabancaria cuenta= new cuentabancaria("Juan Perez", 5000);
        cuenta.imprimirsaldo();
        cuenta.ingresar(5000);
        cuenta.imprimirsaldo();
        
    }
    
}
