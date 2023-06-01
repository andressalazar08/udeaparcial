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
    
    objLibro1.setTitulo("Roma");
    objLibro1.setAnoEdicion(2022);
    objLibro1.agregarAutor(875,"Santiago Posteguillo", "Español");
    objLibro1.agregarAutor(416,"Rosa Perez", "Francesa");
    
    
    //comprobamos los autores, hasta aquí entrega la posición en memoria
        System.out.println("Autores " + objLibro1.getAutores());
        
    //comprobamos los autores, hasta aquí entrega la posición en memoria
        System.out.println("Autores " + objLibro1.getAutores().get(0).getNombre());
        System.out.println("Autores " + objLibro1.getAutores().get(1).getNombre());
        
        System.out.println("Tipo ciclo");
        //<>
        for(int i=0;i<objLibro1.getAutores().size() ; i++){
            
            System.out.println("Autore del libro:  " + objLibro1.getAutores().get(i).getNombre());
        }
        
        //Para crear un objeto de la clase Tecnico
        Tecnico objLibroTecnico =  new Tecnico(241,"jgt-001", 5);
        
       // objLibroTecnico = 
        
        
        
    } 
    
    
}
