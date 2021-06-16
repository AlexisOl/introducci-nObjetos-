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
public class circulo {
 Scanner lector = new Scanner(System.in);
   int radio;
    public static void main(String[] args) {
        circulo inicio = new circulo();
        
    }
     public double Area(int rad){
        double area =0;
        area = rad*rad*Math.PI;
        return area;
    }
    
    public double perimetro(int rad){
        double perimetro=0;
        perimetro = 2*rad*Math.PI;
        return perimetro;
    }
    
     public void solicitarInfo(){
        System.out.println("Ingrese el valor del radio del circulo");
        radio=lector.nextInt();
           System.out.println("Ingrese un numero");
        System.out.println("1 para el calculo de area");
        System.out.println("2 Para el calculo de perimetro");
       
                
        int opcion = lector.nextInt();
            if (opcion==1) {
                System.out.println(Area(radio));
            } else {
                System.out.println(perimetro(radio));
            }
    }
    
    
    public circulo(){
      solicitarInfo();  
        
        
        
    }
    
    public circulo(int radio) {
        this.radio = radio;
    }
    
    
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    
    
    
    
}
