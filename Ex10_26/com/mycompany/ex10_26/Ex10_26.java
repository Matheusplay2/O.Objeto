
package com.mycompany.ex10_26;

import classes.Autor;
import classes.Biblioteca;
import classes.Livro;
import java.util.Scanner;


public class Ex10_26 {
    
  
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
         int opcao;
         Biblioteca bbt= new Biblioteca();
         Livro livro= new Livro();
     
        do{
           opcao=menu(ler);
            
           if (opcao==1){
               Autor a=new Autor();
               preencherAutor(ler ,a);
               livro.addAutor(a);
           }else if (opcao==2){
               System.out.print("Digite nome do autor a ser removido:");
               String nomeAutor= ler.nextLine();
               livro.removerAutor(nomeAutor);
           }else if(opcao==3){
               System.out.print("Digite nome do autor a ser pesquisado:");
               String nomeAutor= ler.nextLine();
               livro.pesquisarAutor(nomeAutor);
           }else if(opcao==4){
               System.out.print("Digite cidade natal do autor que deseja pesquisar:"); 
               String cddNatal=ler.nextLine();
               livro.pesquisarAutorPcdd(cddNatal);
      
           }else if(opcao ==5){
               
              livro.ListarAutor();
           }else if(opcao==6){
             Livro l1= new Livro();
             preecherLivro(ler, l1);
             bbt.addLivro(l1);
             
            
           } else if(opcao==7){
               System.out.print("Digite titulo do Livro que deseja remover:");
               String titulo=ler.nextLine();
               bbt.removerLivro(titulo);
               
           }else if(opcao==8){
               System.out.print("Digite o titilo do livro que deseja pesquisar:");
               String titulo=ler.nextLine();
               bbt.pesquisarLivroPTitulo(titulo);
        
           }else if (opcao==9){
               System.out.print("Digite o autor do livro que deseja encontrar:");
               String nomeAutor=ler.nextLine();
               bbt.pesquisarPorAutor(nomeAutor);
           }else if(opcao==10){
               System.out.print("Digite cidade  natal do autor:");
               String cddNatal= ler.nextLine();
               bbt.pesquisarAutorPcdd(cddNatal);
               
           }else if(opcao ==11){
               bbt.ListarLivros();
               
           }else if  (opcao==12){
               
               System.out.println("Saindo..............");
               
           
        
           }
            
        }while(opcao !=12);
        
    }
    
    public static int menu(Scanner ler){
        
        System.out.println("---------------------------------");
        System.out.println("         /Menu/");
        System.out.println("1-Adicionar Autor");
        System.out.println("2-Remover Autor");
        System.out.println("3- Pesquisar Autor por nome");
        System.out.println("4- Pesquisar Autor por cidade Natal");
        System.out.println("5-Listar  todos os Autores");
        System.out.println("6-Adicionaar Livro");
        System.out.println("7-Remover Livro");
        System.out.println("8-Pesquisar Livro por Titulo");
        System.out.println("9-pesquisar Livro por Autor");
        System.out.println("10-Pesquisar autor por Cidade:");
        System.out.println("11-Listar  todos os Livros");
        System.out.println("12-Sair");
        System.out.println("----------------------------------");
        System.out.print("Digite uma opcao do Menu:");
        int opcao=ler.nextInt();
        ler.nextLine();
        return opcao;
    }
  
        
        
        
    
    public static void preecherLivro(Scanner ler , Livro l){
        System.out.println("     /PREENCHENDO LIVRO /         ");
        System.out.print("Titulo:");
        l.setNome(ler.nextLine());
        System.out.print("Ano de publicacao:");
        l.setAnoPublicacao(ler.nextInt());
        ler.nextLine();
    }
    
    public static void preencherAutor(Scanner ler , Autor a){
        
        System.out.println("      / PREENCHENDO AUTOR /");
        System.out.print("Nome:");
        a.setNome(ler.nextLine());
        System.out.print("Cidade natal:");
        a.setCddNatal(ler.nextLine());
        
    }
}
