package classes;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProduto {

    private List<Produto> lstProduto;

    public GerenciadorProduto(){
        this.lstProduto = new ArrayList<>();
    }

    
    public void addProduto(Produto p){
        lstProduto.add(p);
        System.out.println("Produto adicionado");
    }

    
    public boolean removeProduto(int codigo){
        for(int i = 0; i < lstProduto.size(); i++){
            if(lstProduto.get(i).getCod() == codigo){
                lstProduto.remove(i);
                System.out.println("Produto removido");
                return true;
            }
        }
        return false;
    }

  
    public Produto buscarProduto(int codigo){
        for(Produto p : lstProduto){
            if(p.getCod() == codigo){
                return p;
            }
        }
        return null;
    }

    
    public void listarProdutos(){
        for(Produto p : lstProduto){
            p.imprimirProduto();
        }
    }

    public List<Produto> getLstProduto(){
        return lstProduto;
    }
}