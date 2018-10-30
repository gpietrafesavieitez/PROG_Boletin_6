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
public class Triangulo {
    private double base,altura;
    
    public Triangulo(){
    }
    
    public Triangulo(double base,double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double calcularArea(){
        return (base * altura) / 2;
    }
}
