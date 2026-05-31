

package com.mycompany.exercicio;

import Tv.Tv;


public class Exercicio {

    public static void main(String[] args) {
        
        System.out.println("    Preenchendo e imprimindo dados"
                + "  da primeira tv    ");
         Tv tv1;
         tv1= new Tv();
         tv1.preencher();
         tv1.imprimir();
         
         System.out.println(   "     Preenchendo e imprimindo"
                 + " dados  da segunda   ");
         Tv tv2;
         tv2=new Tv();
         tv2.copiar(tv1);
         tv2.imprimir();
    }
}
