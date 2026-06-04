
package com.mycompany.ex01_41;

import com.mycompany.ex01_41.classes.Produto;
import java.util.Scanner;


public class Perecivel extends Produto{
    private double peso;

    public Perecivel() {
        super();
        this.peso=0.0;
    }

    public Perecivel(String cod, String nome, double custo, double preco,double peso) {
        super(cod, nome, custo, preco);
        this.peso = peso;
    }
    
    
    @Override
    public void  preencher(){
        Scanner ler= new Scanner(System.in);
        super.preencher();
        System.out.print("Digite o peso:");
        this.peso=ler.nextDouble();
    }
    
    @Override
    public String toString(){
       return "Produto Perecivel"+super.toString()+",Peso:Kg"+this.peso+"}";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.peso) ^ 
                (Double.doubleToLongBits(this.peso) >>> 32));
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
        final Perecivel other = (Perecivel) obj;
        return Double.doubleToLongBits(this.peso) == Double.doubleToLongBits(other.peso);
    }
    
    public void copiar(Perecivel outro){
        super.copiar(outro);
        this.peso=outro.getPeso();
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public void setPeso(double peso){ 
        this.peso=peso;
    }
    
}
