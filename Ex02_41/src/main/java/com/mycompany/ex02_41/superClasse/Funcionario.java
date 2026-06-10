
package com.mycompany.ex02_41.superClasse;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author matheus henrique
 */

//usando esta classe como abstrata para proximo exercicio
//  seria vc meio que descrever o nome de um metodo e poder usa-lo em qualquer uma subClasse
// na superClasse ele tem que ser abstrato e nao vai ter nada dentro dele e para usar nas outras classes vc faz 
//o metodo que vc deseja para tal classe

//      NA SUPER-CLASSE 
//   abstract   public double  getBonificacao();

//      NA SUB-CLASSE
// public double getBonificacao(){
//  return  super.salario* 0.15;
// na classe filha vc faz a implementacao
//}

// DIGAMOS QUE SE A CLASSE FILHA NAO IMPLEMENTAR TODOS OS METODOS DA CLASSE PAI
// ELA IRA SE TORNAR UMA CLASSE ABSTRATA TBM 
// NAO PODENDO SER ISTANCIADA
//   abstract class Funcionario{
//    protected String nome;
//    protected String cpf;
//    protectede int idd;
//}
public class Funcionario {
    private String nome;
    private  String cpf;
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
