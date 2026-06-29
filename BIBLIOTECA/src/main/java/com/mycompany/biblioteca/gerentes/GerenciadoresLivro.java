package com.mycompany.biblioteca.gerentes;

import com.mycompany.biblioteca.classes.Autor;
import com.mycompany.biblioteca.classes.Livro;
import java.util.ArrayList;
import java.util.List;

public class GerenciadoresLivro {
    private List <Livro> lstLivro;

    public GerenciadoresLivro() {
        this.lstLivro= new ArrayList<>();
    }
    
    
    public void add(Livro livro){
      this.lstLivro.add(livro);
        
    }
    
    public boolean  remover(String titulo, Autor autor){
        for(Livro livro: this.lstLivro){
            if (livro.getTitulo().equals(titulo)&& livro.getAutor().equals(autor)){
              this.lstLivro.remove(livro);
              return true;
             }
        }
      return false;  
    }
    
    public Livro pesquisar(String titulo, Autor autor){
         for(Livro livro: this.lstLivro){
             if (livro.getTitulo().equals(titulo)&& livro.getAutor().equals(autor)){
              return livro;
            }
        }
      return null; 
    
    }
    
    
    public String listar(){
       String resultado= " ";
       
       for(Livro livro: this.lstLivro){
           resultado += livro + "\n";
          }
       return resultado;
        
    }
    
}
