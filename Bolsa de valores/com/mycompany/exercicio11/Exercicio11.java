

package com.mycompany.exercicio11;
import classe.Ativo;
 
public class Exercicio11 {

    public static void main(String[] args) {
        Ativo at1;
        Ativo at2;
        Ativo at3;
        
        at1=new Ativo();
        at2=new Ativo();
        at3=new Ativo();
        
        at1.preencher();
        at2.preencher();
        at3.preencher();
        
        double total=at1.calcularPosiçaoDoAtivo()+at2.calcularPosiçaoDoAtivo()+at3.calcularPosiçaoDoAtivo();
        System.out.println();
        System.out.println(" === Resumo Da Carteira ===");
        at1.exibirResumo();
        at2.exibirResumo();
        at3.exibirResumo();
        System.out.println("------------------------------");
        System.out.println(" Valor total da Carteira:  R$ "+ total);
    }
}
