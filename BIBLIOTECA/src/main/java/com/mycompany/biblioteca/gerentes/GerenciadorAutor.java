
package com.mycompany.biblioteca.gerentes;

import com.mycompany.biblioteca.classes.Autor;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorAutor {
    private List <Autor> lstAutor;

    public GerenciadorAutor() {
        this.lstAutor= new ArrayList<>();
    }
   
    public void add(Autor autor){
        this.lstAutor.add(autor);
     }
    
    public boolean remover(String nome, String cddNatal){
        for(Autor a: this.lstAutor){
           if(a.getNome().equals(nome)&& a.getCddNatal().equals(cddNatal)){ 
            this.lstAutor.remove(a);
            return true;
           }
        }
        return false;
      }
    
    public Autor pesquisar(String nome, String cddNatal){
        for(Autor a: this.lstAutor){
           if(a.getNome().equals(nome)&& a.getCddNatal().equals(cddNatal)){ 
          return a;
         }
     }
        return null;
   }
    
    public String listar(){
        String resultado="";
        
        for(Autor autor : this.lstAutor){
          resultado +=autor + "\n";  
            
        } 
        return resultado;
    }
}
