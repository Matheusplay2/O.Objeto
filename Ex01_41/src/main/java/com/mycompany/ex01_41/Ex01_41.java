
package com.mycompany.ex01_41;

import com.mycompany.ex01_41.classes.Produto;

public class Ex01_41 {

    public static void main(String[] args) {
        Produto p = new Produto();
        Eletronico e= new Eletronico("01"," Telefone",1.200, 1.500,"127");
        Movel m= new Movel();
        Perecivel p1= new Perecivel("00","Arroz",12.0,15.0,5.0);
        
        System.out.println("Preenchendo e Imprimindo Produto");
        p.preencher();
        p.imprimir();
        
        System.out.println();
        e.imprimir();
        System.out.println();
        System.out.println("Preenchendo e Imprimindo Movel");
        m.preeencher();
        m.imprimir();
        System.out.println();
        
        p1.imprimir();
    }
}
