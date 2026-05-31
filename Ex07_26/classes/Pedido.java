package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pedido {

    private int codigo;
    private Cliente cliente;
    private List<Produto> produtos;

    public Pedido() {
        this.codigo = 0;
        this.cliente = new Cliente();
        this.produtos = new ArrayList<>();
    }

    public Pedido(int codigo, Cliente cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    
    public void adicionarProduto(Produto p){
        produtos.add(p);
    }

    
    public void removerProduto(Produto p){
        produtos.remove(p);
    }

    
    public double calcularTotal(){
        double total = 0;

        for(Produto p : produtos){
            total += p.getPreco();
        }

        return total;
    }

    @Override
    public String toString() {
        return "Pedido{Codigo:" + codigo + ", Cliente:" + cliente + ", Produtos:" + produtos + "}";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Pedido other = (Pedido) obj;

        return this.codigo == other.codigo &&
               this.cliente.equals(other.cliente);
    }

    @Override
    public int hashCode(){
        return Objects.hash(codigo, cliente);
    }

    public int getCodigo(){
        return codigo;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public List<Produto> getProdutos(){
        return produtos;
    }
}
