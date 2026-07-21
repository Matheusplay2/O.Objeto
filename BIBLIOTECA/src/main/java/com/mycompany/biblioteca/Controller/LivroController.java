package com.mycompany.biblioteca.Controller;

import com.mycompany.biblioteca.model.files.FilePersistence;
import com.mycompany.biblioteca.model.files.SerializadorLivroJSON;
import com.mycompany.biblioteca.model.entidades.Autor;
import com.mycompany.biblioteca.model.entidades.Livro;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LivroController {
    private List <Livro> lstLivro;
    private String caminho;
   

    public LivroController() {
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
     public void salvarNoArquivo() throws IOException {
        SerializadorLivroJSON serializador = new SerializadorLivroJSON();
        String csvData = serializador.livroToJSON((Livro) this.lstLivro);
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, this.caminho);
        System.out.println("Livro salvo com sucesso em " + this.caminho);
    }

    public void carregarDoArquivo() throws FileNotFoundException {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadToFile(this.caminho);
        SerializadorLivroJSON serializador = new SerializadorLivroJSON();
        this.lstLivro = (List<Livro>) serializador.JSONTo(csvData);
        System.out.println("Livros  carregados com sucesso de " + this.caminho);
    }
    
}
