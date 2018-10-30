package boletin_6_2;

import javax.swing.JOptionPane;

public class Boletin_6_2 {

    public static void main(String[] args) {
        short num1 = Short.parseShort(JOptionPane.showInputDialog("Dame número 1: "));
        short num2 = Short.parseShort(JOptionPane.showInputDialog("Dame número 2: "));
        if(num1 > num2 || num1 == num2){
            JOptionPane.showMessageDialog(null,"A resta de ambos números é " + (num1 - num2));
        }
        JOptionPane.showMessageDialog(null,"A suma é " + (num1 + num2));
    }
    
}
