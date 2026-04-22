

package com.mycompany.ex11_26;

import classes.Banco;
import classes.Conta;
import classes.Transacao;

public class Ex11_26 {

    public static void main(String[] args) {
        
         Banco b1 = new Banco();

        Conta c1 = new Conta("001", "Matheus", 1500);
        Conta c2 = new Conta("002", "Lucas", -300);
        Conta c3 = new Conta("003", "Ana", 2500);
        Conta c4 = new Conta("004", "Carlos", -100);

        b1.addContas(c1);
        b1.addContas(c2);
        b1.addContas(c3);
        b1.addContas(c4);

        

        System.out.println("\nLISTA DE CONTAS:");
        b1.ListarConta();

      

        System.out.println("\nCONTA COM MAIOR SALDO:");
        System.out.println(b1.contaMaiorSaldo());

   

        System.out.println("\nCONTA COM MENOR SALDO:");
        System.out.println(b1.contaMenorSaldo());


        System.out.println("\nTOTAL DE DEVEDORES:");
        b1.totalDevedores();



        System.out.println("\nTOTAL DE CREDORES:");
        b1.totalCredores();

 

        Transacao t1 = new Transacao("T01", "Deposito", 500,
                "22/04/2026");

        t1.setContaAssociada(c1);

        Transacao t2 = new Transacao("T02", "Saque", 200,
                "22/04/2026");

        t2.setContaAssociada(c2);

        b1.addTransacao(t1);
        b1.addTransacao(t2);

        

        System.out.println("\nLISTA DE TRANSACOES:");
        b1.ListarTransacoes();

    

        System.out.println("\nPESQUISAR CONTA:");
        System.out.println(b1.pesquisarConta("001"));

   

        System.out.println("\nPESQUISAR TRANSACAO:");
        System.out.println(b1.pesquisarTransacao("T01"));

    }
}