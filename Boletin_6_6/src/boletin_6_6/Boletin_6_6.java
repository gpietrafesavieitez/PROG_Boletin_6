package boletin_6_6;
import java.util.Scanner;

public class Boletin_6_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce o numero de ventas: ");
        try{
            int ventas = Integer.parseInt(leer.nextLine());
            if(ventas <= 100){
                System.out.println("Baixo.");
            }else if(ventas <= 500){
                System.out.println("Medio.");
            }else if(ventas <= 1000){
                System.out.println("Alto.");
            }else{
                System.out.println("Primeira necesidade.");
            }
        }catch(NumberFormatException e){
            System.out.println("Formato incorrecto.");
        }
    }
    
}
