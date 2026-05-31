
package com.mycompany.produtotela.gerenciador;

import com.mycompany.produtotela.classes.Produto;
import java.util.HashMap;



public class GerenciadorProdutos {
     HashMap<String, Produto> estoque;

    public GerenciadorProdutos() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        estoque.put(produto.getCodigo(), produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public boolean removerProduto(String codigo) {
        if (estoque.remove(codigo) != null) {
            System.out.println("Produto removido com sucesso!");
            return  true;
        } else {
            System.out.println("Produto não encontrado!");
        }
         return false;
    }

public void atualizarProduto(String codigo, Produto novoProduto) {
    
    Produto produto = estoque.get(codigo);

    if (produto != null) {

        produto.setNome(novoProduto.getNome());
        produto.setPreco(novoProduto.getPreco());
        produto.setCusto(novoProduto.getCusto());

        System.out.println("Produto atualizado com sucesso!");

    } else {
        System.out.println("Produto não encontrado!");
    }
}
    public String listarProdutos() {
    if (estoque.isEmpty()) {
        return "O estoque está vazio.";
    }

    StringBuilder sb = new StringBuilder();
    for (Produto produto : estoque.values()) {
        sb.append(produto.toString()).append("\n");
    }
    return sb.toString();
}



    public Produto buscarProduto(String codigo) {
        return estoque.get(codigo);
      }
     
}

