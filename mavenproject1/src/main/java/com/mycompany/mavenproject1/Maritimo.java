/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author miude
 */
public class Maritimo extends Vehiculo{
    private int potenciaTurbina;

    public int getPotenciaTurbina() {
        return potenciaTurbina;
    }

    public void setPotenciaTurbina(int potenciaTurbina) {
        this.potenciaTurbina = potenciaTurbina;
    }
    Maritimo(int i, String m){
        super(i, m);
        
    }
    //Damos la posibilidad de un constructor sin parámetros
    Maritimo(){
        
    }
    
}
