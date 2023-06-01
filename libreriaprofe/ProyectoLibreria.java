/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectolibreria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ángela Valderrama
 */
public class ProyectoLibreria {

    public static void main(String[] args) {
        System.out.println("Hello World!");     
        Scanner leer = new Scanner(System.in);
        int nroAutores;
//        
//        Libro objLibro = new Libro();
//        objLibro.setCodigoLibro(123);
//        objLibro.setTitulo("Roma soy yo");
//        objLibro.setEditorial("Santillana");
//        objLibro.setAnoEdicion(2022);
//        
//        objLibro.agregarAutor(875, "Santiago Posteguillo", "Español");
//        objLibro.agregarAutor(7485, "Maria Rodriguez", "Francesa");
//        
//        
//        System.out.println("Id del libro "+objLibro.getCodigoLibro());
////        System.out.println("Autor del libro "+objLibro.getAutores().get(0).getNombre());
////        System.out.println("Autor del libro "+objLibro.getAutores().get(1).getNombre());
////        
//        ArrayList<Autor> arregloAutores = objLibro.getAutores();
//        for(int i=0; i<arregloAutores.size();i++){
//             System.out.println("Autor del libro "+arregloAutores.get(i).getNombre());
//        }
       Tecnico objLibroTecnico = new Tecnico(1785, "JGT-001", 5);
       System.out.println("Id del libro "+objLibroTecnico.getCodigoLibro());
       
       System.out.println("¿Cuantos autores son? ");
       nroAutores = leer.nextInt();
       
       int idAutor;
       String nombreAutor, nacionalidadAutor;
       
       for(int i=0; i<nroAutores;i++){
         System.out.println("Ingrese el Id Autor");
         idAutor = leer.nextInt();
        
         System.out.println("Ingrese el nombre");
         nombreAutor = leer.next();
         
         System.out.println("Ingrese la nacionalidad Autor");
         nacionalidadAutor= leer.next();
         
         objLibroTecnico.agregarAutor(idAutor, nombreAutor, nacionalidadAutor);  
       }
       
       //objLibroTecnico.agregarAutor(953, "Luis Joyanes", "Argentina");
       ArrayList<Autor> arregloAutores = objLibroTecnico.getAutores();
        
        for(int i=0; i<arregloAutores.size();i++){
             System.out.println("Autor del libro "+arregloAutores.get(i).getNombre());
        }
       
        
        

        
    }
}
