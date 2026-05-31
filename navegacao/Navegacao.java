/*Simule um histórico de navegação usando uma `Stack<String>` com 4 páginas visitadas em ordem. 
Depois implemente o botão "voltar": remova e exiba as páginas uma a uma com `pop()`. 

Use um `HashSet` para registrar apenas os domínios únicos visitados.*/
package com.mycompany.navegacao;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Navegacao {

    public static void main(String[] args) {
        Stack<String> site=new Stack<>();
        site.push("www.redeGlobo.com");
        site.push(" www.recordNews.com");
        site.push(" www.netflix.com");
        site.push(" www.xBoxOne.com");
        
        Set<String> historico= new HashSet<>();
        
        System.out.println("");
        System.out.println("=== Voltando paginas ===");
       
        while( !site.isEmpty()){
            String url=site.pop();
            historico.add(url);
            System.out.println("Saindo "+url);
        }
        System.out.println("Paginas visitadas:"+ historico);
    }
}
