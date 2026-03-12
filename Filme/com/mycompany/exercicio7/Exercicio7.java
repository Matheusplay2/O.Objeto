
package com.mycompany.exercicio7;
import classe.Filme;


public class Exercicio7 {

    public static void main(String[] args) {
        Filme f1;
        Filme f2;
        
        f1=new Filme();
        f2=new Filme();
        f1.preencher();
        f2.copiar(f1);
        System.out.println();
        f1.Imprimir();
        System.out.println();
        f2.Imprimir();
       
        
    }
}
