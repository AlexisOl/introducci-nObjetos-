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
public class rectangulo {

    int ancho;
    int largo;
    Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        rectangulo inico = new rectangulo();
    }
    
     public int Area(int largo, int ancho){
        int area =0;
        area = ancho*largo;
        return area;
    }
    
    public int perimetro(int ancho, int largo){
        int perimetro=0;
        perimetro = (2*ancho)+(2*largo);
        return perimetro;
    }
    
    public void solicitarInfo(){
        System.out.println("Ingrese el valor del ancho del rectangulo");
        int cantidadancho=lector.nextInt();
        System.out.println("Ingrese el valor del largo del rectangulo");
        int cantidadlargo=lector.nextInt();
            if (cantidadancho==cantidadlargo) {
                System.out.println("No puede ingreasr la misma cantidad de ancho que de larog");
            } else {
                ancho=cantidadancho;
                largo=cantidadlargo;
                System.out.println("Ingrese un numero");
                System.out.println("1 para el calculo de area");
                System.out.println("2 Para el calculo de perimetro");
                int opcion = lector.nextInt();
                    if (opcion==1) {
                        System.out.println(Area(ancho,largo));
                    } else {
                        System.out.println(perimetro(ancho,largo));
                    }
                
            }
    
    }   
    public rectangulo(){
        solicitarInfo();
    }
    
        
        
    public rectangulo(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    
    
    
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    
    
    
    
    
}
