package boletin_6_5;
import javax.swing.JOptionPane;

public class Boletin_6_5 {

    public static void main(String[] args) {
        try{
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Dame un número:"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Dame otro distinto:"));
            if(n1 == n2){
                JOptionPane.showMessageDialog(null,"No son distintos.");
            }else{
                int n3 = Integer.parseInt(JOptionPane.showInputDialog("Dame otro más:"));
                if(n3 == n1 || n3 == n2){
                    JOptionPane.showMessageDialog(null,"No son distintos.");
                }else{
                    if(n1 > n2 && n1 > n3){
                        JOptionPane.showMessageDialog(null,"El primer número es el mayor de todos.");
                    }else if(n2 > n1 && n2 > n3){
                        JOptionPane.showMessageDialog(null,"El segundo número es el mayor de todos.");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"El tercer número es el mayor de todos.");
                    }
                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Formato incorrecto");
        }
    }
    
}
