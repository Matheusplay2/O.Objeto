

package com.mycompany.main.estatico;

import classe.Livro;
import java.util.Scanner;

public class MainEstatico {

    public static void main(String[] args) {
      Scanner ler= new Scanner (System.in);
           
      Livro l1 =new Livro();
      Livro l2=new Livro ();
      
      
      preencher (ler,l1);
      preencher(ler,l2);
      
        System.out.println("===================");
        System.out.println("     / Antes /     ");
        System.out.println(Livro.nomeDaBiblioteca);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println("===================");
        
        System.out.println("   /  Novo nome /");
        Livro.nomeDaBiblioteca="Bibliote Escolar";
        System.out.println(Livro.nomeDaBiblioteca);
        
        
        System.out.println("=====================");
        System.out.println("    /Depois de ter trocado/");
        System.out.println(Livro.nomeDaBiblioteca);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println("======================");
    }
    
    
    
    public static void preencher(Scanner ler, Livro l1){
        System.out.println("===========================");
        System.out.println(  "    PREENCHENDO DADOS DO LIVRO  ");
        System.out.print("Digite titulo do livro:");
        l1.setTitulo(ler.nextLine());
        System.out.print("Digite nome do Autor:");
        l1.setAutor(ler.nextLine());
        System.out.print("Digite quantidade de paginas:");
        l1.setNumPag(ler.nextInt());
        ler.nextLine();
        System.out.println("============================");
    }
    
    
}
