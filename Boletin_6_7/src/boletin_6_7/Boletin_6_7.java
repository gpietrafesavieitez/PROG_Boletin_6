package boletin_6_7;

public class Boletin_6_7 {

    public static void main(String[] args) {
        Cadrado cadrado = new Cadrado(5);
        Triangulo triangulo = new Triangulo(10,20);
        Circulo circulo = new Circulo(15);
        System.out.println(cadrado.calcularArea());
        System.out.println(triangulo.calcularArea());
        System.out.println(circulo.calcularArea());
    }
    
}
