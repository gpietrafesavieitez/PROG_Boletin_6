package boletin_6_1;
import javax.swing.JOptionPane;

public class Boletin_6_1 {
    
    public static void main(String[] args) {
        boolean salir = false;
        while(salir != true){
            try{
                int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número :"));
                if(n >= 0){
                    JOptionPane.showMessageDialog(null, "É positivo.");
                }
                salir = true;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Formato incorrecto.");
            }
        }
    }
    
}
