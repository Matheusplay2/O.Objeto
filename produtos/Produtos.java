/*Crie um `HashMap<String, Double>` que armazene pelo menos 4 produtos e seus preços. Implemente as seguintes operações: 

(a) exiba todos os pares produto/preço; 

(b) atualize o preço de um produto; 

(c) verifique se um produto existe antes de removê-lo.

Dica: use `entrySet()` para percorrer, `containsKey()` antes de remover e `put()` para atualizar.*/

package com.mycompany.produtos;

import java.util.HashMap;
import java.util.Map;

public class Produtos {

    public static void main(String[] args) {
        Map <String,Double> produtos=new HashMap<>();
        produtos.put("arroz", 12.50);
        produtos.put("feijao", 10.0);
        produtos.put("leite",5.0);
        produtos.put("maca", 3.0);
       
        for (Map.Entry<String, Double> p : produtos.entrySet()) {
                System.out.println(p.getKey()+ "R$"+ p.getValue());
                
            }
        
        produtos.put("feijao", 11.0);
            
           if (produtos.containsKey("arroz")){
               
               produtos.remove("feijao");
               System.out.println("");
               System.out.println("Produto removido");
           }else{
               System.out.println("Produto nao existente");
        }
            for (Map.Entry<String, Double> p : produtos.entrySet()) {
                System.out.println(p.getKey()+ "R$"+ p.getValue());
                
            }
    }

}