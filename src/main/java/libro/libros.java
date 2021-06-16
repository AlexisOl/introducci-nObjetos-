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
public class libros {
    private String titulo, autor;
    private int canitdadEjemplares, prestados;
    Scanner lector = new Scanner(System.in);
   

    public libros(String titulo, String autor, int canitdadEjemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.canitdadEjemplares = canitdadEjemplares;
        this.prestados = prestados;
    }

    public libros() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCanitdadEjemplares() {
        return canitdadEjemplares;
    }

    public void setCanitdadEjemplares(int canitdadEjemplares) {
        this.canitdadEjemplares = canitdadEjemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
   
    
    public boolean prestamo(){
        boolean prestado=true;
        if (canitdadEjemplares<prestados) {
            prestados++;
        } else {
            prestado=false;
        }
        
        return prestado;
    }
    
    public boolean devolver(){
        boolean devuelto =true;
                if (prestados==0) {
                devuelto = false;
                } else {
                prestados--;
                }
                return devuelto;
        }
}
