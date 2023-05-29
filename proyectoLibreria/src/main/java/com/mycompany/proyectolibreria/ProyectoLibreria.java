/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectolibreria;

/**
 *
 * @author miude
 */
public class ProyectoLibreria {

    public static void main(String[] args) {
        System.out.println("Hello World!");
 
    
    //creo el objeto
    Libro objLibro1 =  new Libro();
    objLibro1.setCodigo(123);
    objLibro1.setTitulo("Roma");
    objLibro1.setAnoEdicion(2022);
    objLibro1.agregarAutor(875,"Santiago Posteguillo", "Español");
    objLibro1.agregarAutor(416,"Rosa Perez", "Francesa");
    
    
    } 
    
    
}
