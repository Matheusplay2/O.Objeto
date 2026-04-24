package com.mycompany.ex16_roteiro02;

import classes.Aeroporto;
import classes.Passageiro;
import classes.Voo;

public class Ex16_Roteiro02 {

    public static void main(String[] args) {

   

        Aeroporto aeroporto =   new Aeroporto("Aeroporto Central","Brasilia");

     
        Voo v1 = new Voo( 101, "Rio de Janeiro", "Aguardando", 10);

        Voo v2 =   new Voo(  202,  "Sao Paulo",  "Aguardando",  15);

        Voo v3 =new Voo(303, "Salvador", "Aguardando", 20);

     

        v1.adicionarEscala("Belo Horizonte");

        v2.adicionarEscala("Goiania");

        v3.adicionarEscala("Campinas");

        Passageiro p1 =  new Passageiro("Matheus", "111");

        Passageiro p2 =  new Passageiro("Ana", "222");

        Passageiro p3 = new Passageiro("Carlos", "333");

        Passageiro p4 =  new Passageiro("Julia", "444");

        Passageiro p5 = new Passageiro("Pedro", "555");

        Passageiro p6 = new Passageiro("Marcos", "666");

        Passageiro p7 =new Passageiro("Fernanda", "777");



        v1.add(p1);
        v1.add(p2);

        v2.add(p3);
        v2.add(p4);
        v2.add(p5);
        v2.add(p6);

    
        v3.add(p1);
        v3.add(p2);
        v3.add(p3);
        v3.add(p4);
        v3.add(p7);

    

        aeroporto.add(v1);

        aeroporto.add(v2);

        aeroporto.add(v3);

     
        System.out.println(
        "\n===== LISTA DE VOOS =====");

        aeroporto.listarVoos();

        System.out.println(
        "\n===== VOOS COM PREJUIZO =====");

        aeroporto.verificarVoosPrejuizo();

        System.out.println(
        "\n===== INICIANDO VOO 303 =====");

        aeroporto.iniciarVoo(303);

        System.out.println(
        "\n===== CONCLUINDO VOO 303 =====");

        v3.concluirVoo();

        System.out.println(
        "\n===== PONTOS =====");

        System.out.println( p1.getNome() + ": "   + p1.getSistema().getPontos());

        System.out.println( p7.getNome() + ": "+ p7.getSistema().getPontos());

    }
}