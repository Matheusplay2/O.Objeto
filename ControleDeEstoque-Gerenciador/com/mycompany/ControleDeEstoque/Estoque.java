
package com.mycompany.ControleDeEstoque;
import classe.Produto;
import java.util.Scanner;
import classe.ControleDeEstoque;

public class Estoque {

    public static void main(String[] args) {
       Scanner ler=new Scanner(System.in);
       ControleDeEstoque p=new ControleDeEstoque();
       int opcao ;
       
       do{
           System.out.println("===============================================");
           System.out.println("            /     MENU     /     ");
           System.out.println("1-Adicionar Produto");
           System.out.println("2-Remover Produto");
           System.out.println("3-Atualizar Quantidade");
           System.out.println("4-Listar Produtos ");
           System.out.println("5-Buscar Produto");
           System.out.println("6 -Sair");
           System.out.println("===============================================");
           System.out.print( " Digite uma Opção do menu:");
           opcao=ler.nextInt();
           ler.nextLine();
           
       
       if (opcao==1){
           Produto p1=new Produto();
           preencher(ler,p1);
           p.adicionarProduto(p1);
          
       
       }  else if(opcao==2){
           System.out.print("Digite o codigo para remover produto:");
           String cod=ler.nextLine();
           boolean ok=p.removerProduto(cod);
        
       }else if(opcao==3){  
           System.out.print("Digite codigo do Produto para atualizar no Estoque:");
           String cod=ler.nextLine();
           System.out.print("Digite quantidade para ser atualizada:");
           int novaQtd=ler.nextInt();
           ler.nextLine();
         
           p.atualizarQuantidade(cod,novaQtd);
           
       }else if(opcao==4){
           System.out.println("Lista de todos os produtos");
           p.listarProdutos();
           
       }else if(opcao==5){
           System.out.print("Digite codigo para buscar produto:");
           String cod=ler.nextLine();
           Produto p1=p.buscarProduto(cod);
           if( p1 !=null){
               System.out.println("Produto Encontrado");
               System.out.println(p1);
           }else{
               System.out.println("Produto nao existente");
           }
       
       
       }else if (opcao==6){
           System.out.println("Saindo");
       }  else{  
           System.out.println("Opção Invalida");
       }
    }while(opcao!=6);
        
    }    
     
    public static void preencher(Scanner ler, Produto estoque ){
      System.out.print("Digite codigo do Produto:");
      estoque.setCodigo(ler.nextLine());
      System.out.print("Digite nome do produto:");
      estoque.setNome(ler.nextLine());
      System.out.print("Digite quantidade no estoque:");
      estoque.setQtd(ler.nextInt());
      ler.nextLine();
    
    }
   
}
