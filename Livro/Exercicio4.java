
package com.mycompany.exercicio4;


public class Exercicio4 {

    public static void main(String[] args) {
        
        Livro l1;
      
        l1= new Livro();
        l1.preencher();
        System.out.println();
        System.out.println("  LIVRO 1  ");
        l1.imprimir();
        
        Livro l2;
        l2 =new Livro();
        l2.preencher();
        System.out.println();
        System.out.println("LIVRO 2");
        l2.imprimir();
        
        System.out.println();
        
        Livro l3;
        l3= new Livro();
        l3.copiar(l2);
        System.out.println("LIVRO 3");
        l3.imprimir();
     
        
    }
}
