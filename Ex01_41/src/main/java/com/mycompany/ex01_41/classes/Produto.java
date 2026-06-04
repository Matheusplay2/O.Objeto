
package com.mycompany.ex01_41.classes;

import java.util.Objects;
import java.util.Scanner;


public class Produto {
    private String cod;
    private String nome;
    private double custo;
    private double preco;

    public Produto() {
        this.cod="";
        this.nome="";
        this.custo=0.0;
        this.preco=0.0;
    }

    public Produto(String cod, String nome, double custo, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.custo = custo;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return   "codigo:" + this.cod +
                ", Nome:" + this.nome +", Custo:R$"+ this.custo +
                ", Preco:R$" + this.preco ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.cod);
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.custo) ^ (Double.doubleToLongBits(this.custo) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (Double.doubleToLongBits(this.custo) != Double.doubleToLongBits(other.custo)) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (!Objects.equals(this.cod, other.cod)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
    
    public void copiar(Produto outro){
        this.cod=outro.getCod();
        this.nome=outro.getNome();
        this.custo=outro.getCusto();
        this.preco=outro.getPreco();
              
    }
    
    public void imprimir (){
        System.out.println(this);
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Codigo:");
        this.cod=ler.nextLine();
        System.out.print("Nome:");
        this.nome=ler.nextLine();
        System.out.print("Custo:");
        this.custo=ler.nextDouble();
        ler.nextLine();
        System.out.print("Preco:");
        this.preco=ler.nextDouble();
        ler.nextLine();
        
        
    }
    

    public String getCod(){
        return this.cod;
    }
    public void setCod(String cod){
        this.cod=cod;
    }
    public String getNome(){
       return this.nome; 
    }
    public void setNome(String nome){
      this.nome=nome;  
    }
    public double getCusto(){
        return this.custo;
    }
    public void setCusto(double custo){
        this.custo=custo;
    }
    public double getPreco(){
        return this.custo;
    }
    
    public void setPreco(double preco){
        this.preco=preco;
    }
    
}
