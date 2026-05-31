
package com.mycompany.ex04_32.classes;

import java.util.Objects;

public class Livro {
    private String titulo;
    private String autor;
    private int numPag;
    private double preco;

    public Livro() {
        this.titulo="";
        this.autor="";
        this.numPag=0;
        this.preco=0.0;
    }
    
    
    public void copiar(Livro outro){
        this.titulo=outro.getTitulo();
        this.autor=outro.getAutor();
        this.numPag=outro.getNumPag();
        this.preco=outro.getNumPag();
        
    }
    
    
    @Override
    public String toString(){
        return " Livro{Titulo:"+this.titulo+
                ",Autor:"+this.autor+
                ",Numero de Paginas:"+ this.numPag+
                ",Preco:R$"+ this.preco+"}";
     
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.titulo);
        hash = 37 * hash + Objects.hashCode(this.autor);
        hash = 37 * hash + this.numPag;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
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
        final Livro other = (Livro) obj;
        if (this.numPag != other.numPag) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }
    
    
    
    
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
       this.titulo=titulo; 
    }
    public String getAutor(){
        return this.autor;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    public int getNumPag(){
        return this.numPag;
    }
    public void setNumPag(int numPag){
        this.numPag=numPag;
    }
    
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
}
