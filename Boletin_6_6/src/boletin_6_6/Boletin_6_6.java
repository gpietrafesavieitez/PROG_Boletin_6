package boletin_6_6;
import java.util.Scanner;

public class Boletin_6_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce o numero de ventas: ");
        try{
            int ventas = Integer.parseInt(leer.nextLine());
            if(ventas > 0){
                if(ventas <= 100){
                    System.out.println("Baixo.");
                }else if(ventas > 100 && ventas <= 500){
                    System.out.println("Medio.");
                }else if(ventas > 500 && ventas <= 1000){
                    System.out.println("Alto.");
                }else if(ventas > 1000){
                    System.out.println("Primeira necesidade.");
                }
            }else{
                System.out.println("Tan mal va la empresa?");
            }
        }catch(NumberFormatException e){
            System.out.println("Formato incorrecto.");
        }
    }
    
}
