
package com.mycompany.ex02_41.subClasses;

import com.mycompany.ex02_41.superClasse.Funcionario;
import java.util.Objects;
import java.util.Scanner;


public class Diretor extends Funcionario {
    private String departamento;

    public Diretor() {
        super();
        this.departamento = "";
    }
    
  
    public Diretor(String nome,String cpf,int idd,String departamento){
        super(nome, cpf, idd);
        this.departamento=departamento;
    }
    
    
    @Override
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        super.preencher();
        System.out.print("Digite seu departamento:");
        this.departamento= ler.nextLine();
    }
    
    
    @Override
    public void imprimir(){
        System.out.println(this); 
    }
    
    
    public void copiar(Diretor outro){    
       super.copiar(outro);
       this.departamento=outro.getDepartamento();
        
        
    }
    @Override
     public String toString(){
        return super.toString()+"\nDepartamento:"+this.departamento;
         
     }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.departamento);
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
        final Diretor other = (Diretor) obj;
        return Objects.equals(this.departamento, other.departamento);
    }
    
    
    public String getDepartamento(){
       return this.departamento; 
        
    }
    
    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }
       
}
