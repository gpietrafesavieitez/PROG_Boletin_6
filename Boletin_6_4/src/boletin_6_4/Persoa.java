package boletin_6_4;

public class Persoa {
    private String nome;
    private float peso;
    
    public Persoa(){
        
    }
    
    public Persoa(String nome,float peso){
        this.nome = nome;
        this.peso = peso;
    }
    
    public String getNome(){
        return nome;
    }
    
    public float getPeso(){
        return peso;
    }
}
