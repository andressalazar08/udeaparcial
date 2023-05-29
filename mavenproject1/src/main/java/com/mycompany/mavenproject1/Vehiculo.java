/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author miude
 */
public class Vehiculo {
    
    private int id;
    private String marca;
    
    //definición de un constructor
    //el constructor tiene el mismo nombre de la clase
    Vehiculo(int i, String m){
        this.id=i;
        this.marca=m;
    }
    //la profe recomienda dejar instanciado el constructor
    Vehiculo(){
        
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

   

    
}
