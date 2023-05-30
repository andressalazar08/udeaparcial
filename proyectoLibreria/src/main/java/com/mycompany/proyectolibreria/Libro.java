/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectolibreria;

import java.util.ArrayList;

/**
 *
 * @author miude
 */
public class Libro {
    private  int codigoLibro;
    private String titulo;
    private String editorial;
    private int anoEdicion;
    private String formato; //Digita - fisico
    private int clasificacion;
    private int stock;
    private int valor;
    //Establecemos la relación entre el libro y el autor(es)
    //private ArrayList<Autor> Autores;//El libro va a tener objetos de tipo arrayList de la clase <autor>
    private ArrayList<Autor> Autores = new ArrayList<Autor>();//El libro va a tener objetos de tipo arrayList de la clase <autor>
    

    //constructor por defecto de la clase Libro
    Libro(){
        //Autores = new ArrayList<Autor>();
    }
    
    
    
    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigo) {
        this.codigoLibro = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnoEdicion() {
        return anoEdicion;
    }

    public void setAnoEdicion(int anoEdicion) {
        this.anoEdicion = anoEdicion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ArrayList<Autor> getAutores() {
        return Autores;//este método devuelve el array list conformado
    }

    public void setAutores(ArrayList Autores) {
        this.Autores = Autores;
    }
    
    
    public void agregarAutor(int idAutor, String nombreAutor, String Nacionalidad){
        Autor objAutor   = new Autor(idAutor,nombreAutor,Nacionalidad);
        
        this.Autores.add(objAutor);
    }
    
           
}
