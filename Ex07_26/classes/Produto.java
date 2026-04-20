
package classes;

import java.util.Objects;

public class Produto {
    private int cod;
    private String nome;
    private double  preco;

    public Produto() {
        this.cod=0;
        this.nome="";
        this.preco=0.0;
    }
   

    public Produto(int cod, String nome, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
    }
    public void copiar(Produto outro){
        this.cod=outro.getCod();
        this.nome=outro.getNome();
        this.preco=outro.getPreco();
    }
    public void imprimirProduto(){
        
        System.out.println(this);
    }
    @Override 
    public String toString(){
      return "Produto{Codigo:"+ this.cod +" Nome:"+this.nome+ " Preco:R$"+this.preco+ " }";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.cod;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
        return hash;
    }

    
    
    @Override 
public boolean equals(Object obj){
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;

    Produto outro = (Produto) obj;

    return this.cod == outro.cod &&
           this.nome.equals(outro.nome) &&
           this.preco == outro.preco;
}
    
    public int getCod(){
        return this.cod;
    }
    public void setCod(int cod){
        this.cod= cod;    
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
       this.nome=nome; 
    }
    public double getPreco(){
      return this.preco;  
    }
    public void setPreco(double preco){
        this.preco= preco;
    }
}
