package com.mycompany.biblioteca.gerentes;

import com.mycompany.biblioteca.arquivos.FilePersistence;
import com.mycompany.biblioteca.arquivos.SerializadorLivroJSON;
import com.mycompany.biblioteca.classes.Autor;
import com.mycompany.biblioteca.classes.Livro;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorLivro {
    private List <Livro> lstLivro;
    private String caminho;
   

    public GerenciadorLivro() {
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
