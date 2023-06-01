/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectolibreria;

/**
 *
 * @author Ángela Valderrama
 */
public class Tecnico extends Libro {
    
      
    private String ISBN;
    private int nroCapitulos;

    Tecnico(int cl, String ISBN, int nc) {
        this.ISBN = ISBN;
        this.nroCapitulos = nc;
        super.setCodigoLibro(cl);    
    }
    Tecnico(){
        
    }
       
    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNroCapitulos() {
        return nroCapitulos;
    }

    public void setNroCapitulos(int nroCapitulos) {
        this.nroCapitulos = nroCapitulos;
    }
    
    
    
}
