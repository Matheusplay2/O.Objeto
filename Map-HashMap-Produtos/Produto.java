/*Crie um `HashMap<String, Double>` que armazene pelo menos 4 produtos e seus preços. Implemente as seguintes operações: 

(a) exiba todos os pares produto/preço; 

(b) atualize o preço de um produto; 

(c) verifique se um produto existe antes de removê-lo.*/
package com.mycompany.produto;

import java.util.HashMap;
import java.util.Map;

public class Produto {

    public static void main(String[] args) {
    Map <String, Double>produtos= new HashMap<>();
    
    produtos.put("Arroz", 14.50);
    produtos.put(" Feijao",10.50);
    produtos.put("Leite", 4.00);
    produtos.put(" Sabao em po", 12.90);
  
    
        System.out.println(" ===LISTA INICIAL DOS PRODUTOS ===");
    for(Map.Entry<String, Double> p : produtos.entrySet()){
        System.out.println(p.getKey()+ "  R$"+ p.getValue());
       }
        System.out.println(" ATUALIZANDO PRECO DO LEITE");
   
        produtos.put("Leite", 5.50);
    
    if(produtos.containsKey("Feijao")){
        produtos.remove("Feijao");
    }
        System.out.println(" === LISTA FINAL DOS PRODUTOS ===");
        for(Map.Entry<String, Double> p : produtos.entrySet()){
        System.out.println(p.getKey()+ "  R$"+ p.getValue());
        
       }
                
    }
}