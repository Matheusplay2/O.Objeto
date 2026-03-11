

package com.mycompany.exercicio2;
import classe.Casa;

public class Exercicio2 {

    public static void main(String[] args) {
     
  
        Casa c1=new Casa();
        Casa c2=new Casa();
        Casa c3=new Casa();
        Casa melhor;
        
        c1.preencher();
        c2.preencher();
        c3.preencher();
         double p1=c1.CalcularPrecoPorM2();
         double p2= c2.CalcularPrecoPorM2();
         double p3= c3.CalcularPrecoPorM2();
        
       
        
        if ( c1.CalcularPrecoPorM2()< c2.CalcularPrecoPorM2()   && c1.CalcularPrecoPorM2()< c3.CalcularPrecoPorM2()) {
            melhor=c1;
        } else if (c2.CalcularPrecoPorM2() < c1.CalcularPrecoPorM2() && c2.CalcularPrecoPorM2() < c3.CalcularPrecoPorM2()){
            melhor=c2;
            }  else{
            melhor=c3;
         }
        
        
        System.out.println(" === Comparativo de Imóveis ===");
        c1.exibirDados();
        c2.exibirDados();
        c3.exibirDados();
        System.out.println("--------------------------------------------------------------");
        System.out.print( " Melhor custo por m²:"  );
        melhor.exibirDados();
    }
}

