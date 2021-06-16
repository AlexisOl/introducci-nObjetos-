import java.util.*;


public class programaObjetos {


     int numero=0;
    Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        programaObjetos inicio = new programaObjetos();
    }
    
    public programaObjetos() {
        System.out.println("Ingrese un numero para el contador");
        System.out.println("escriba 1 para el contador de incremento");
        System.out.println("2 Para el contador de decrecimiento ");
        int opcion = lector.nextInt();
            if (opcion==1) {
                System.out.println(incremento(numero));
            } else {
                System.out.println(decrecimiento(numero));
            }
    }
    public int incremento(int numero){
        numero++;
        
        return numero;
    }
    public int decrecimiento(int numero){
        numero--;
    return numero;
    }

    public programaObjetos(int numero) {
        this.numero = numero;
    }
    
    
   // public programaObjetos(){
        
    //}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
