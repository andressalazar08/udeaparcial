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
public class Proveedor {
    private String id;
    private String nombre;
    private ArrayList <Editorial> editoriales;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Editorial> getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(ArrayList<Editorial> editoriales) {
        this.editoriales = editoriales;
    }
    
//    //Composición
    Proveedor(){
        editoriales = new  ArrayList <Editorial>();
    }
//    //Agregación
//    Proveedor(){
//
//    }
    //agregarEditoriales()- crea el arrayList
}
