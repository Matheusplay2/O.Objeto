package com.mycompany.exercicio13;
import classe.Filme;
import classe.GerenciadorFilmes;
import java.util.Scanner;

public class Exercicio13 {
   
    public static int menu(Scanner ler) {
        int opcao;

        System.out.println("----------------------------");
        System.out.println("    ESCOLHA UMA OPCAO");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Remover");
        System.out.println("3 - Procurar");
        System.out.println("4-Listar todos os Filmes");
        System.out.println("5-Sair");
        System.out.println("----------------------------");
        System.out.print("Digite uma opcao acima:");
        opcao=ler.nextInt();
        ler.nextLine();

        return opcao;
    }
    public static void preencher(Scanner ler,Filme cinema){
        System.out.println("==========================");
        System.out.println("     /    PREENCHENDO   /");
        System.out.print("Nome do filme:");
        cinema.setTitulo(ler.nextLine());
        System.out.print("Nome do diretor:");
        cinema.setDiretor(ler.nextLine());
        System.out.print("Duracao do filme:");
        cinema.setDuracao(ler.nextDouble());
        System.out.print("Preco do Filme:");
        cinema.setPreco(ler.nextDouble());
      
    }
    public static void main(String[] args) {
         Scanner ler=new Scanner(System.in);
        GerenciadorFilmes gerenciador= new GerenciadorFilmes();
        int opcao;
       do{
           
            opcao=menu(ler);
           if (opcao==1){
               Filme f1=new Filme();
               preencher(ler,f1);
              gerenciador.adicionar(f1);
            
           }else if( opcao==2){
               System.out.print("Digite titulo do filme que deseja ser removido:");
               String titulo=ler.nextLine();
               gerenciador.remover(titulo);
               
           }else if(opcao==3){
               
               System.out.print("Diite titulo do titulo para pesquisar:");
               String titulo=ler.nextLine();
               System.out.print("Nome do autor:");
               String autor=ler.nextLine();
               gerenciador.pesquisar(titulo, autor);
           }else if (opcao==4){
               gerenciador.listar();
           
           
           }else if (opcao==5){
               System.out.println("Saindo........"); 
               
           }
       } while(opcao!=5);
        

    }
}