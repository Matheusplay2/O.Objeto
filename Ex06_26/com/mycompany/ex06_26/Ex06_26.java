

package com.mycompany.ex06_26;

import classes.Estudante;
import classes.Telefone;
import classes.GerenciadorEstudante;
import java.util.Scanner;


public class Ex06_26 {

    public static void main(String[] args) {
        Scanner ler= new Scanner (System.in);
        GerenciadorEstudante Estudante=  new  GerenciadorEstudante();
        Estudante e1=new Estudante();
        PreencherEst(ler, e1);
        Telefone t1= new Telefone("32 ", "8737634", " utfyevd"," computacao");
        e1.geTel().addTel(t1);
        System.out.println("Todos os contatos do Estudante 1");
        e1.geTel().listar();
        
        
        Estudante e2=new Estudante("Ana ", "65363"," oi@gmail"," direito");
        Telefone t2= new Telefone("32","874673"," 55+(ddd)","Vivo");
        Telefone t3=new Telefone("33", "7646647"," 55+(ddd)", " claro");
        e2.geTel().addTel(t3);
        System.out.println("  Todos os contatos do Estudante 2");
        e2.geTel().listar();
        e2.geTel().addTel(t2);
        
        Estudante e3=new Estudante();
        
        PreencherEst(ler,e3);
        Telefone t4=new Telefone();
        Telefone t5=new Telefone();
        PreencherTel(ler ,t4);
        PreencherTel(ler,t5);
        e3.geTel().addTel(t4);
        e3.geTel().addTel(t5);
        System.out.println("Todos os contatos do Estudante 3");
        e3.geTel().listar();
        
        Estudante e4=new Estudante(" Matheus","232232","2025.com ","Computacao");
        Telefone t6=new Telefone();
        PreencherTel(ler, t6);
        e4.geTel().addTel(t6);
        System.out.println("Todos os contatos do Estudante4");
        e4.geTel().listar(); 
        
        Estudante e5= new Estudante();   
        PreencherEst(ler ,e5);
        Telefone t7= new Telefone();
        PreencherTel(ler, t7);
        Telefone t8=new Telefone();
        PreencherTel(ler , t8);
        e5.geTel().addTel(t7);
        e5.geTel().addTel(t8);
         System.out.println("Todos os contatos do Estudante 5");
         e5.geTel().listar();
      
        Estudante.addEstudante(e1);
        Estudante.addEstudante(e2);
        Estudante.addEstudante(e3);
        Estudante.addEstudante(e4);
        Estudante.addEstudante(e5);
        
        verificarDdd(Estudante ,"32");
        
      /*  int opcao= menu(ler);
        do{
        if (opcao==1){
            Telefone t = new Telefone();
            PreencherTel(ler , t);
            t1.addTel(t);
            
        }else if(opcao==2){
            System.out.print("Digite um numero para ser removido:");
            String numero=ler.nextLine();
            t1.removeTel(numero);
            
        }else if(opcao== 3){
            System.out.println("Insira os dados abaixo para pesquisar");
            System.out.print("Digite o DDD:");
            String ddd=ler.nextLine();
            System.out.print("Digite um numero:");
            String numero=ler.nextLine();
            t1.pesquisar(ddd, numero);
        }else if( opcao == 4){
            System.out.println("----------------------------------");
            System.out.println("Lista de contatos");
            t1.listar();
            System.out.println("---------------------------------");
        }else{
            System.out.println(" Saindo ");
        }
        
        }while(opcao != 5); 
    }*/
     
        }
    public static void verificarDdd( GerenciadorEstudante Est,String ddd){
    
    for(Estudante e : Est.getLstEstudante()){ 
        
        for(Telefone t : e.geTel().getLstTel()){ 
            
            if(t.getDdd().equals(ddd)){
                System.out.println("Estudante: " + e.getNome() + " possui telefone com DDD " + ddd);
            }
        }
    }
}
      
    public static int menu(Scanner ler ){
        System.out.println("--------------------------- MENU --------------------");
        System.out.println("1-Adicionar contato");
        System.out.println("2- Remover contato");
        System.out.println("3-Pesquisar");
        System.out.println("4-Listar Todos Contatos");
        System.out.print("5-Sair");
        System.out.println("-----------------------------------------------------");
        System.out.print(  "Escolha uma opcao:");
        int opcao=ler.nextInt();
        ler.nextLine();
        return opcao;
        
        
    }
    
    
    public static void PreencherTel( Scanner ler,Telefone t){
        System.out.println(" PREENCHENDO DADOS DO TELEFONE");
        System.out.print("DDD:");
        t.setDdd(ler.nextLine());
        System.out.print("Numero:");
        t.setNumero(ler.nextLine());
        System.out.print("Descricao:");
        t.setDescricao(ler.nextLine());
        System.out.print("Operadora:");
        t.setOperadora(ler.nextLine());
        
  
       
    }
    public static void PreencherEst(Scanner ler , Estudante e){
        System.out.println(" PREENCHENDO DADOS DO ESTUDANTE ");
        System.out.print("Nome:");
        e.setNome(ler.nextLine());
        System.out.print("Matricula:");
        e.setMatricula(ler.nextLine());
        System.out.print("Email:");
        e.setEmail(ler.nextLine());
        System.out.print("Curso:");
        e.setCurso(ler.nextLine());
        
      
    }
}
