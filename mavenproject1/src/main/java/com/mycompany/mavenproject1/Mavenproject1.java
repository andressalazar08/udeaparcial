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
        
        objMaritimo.setPotenciaTurbina(1500);
//        
        System.out.println("La potencia del objeto turbina es: " + objMaritimo.getPotenciaTurbina());
        
        Vehiculo objVehiculo = new Vehiculo();
        objVehiculo.setMarca("Chevrolet");
        System.out.println("Un objeto padre y su marca: "+ objVehiculo.getMarca());
        
        
        
        Maritimo objMaritimo2 = new Maritimo(753, "Yamaha");
        objMaritimo2.setPotenciaTurbina(25000);
        
        System.out.println("Id maritimo 1" + objMaritimo.getId());
        System.out.println("Id maritimo 2 por herencia " + objMaritimo2.getId());
        
        
        motoAcuatica objMa = new motoAcuatica();
        objMa.setId(785);
        
    }
}
