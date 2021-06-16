import java.util.*;


public class cuadrado {

  
    int lado;
   
     
     
    Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
     cuadrado inicio = new cuadrado();
    }
    public int Area(int cantidad){
        int area =0;
        area = cantidad*cantidad;
        return area;
    }
    
    public int perimetro(int cantidad){
        int perimetro=0;
        perimetro = 4*cantidad;
        return perimetro;
    }
    public void solicitarInfo(){
        System.out.println("Ingrese el valor del lado del cuadrado");
        lado=lector.nextInt();
           System.out.println("Ingrese un numero");
        System.out.println("1 para el calculo de area");
        System.out.println("2 Para el calculo de perimetro");
       
                
        int opcion = lector.nextInt();
            if (opcion==1) {
                System.out.println(Area(lado));
            } else {
                System.out.println(perimetro(lado));
            }
    }
    public cuadrado(){
         solicitarInfo();
            
                   

    }
    
    public cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
