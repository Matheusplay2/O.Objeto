
package com.mycompany.ex01_41;

import com.mycompany.ex01_41.classes.Produto;
import java.util.Objects;
import java.util.Scanner;


public class Movel extends Produto {
    private String cor;

    public Movel() {
        super();
        this.cor="";
    }

    public Movel( String cod, String nome, double custo, double preco,String cor) {
        super(cod, nome, custo, preco);
        this.cor = cor;
    }
    
    
    public void copiar(Movel outro){
        super.copiar(outro);
        this.cor=outro.getCor();
    }
    
    public void preeencher(){
        super.preencher();
        Scanner ler = new Scanner(System.in);
        System.out.print("Cor:");
        this.cor= ler.nextLine();
        
    }
    @Override
    public void imprimir(){
        System.out.println(this);
    }
    
    @Override
    public String toString(){
     return "Produto Movel  " + super.toString()+",Cor:"+this.cor+"}";
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.cor);
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
        final Movel other = (Movel) obj;
        return Objects.equals(this.cor, other.cor);
    }
    
    
    public String getCor(){
      return this.cor;  
    }
    public void setCor(String cor){
       this.cor=cor; 
    }
}
