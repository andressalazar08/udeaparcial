/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectolibreria;

/**
 *
 * @author miude
 */
public class Autor {
    private int idAutor;
    private String nombre;
    private String nacionalidad;
    
       //La recomendación es programar los constructores: vacío y otro con los parámetros reales
    Autor(){
        
    }
    //constructor con los parámetros de entrada
    Autor(int id, String n, String nac ){
        this.idAutor = id;
        this.nombre = n;
        this.nacionalidad=nac;
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
