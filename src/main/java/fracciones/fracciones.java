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
public class fracciones {
    

Scanner lector = new Scanner(System.in);    
    int numerador, denominador;

    
     private int num;
     private int den;
  public fracciones() {
     num=0;
     den=1;
  }
  public fracciones(int x, int y) {
     num=x;
     den=y;
  }
  public static fracciones sumar(fracciones a, fracciones b){
     fracciones c=new fracciones();
     c.num=a.num*b.den+b.num*a.den;
     c.den=a.den*b.den;
     return c;
  }
  public static fracciones restar(fracciones a, fracciones b){
     fracciones c=new fracciones();
     c.num=a.num*b.den-b.num*a.den;
     c.den=a.den*b.den;
     return c;
  }

  public static fracciones multiplicar(fracciones a, fracciones b){
     return new fracciones(a.num*b.num, a.den*b.den);
  }
  public static fracciones inversa(fracciones a){
     return new fracciones(a.den, a.num);
  }
  public static fracciones dividir(fracciones a, fracciones b){
     return multiplicar(a, inversa(b));
  }

  private int mcd(){
     int u=Math.abs(num);
     int v=Math.abs(den);
     if(v==0){
          return u;
     }
     int r;
     while(v!=0){
          r=u%v;
          u=v;
          v=r;
     }
     return u;
  }

  public fracciones simplificar(){
     int dividir=mcd();
     num/=dividir;
     den/=dividir;
     return this;
  }

  public String toString(){
     String texto=num+" / "+den;
     return texto;
  }
    
}
