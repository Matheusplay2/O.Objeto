/*nome:String - idade:int - matricula:String - anoIngresso:int*/

package com.mycompany.exercicio3;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private int idade;
    private int matricula;
    private int anoIngresso;

    public Aluno() {
    }

    public Aluno ( String nome, int idade, int matricula, int anoIngresso){
        this.nome=nome;
        this.idade=idade;
        this.matricula=matricula;
        this.anoIngresso= anoIngresso;
    }
    
    public void copiar( Aluno outro){
        this.nome= outro.getNome();
        this.idade= outro.getIdade();
        this.matricula=outro.getMatricula();
        this.anoIngresso=outro.getAnoIngresso();
        
    }
    
    public void Preencher (){
        Scanner ler =new Scanner(System.in);
        System.out.println( "    PREENCHENDO DADOS    ");
        System.out.println();
        
        System.out.println(" Digite seu nome:");
        this.nome=ler.nextLine();
        System.out.println ( " Insira sua idade:");
        this.idade=ler.nextInt();
        System.out.println(" Digite sua matricula:");
        this.matricula=ler.nextInt();
        System.out.println ( " Digite seu ano de ingressao:");
        this.anoIngresso=ler.nextInt();
        
    }
    
    public void imprimir(){
        System.out.println( "        DADOS        ");
        
        System.out.println( " Nome:" + this.nome);
        System.out.println(" Idade:"+ this.idade);
        System.out.println( " Matricula:" + this.matricula);
        System.out.println( " Ano de Ingressao:" + this.anoIngresso);
    }

    public String getNome() {
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public int getMatricula(){
        return matricula;
    }
        
    public int getAnoIngresso (){
        return anoIngresso;
    }
    
    public void setNome(String nome){
        this.nome= nome;
    }
    public void setIdade ( int idade){
        this.idade=idade;
    }
    public void setMatricula( int matricula){
        this.matricula= matricula;
    }
    public void setAnoIngresso( int anoIngresso){
        this.anoIngresso= anoIngresso;
    }
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

