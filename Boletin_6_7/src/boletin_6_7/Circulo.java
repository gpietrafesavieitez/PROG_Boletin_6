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
public class Circulo {
    private double radio;
    
    public Circulo(){
    }
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
}
