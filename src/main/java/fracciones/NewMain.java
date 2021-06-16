/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracciones;

import java.util.Scanner;

/**
 *
 * @author 50241
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    static Scanner lector = new Scanner(System.in);  
    static int opcion=0,num1=0,num2=0,dem1=0,dem2=0;
    public static void main(String[] args) {
        System.out.println("Ingrese el numerador de la primera fraccion");
          num1 = lector.nextInt();
        System.out.println("Ingrese el numerador de la primera fraccion");
          dem1=lector.nextInt();
        System.out.println("Ingrese el numerador de la primera fraccion");
        num2=lector.nextInt();
        System.out.println("Ingrese el numerador de la primera fraccion");
          dem2=lector.nextInt();
        System.out.println("Ingrese que desea realizar");
        System.out.println("1 - suma");
        System.out.println("2 - resta");
        System.out.println("3 - multiplicacion");
        System.out.println("4 - division");
       
        int opcion = lector.nextInt();
        if(opcion>4 || opcion<1){
            System.out.println("No existe esa opcion");
            
        } else {
        fracciones F1 = new fracciones(num1, dem1);
        fracciones F2 = new fracciones(num2, dem2);
            switch (opcion){
                case 1: System.out.println(fracciones.sumar(F1, F2));
                        break;
                case 2 : System.out.println(fracciones.restar(F1, F2));
                        break;
                case 3 : System.out.println(fracciones.multiplicar(F1, F2));
                        break;
                case 4: System.out.println(fracciones.dividir(F1, F2));
                        break;
            } 
        }
    }
    
}
