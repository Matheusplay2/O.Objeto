
package com.mycompany.ex03_32.classe;

import java.util.Objects;


public class Casa {
    private String endereco;
    private double area;
    private int numQuarto;
    private double preco;

    public Casa() {
        this.endereco="";
        this.area=0.0;
        this.numQuarto=0;
        this.preco=0.0;
                
    }

    public Casa(String endereco, double area, int numQuarto, double preco) {
        this.endereco = endereco;
        this.area = area;
        this.numQuarto = numQuarto;
        this.preco = preco;
    }
    public void copiar(Casa outro){
        this.endereco=outro.getEndereco();
        this.area=outro.getArea();
        this.numQuarto=outro.getNumQuarto();
        this.preco=outro.getPreco();
        
    }
    @Override
     public String toString(){
        return "Casa{Endereco:"+this.endereco+ 
                ",Area:"+this.area+"² "+",Numero de Quartos:"+this.numQuarto+
                ",Preco:R$"+this.preco+"}";
     }
     
     public void imprimir(){
         System.out.println(this);   
     }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.endereco);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.area) ^ (Double.doubleToLongBits(this.area) >>> 32));
        hash = 71 * hash + this.numQuarto;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
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
        final Casa other = (Casa) obj;
        if (Double.doubleToLongBits(this.area) != Double.doubleToLongBits(other.area)) {
            return false;
        }
        if (this.numQuarto != other.numQuarto) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        return Objects.equals(this.endereco, other.endereco);
    }
    
    
    
    
    public String getEndereco(){
     return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    public double getArea(){
       return this.area;
    }
    public void setArea(double area){
        this.area=area;
    }
    
    public int getNumQuarto(){
        return this.numQuarto;
    }
    public void setNumQuarto(int numQuarto){
        this.numQuarto= numQuarto;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
}