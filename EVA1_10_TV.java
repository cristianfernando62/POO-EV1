package eva1_10_tv;
public class EVA1_10_TV {
    public static void main(String[] args) {
        // TODO code application logic here
        television tv = new television();
        tv.consultarestado();
        tv.prenderapagar();
        tv.consultarestado();
        tv.cambiarvolumen(100);
        tv.consultarvolumen();
        tv.cambiarcanal(26);
        tv.consultarcanal();
    }
    
    
}
