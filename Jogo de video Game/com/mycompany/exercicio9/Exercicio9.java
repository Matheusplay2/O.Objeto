
package com.mycompany.exercicio9;

import classe.Jogo;

 
public class Exercicio9 {

    public static void main(String[] args) {
        Jogo j1;
        Jogo j2;
        j1 =new Jogo();
        j2=new Jogo ();
        j1.preencher();
        System.out.println("");
        j2.preencher();
        
        System.out.println("");
        j1.imprimir();
        System.out.println("");
        j2.imprimir();
    }
}
