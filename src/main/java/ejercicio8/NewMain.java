/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;
import com.mycompany.introduccionaobjetos.circulo;
import com.mycompany.introduccionaobjetos.rectangulo;
import com.mycompany.introduccionaobjetos.programaObjetos;
import com.mycompany.introduccionaobjetos.cuadrado;
import fracciones.fracciones;
import libro.libros;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        programaObjetos p1 = new programaObjetos();
        programaObjetos p2=p1;
        System.out.println(p2.incremento(3));
        System.out.println(p2.decrecimiento(3));

        // _________________________________
        cuadrado c1 = new cuadrado();
        cuadrado c2 = c1;
        c2.solicitarInfo();
        //___________________________
        rectangulo r1 = new rectangulo();
        rectangulo r2 = r1;
        r2.solicitarInfo();;
        //____________________________________
        
        fracciones f1 = new fracciones();
        fracciones f2 = f1;
        //____________________________-
        libros l1 = new libros();
        libros l2 = l1;
        
        
        
        
        //________________
        circulo cir = new circulo(5);
        circulo cir2= cir;
        cir2.setRadio(4);
        System.out.println("Area:"+cir2.Area(4));
        System.out.println("perimetro"+cir2.perimetro(4));
        cir2.solicitarInfo();
        
    }
    
}
