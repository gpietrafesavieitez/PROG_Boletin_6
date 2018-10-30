package boletin_6_3;
import java.util.Scanner;

public class Boletin_6_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
        while(salir != true){
            System.out.print("Dame un número: ");
            try{
                int n = Integer.parseInt(leer.nextLine());
                if(n >= 0){
                    if(n == 0){
                        System.out.println("0");
                    }else{
                        System.out.println("+");
                    }
                }else{
                    System.out.println("-");
                }
                salir = true;
            }catch(NumberFormatException e){
                System.out.println("Formato incorrecto.");
            }
        }
    }
    
}
