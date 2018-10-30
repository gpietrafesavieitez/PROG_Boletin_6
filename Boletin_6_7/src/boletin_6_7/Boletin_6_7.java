package boletin_6_7;
import java.util.Scanner;

public class Boletin_6_7 {
    private static Scanner leer = new Scanner(System.in);
    private static Cadrado cadrado = new Cadrado();
    private static Triangulo triangulo = new Triangulo();
    private static Circulo circulo = new Circulo();
    
    private static int menu(){
        int opcion = 0;
        System.out.println("\n  __  __                         _         _           _ \n" +
" |  \\/  |___ _ _ _  _   _ __ _ _(_)_ _  __(_)_ __ __ _| |\n" +
" | |\\/| / -_| ' | || | | '_ | '_| | ' \\/ _| | '_ / _` | |\n" +
" |_|  |_\\___|_||_\\_,_| | .__|_| |_|_||_\\__|_| .__\\__,_|_|\n" +
"                       |_|                  |_|          \n"
                + "\n[1] Cadrado.\n"
                + "[2] Triangulo.\n"
                + "[3] Circulo.\n"
                + "[0] Salir.");
        try{ // Intenta convertir el input en int si no puede lanza excepcion y pone la var opcion a -1 
            opcion = Integer.parseInt(leer.nextLine());
        }catch(NumberFormatException e){
            opcion = -1;
        }
    return opcion;
    }
    
    public static void main(String[] args) {
        System.out.println("[*] Benvido a calculadora de areas. \n[*] Porfavor, escolla unha opcion das que aparecen a continuacion:");
        int opcion;
        do{
            opcion = menu();
            switch(opcion){
                case 0: System.out.println("\n[*] Ata logo!"); break;
                case 1: 
                    try{
                        System.out.print("\n[-] Deme o lado do cadrado: ");
                        cadrado.setLado(Double.parseDouble(leer.nextLine()));
                        System.out.println("\n[*] O area do cadrado e de: " + cadrado.calcularArea() + " unidade(s).");
                    }catch(NumberFormatException e){
                        System.out.println("\n[*] Formato incorrecto.");
                    }
                    break;
                case 2: 
                    try{
                        System.out.print("\n[-] Deme a base do triangulo: ");
                        triangulo.setBase(Double.parseDouble(leer.nextLine()));
                        System.out.print("\n[-] Deme a altura do triangulo: ");
                        triangulo.setAltura(Double.parseDouble(leer.nextLine()));
                        System.out.println("\n[*] O area do triangulo e de: " + triangulo.calcularArea() + " unidade(s).");
                    }catch(NumberFormatException e){
                        System.out.println("\n[*] Formato incorrecto.");
                    }
                    break;
                case 3:
                    try{
                        System.out.print("\n[-] Deme o radio do circulo: ");
                        circulo.setRadio(Double.parseDouble(leer.nextLine()));
                        System.out.println("\n[*] O area do circulo e de: " + circulo.calcularArea() + " unidade(s).");
                    }catch(NumberFormatException e){
                        System.out.println("\n[*] Formato incorrecto.");
                    }
                    break;
                default: System.out.println("\n[*] Elixa unha opcion valida.");
            }
        }while(opcion != 0);
    }
    
}
