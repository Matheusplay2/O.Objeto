
package com.mycompany.ex04_32.gerenciador;

import com.mycompany.ex04_32.classes.Livro;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorLivro {
    private List<Livro>lstLivros;

    public GerenciadorLivro() {
        
        this.lstLivros= new ArrayList<>();
    }
    
    
    public void add(Livro livro){
        this.lstLivros.add(livro);
        
        
    }
    
    public boolean remover(String titulo, String autor){
        for(Livro l: this.lstLivros){
           if(l.getTitulo().equals(titulo)){ 
            if(l.getAutor().equals(autor)){
                  this.lstLivros.remove(l);
                return true;
            }
          }
            
        }
        return false;
    }
    
    public Livro pesquisar(String titulo,String autor){
        for(Livro l: this.lstLivros){
            if(l.getTitulo().equals(titulo)){
                if(l.getAutor().equals(autor)){
                    return l;
                    
                }
            }
            
        }
         return null; 
        
    }
    
    public void atualizar(String titulo, Livro novoLivro){
        for(Livro l: this.lstLivros){
            if(l.getTitulo().equals(titulo)){
               l.copiar(novoLivro);
          }
       }
  
    }
    
    
    public String listar(){
        String resultado="";
        for(Livro l: this.lstLivros){
          resultado+=l+ "\n";  
            
        }
        return resultado;
    }
   
}
