
package com.mycompany.ex02_41.subClasses;

import com.mycompany.ex02_41.superClasse.Funcionario;
import java.util.Objects;
import java.util.Scanner;


public class Secretario  extends Funcionario {
    private String nivelEscolaridade;
    private String software;

    public Secretario() {
        super();
        this.nivelEscolaridade="";
        this.software="";
    }
    
    
    
    public Secretario(String nome, String cpf,int idd, String nivelEscolaridade, String software){
        super(nome,cpf,idd);
        this.nivelEscolaridade=nivelEscolaridade;
        this.software=software;
    
    }
    
    @Override
    public void imprimir(){
        System.out.println(this);
        
    }
    
    
    @Override
    public void preencher(){
        Scanner ler= new Scanner(System.in);
        super.preencher();
        System.out.print("Digite seu nivel de escolaridade:");
        this.nivelEscolaridade=ler.nextLine();
        System.out.print("Software principal (ex: Excel, Google Workspace): ");
        this.software=ler.nextLine();
        
    }
    
    @Override
    public String toString(){
        return  super.toString()+"\nNivel de Escolaridade:"+this.nivelEscolaridade+
                "\nSoftware Principal:"+this.software;
    }
    
    public void copiar(Secretario outro){
        super.copiar(outro);
        this.nivelEscolaridade=outro.getNivelEscolaridade();
        this.software=outro.getSoftware();
        
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nivelEscolaridade);
        hash = 67 * hash + Objects.hashCode(this.software);
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
        final Secretario other = (Secretario) obj;
        if (!Objects.equals(this.nivelEscolaridade, other.nivelEscolaridade)) {
            return false;
        }
        return Objects.equals(this.software, other.software);
    }
    
    
    
    public String getNivelEscolaridade(){
       return this.nivelEscolaridade; 
    }
    
    public void setNivelEscolaridade(String nivelEscolaridade){
        this.nivelEscolaridade=nivelEscolaridade;
    }
    
    public String getSoftware(){
       return this.software; 
    }
    public void setSoftware(String software){
       this.software=software; 
        
    }
}
