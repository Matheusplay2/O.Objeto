
package com.mycompany.ex02_41.subClasses;

import com.mycompany.ex02_41.superClasse.Funcionario;
import java.util.Objects;
import java.util.Scanner;


public class Gerente  extends Funcionario{
    private String setor;

    public Gerente() {
        super();
        this.setor="";
    }

    public Gerente( String nome, String cpf, int idd,String setor) {
        super(nome, cpf, idd);
        this.setor = setor;
    }
    
    
    @Override
    public void preencher(){
        Scanner ler= new Scanner(System.in);
        super.preencher();
        System.out.print("Digite seu setor:");
        this.setor=ler.nextLine();
    }
    @Override
    public void imprimir(){
        System.out.println(this);
        
    }
    @Override
    public String toString(){
       return super.toString()+"\nSetor:"+this.setor;
    }
    public void copiar(Gerente outro){
        super.copiar(outro);
        this.setor=outro.getSetor();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.setor);
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
        final Gerente other = (Gerente) obj;
        return Objects.equals(this.setor, other.setor);
    }
    
    
    
    
    
    

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
  
    
}
