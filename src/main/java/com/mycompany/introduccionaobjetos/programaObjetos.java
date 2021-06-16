/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introduccionaobjetos;

import java.util.Scanner;

/**
 *
 * @author 50241
 */
public class programaObjetos {

    /**
     * @param args the command line arguments
     */
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
    
    
}
