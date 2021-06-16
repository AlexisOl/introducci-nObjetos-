/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import java.util.Scanner;

/**
 *
 * @author 50241
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
   //  String nombre="";
    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
    
        libros ingreso = new libros();
     // ingreso.ingreso();
     System.out.println("Ingrese nombre");
     String nombre = lector.nextLine();
        ingreso.setTitulo(nombre);
        System.out.println("Ingrese cantidad");
        int cantidad = Integer.valueOf(lector.nextLine());
        ingreso.setCanitdadEjemplares(cantidad);
        System.out.println("Ingrese autor");
        String autor = lector.nextLine();
        ingreso.setAutor(autor);
        System.out.println("Ingrese la cantidad de veces que se haya prestado antes");
        int cantidad2 = Integer.valueOf(lector.nextLine());
        ingreso.setPrestados(cantidad2);
       if (ingreso.prestamo()){
           System.out.println("se ha prestado el libro");
       } else {
           System.out.println("No quedan ejemplares");
       }
       if(ingreso.devolver()){
           System.out.println("Se ha devuelto el libro"+ingreso.getTitulo());
       } else {
           System.out.println("No hay ejemplares de este libro"+ingreso.getTitulo());
       }
        System.out.println("se ha prestado"+ingreso.getPrestados());
           
    }
    
     
    
}
