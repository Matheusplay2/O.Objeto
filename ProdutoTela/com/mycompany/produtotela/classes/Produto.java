package com.mycompany.produtotela.classes;

import java.util.Objects;


public class Produto {
    private String codigo;
    private String nome;   
    private double custo;
    private double preco;

    public Produto() {
        this.codigo="";
        this.nome="";
        
        this.preco=0.0;
        this.custo=0.0;
    }

    public Produto(String codigo, String nome, double preco, double custo) {
        this.codigo = codigo;
        this.nome = nome;
        this.custo=custo;
        this.preco=preco;
    }
    
    
    
    @Override
    public String  toString(){
        
        return "Produto{ Codigo:"+ this.codigo
                +" Nome do Produto:"+ this.nome
                +" Preco:R$"+ this.preco+ " Custo:R$"+this.custo+"}";
        
    }


    
    public void copiar(Produto outro){
        this.codigo=outro.getCodigo();
        this.nome=outro.getNome();
        this.preco=outro.getPreco();
        this.custo=outro.getCusto();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.codigo);
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.custo) ^ (Double.doubleToLongBits(this.custo) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
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
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
    
    
    
    public String getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
   
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public void setNome(String nome){
        this.nome=nome;
    
    
    }
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
    public double getCusto(){
        return this.custo;
    }
    public void setCusto(double custo){
        this.custo=custo;
    }
}
