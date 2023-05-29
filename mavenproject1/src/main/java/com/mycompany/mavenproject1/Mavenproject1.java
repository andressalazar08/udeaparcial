/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author miude
 */
//clase principal
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Instanciamos los objetos
        //<Nombre_de_la_clase>  <Nombre_Variable> = new <clase_a_instanciar>
        Maritimo objMaritimo = new Maritimo();
        
        objMaritimo.setId(159);
        
        System.out.println("Id del objeto maritimo " + objMaritimo.getId());
    }
}
