/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectolibreria;

import java.util.ArrayList;

/**
 *
 * @author Angela
 */
public class Editorial {
    private String id;
    private ArrayList <Integer> codigoLibros = new ArrayList <Integer>();
    //Libro objLibro;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Integer> getCodigoLibros() {
        return codigoLibros;
    }

    public void setCodigoLibros(ArrayList<Integer> codigoLibros) {
        this.codigoLibros = codigoLibros;
    }
    
}
