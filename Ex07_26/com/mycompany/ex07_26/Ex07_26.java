package com.mycompany.ex07_26;

import classes.Cliente;
import classes.GerenciadorPedido;
import classes.GerenciadorProduto;
import classes.Pedido;
import classes.Produto;

public class Ex07_26 {

    public static void main(String[] args) {

        GerenciadorProduto gp = new GerenciadorProduto();
        GerenciadorPedido gped = new GerenciadorPedido();

        Produto p1 = new Produto(1, "Arroz", 20);
        Produto p2 = new Produto(2, "Feijao", 10);
        Produto p3 = new Produto(3, "Carne", 50);

        gp.addProduto(p1);
        gp.addProduto(p2);
        gp.addProduto(p3);

      
        Cliente c1 = new Cliente("Joao", "111", "joao@email");
        Cliente c2 = new Cliente("Maria", "222", "maria@email");


        Pedido ped1 = new Pedido(1, c1);
        ped1.adicionarProduto(p1);
        ped1.adicionarProduto(p2);

        Pedido ped2 = new Pedido(2, c2);
        ped2.adicionarProduto(p1);
        ped2.adicionarProduto(p3);

        Pedido ped3 = new Pedido(3, c1);
        ped3.adicionarProduto(p1);

      
        gped.addPedido(ped1);
        gped.addPedido(ped2);
        gped.addPedido(ped3);


        System.out.println("\n=== RELATORIOS ===");

        System.out.println("Total de pedidos: " + gped.totalPedidos());

        System.out.println("Faturamento total: " + gped.faturamentoTotal());

        System.out.println("Produto mais vendido: " + gped.produtoMaisVendido());

        System.out.println("Produto menos vendido: " + gped.produtoMenosVendido());

        System.out.println("Cliente que mais pediu: " + gped.clienteMaisPedidos());

        System.out.println("Cliente que mais gastou: " + gped.clienteMaisGastou());
    }
}