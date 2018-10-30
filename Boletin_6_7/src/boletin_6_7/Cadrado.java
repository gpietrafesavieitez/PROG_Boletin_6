/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_6_7;

/**
 *
 * @author gpietrafesavieitez
 */
public class Cadrado {
    private double lado;
    
    public Cadrado(){
    }
    
    public Cadrado(double lado){
        this.lado = lado;
    }
    
    public double calcularArea(){
        return lado*lado;
    }
}
