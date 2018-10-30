package boletin_6_4;

public class Boletin_6_4 {
    
    public static void main(String[] args) {
        Persoa persoa1 = new Persoa("Pedro",65.3f);
        Persoa persoa2 = new Persoa("Ana",63.5f);
        
        if(persoa1.getPeso() > persoa2.getPeso()){
            System.out.println(persoa1.getNome() + " pesa más que " + persoa2.getNome());
            System.out.println("La diferencia de peso es de: " + (persoa1.getPeso() - persoa2.getPeso()) + " kilos.");
        }else{
            System.out.println(persoa2.getNome() + " pesa más que " + persoa1.getNome());
            System.out.println("La diferencia de peso es de: " + (persoa2.getPeso() - persoa1.getPeso()) + " kilos.");
        }
        
    }
    
}
