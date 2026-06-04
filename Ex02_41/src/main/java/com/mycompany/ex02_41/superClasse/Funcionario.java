
package com.mycompany.ex02_41.superClasse;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author matheus henrique
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private int idd;

    public Funcionario() {
        this.nome="";
        this.cpf="";
        this.idd=0;
    }

    public Funcionario(String nome, String cpf, int idd) {
        this.nome = nome;
        this.cpf = cpf;
        this.idd = idd;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.cpf);
        hash = 23 * hash + this.idd;
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
        final Funcionario other = (Funcionario) obj;
        if (this.idd != other.idd) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.cpf, other.cpf);
    }
    
    public void imprimir(){
        System.out.println(this);
    }
    
    
    @Override
    public String toString(){
      return "\nNome:"+this.nome+
              "\nCPF:"+this.cpf+
              "\nIdade:"+this.idd;
        
    }
    
    public void copiar(Funcionario outro){
        this.nome=outro.getNome();
        this.cpf=outro.getCpf();
        this.idd=outro.getIdd();
        
    }
    public void preencher(){
        Scanner ler= new Scanner(System.in);
        
        System.out.print(" Digite seu Nome:");
        this.nome=ler.nextLine();
        System.out.print("Digite seu CPF:");
        this.cpf=ler.nextLine();
        System.out.print("Digite sua Idade:");
        this.idd=ler.nextInt();
                
        
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdd() {
        return this.idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }
    
}
