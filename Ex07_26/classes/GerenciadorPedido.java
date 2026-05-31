package classes;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPedido {

    private List<Pedido> lstPedido;

    public GerenciadorPedido() {
        this.lstPedido = new ArrayList<>();
    }

  
    public void addPedido(Pedido p){
        this.lstPedido.add(p);
        System.out.println("Pedido adicionado");
    }

    
    public boolean removePedido(int codigo){
        for(int i = 0; i < lstPedido.size(); i++){
            if(lstPedido.get(i).getCodigo() == codigo){
                lstPedido.remove(i);
                System.out.println("Pedido removido");
                return true;
            }
        }
        return false;
    }

    public int totalPedidos(){
        return this.lstPedido.size();
    }
    
    public Pedido pesquisar(int codigo){
        
        for(Pedido p: this.lstPedido){
           if(p.getCodigo()== codigo) {
               System.out.println("Pedido encontrado");
           
               return p;
           }
        }
        
        return null;
    }
    public Produto produtoMaisVendido(){

    Produto maisVendido = null;
    int maiorQtd = 0;

    for(Pedido p1 : lstPedido){
        for(Produto prod1 : p1.getProdutos()){

            int contador = 0;

            
            for(Pedido p2 : lstPedido){
                for(Produto prod2 : p2.getProdutos()){
                    if(prod1.equals(prod2)){
                        contador++;
                    }
                }
            }
          
            if(contador > maiorQtd){
                maiorQtd = contador;
                maisVendido = prod1;
            }
        }
    }

    return maisVendido;
}
    
    public void ListarPedidos(){
        
        for(Pedido p: this.lstPedido){
            System.out.println(p.toString());
           }
        }
    public Produto produtoMenosVendido(){

    Produto menosVendido = null;
    int menorQtd = Integer.MAX_VALUE;

    for(Pedido p1 : lstPedido){
        for(Produto prod1 : p1.getProdutos()){

            int contador = 0;

            for(Pedido p2 : lstPedido){
                for(Produto prod2 : p2.getProdutos()){
                    if(prod1.equals(prod2)){
                        contador++;
                    }
                }
            }

            if(contador < menorQtd){
                menorQtd = contador;
                menosVendido = prod1;
            }
        }
    }

    return menosVendido;
}
    public Cliente clienteMaisPedidos(){

    Cliente mais = null;
    int maior = 0;

    for(Pedido p1 : lstPedido){

        int contador = 0;

        for(Pedido p2 : lstPedido){
            if(p1.getCliente().equals(p2.getCliente())){
                contador++;
            }
        }

        if(contador > maior){
            maior = contador;
            mais = p1.getCliente();
        }
    }

    return mais;
}
    public Cliente clienteMaisGastou(){

    Cliente mais = null;
    double maior = 0;

    for(Pedido p1 : lstPedido){

        double total = 0;

        for(Pedido p2 : lstPedido){
            if(p1.getCliente().equals(p2.getCliente())){
                total += p2.calcularTotal();
            }
        }

        if(total > maior){
            maior = total;
            mais = p1.getCliente();
        }
    }

    return mais;
}
    public double faturamentoTotal(){

    double total = 0;

    for(Pedido p : lstPedido){
        total += p.calcularTotal();
    }

    return total;
}
    

    public List<Pedido> getLstPedido(){
        return this.lstPedido;
    }
}