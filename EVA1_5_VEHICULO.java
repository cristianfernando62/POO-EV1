package eva1_5_vehiculo;
public class EVA1_5_VEHICULO {
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo vehiculo = new Vehiculo();
          vehiculo.setmarca("Ford");
          vehiculo.setmodelo("Mustang");
          vehiculo.setcolor("Rojo");
          vehiculo.setyear(2025);
          vehiculo.setkilometraje(3500);
          vehiculo.setprecio(1000000);
          vehiculo.imprimirdatos();
          
          Vehiculo[] agencia = new Vehiculo[10];
          for (int i = 0; i < agencia.length; i++) {
          agencia[i] = new Vehiculo();
          agencia[i].setmarca("Ford");
          agencia[i].setmodelo("Mustang");
          agencia[i].setcolor("Rojo");
          agencia[i].setyear(2025);
          agencia[i].setkilometraje(3500);
          agencia[i].setprecio(1000000);
          agencia[i].imprimirdatos();
            
        }
        
        
    }
    
}
