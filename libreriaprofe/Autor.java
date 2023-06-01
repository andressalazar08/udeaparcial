/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectolibreria;

/**
 *
 * @author Ángela Valderrama
 */
public class Autor {
    private int idAutor;
    private String nombre;
    private String nacionalidad;
    
    Autor(){
        
    }
    Autor(int id, String n, String nacionalidad){
        this.idAutor = id;
        this.nombre = n;
        this.nacionalidad=nacionalidad;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    

    
    
}
