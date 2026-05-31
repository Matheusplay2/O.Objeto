
package com.mycompany.produtopedido;

import classes.Pedido;
import classes.Produto;
import java.util.Scanner;

public class ProdutoPedido {

    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        Produto p1=new Produto("violao"," musicas",20);
        Pedido p=new Pedido("23309"," 20/12",12,p1);
        
        System.out.println(p);
        System.out.println("Valor total do pedido:"+p.calcularTotal());
        
        
        Pedido p2=new Pedido();
        preencherPedido(ler, p2);
     
        System.out.println(p2);
        System.out.println("Valor do pedido:"+p2.calcularTotal());
    }
    
    public static  void preencherProduto( Scanner ler , Produto p1){
        System.out.println("       / PREENCHENDO PRODUTO /");
        System.out.print("Nome do Produto:");
        p1.setNome(ler.nextLine());
        System.out.print("Categoria:");
        p1.setCategoria(ler.nextLine());
        System.out.print("Preco:");
        p1.setPreco(ler.nextDouble());
        ler.nextLine();
    
    }
    public static void preencherPedido( Scanner ler , Pedido p){
        System.out.println("     / PREENCHENDO PEDIDO /");
        System.out.print("Numero do Pedido: ");
        p.setNum(ler.nextLine());
        System.out.print("Data:");
        p.setData(ler.nextLine());
        System.out.print("Quantidade:");
        p.setQtd(ler.nextDouble());
        ler.nextLine();
       Produto prod = new Produto();
        preencherProduto(ler, prod);
        p.setProduto(prod);
    }
}
