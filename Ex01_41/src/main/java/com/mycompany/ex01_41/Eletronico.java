
package com.mycompany.ex01_41;

import com.mycompany.ex01_41.classes.Produto;
import java.util.Objects;
import java.util.Scanner;


public class Eletronico extends Produto{
    private String voltagem;

    public Eletronico() {
        super();
        this.voltagem="";
    }

    public Eletronico( String cod, String nome, double custo, double preco,String voltagem) {
        super(cod, nome, custo, preco);
        this.voltagem = voltagem;
    }
      
    
    @Override
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        super.preencher();
        System.out.print("Voltagem:");
        this.voltagem=ler.nextLine();
        
        
    }
    
    @Override
    public void imprimir(){
        System.out.println(this);  
        
    }
    
    public void copiar(Eletronico outro){
        super.copiar(outro);
        this.voltagem=outro.getVoltagem();
    }
  
    public String toString(){
        return "Produto  Eletronico "+super.toString()+ ",Voltagem:"+this.voltagem+"}";
        
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.voltagem);
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
        final Eletronico other = (Eletronico) obj;
        return Objects.equals(this.voltagem, other.voltagem);
    }
    
    
    public String getVoltagem(){
        return this.voltagem;
    }
    
    public void setVoltagem(String voltagem){
        this.voltagem=voltagem;
    }
}
