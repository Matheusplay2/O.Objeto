
package com.mycompany.biblioteca.gerentes;

import com.mycompany.biblioteca.arquivos.FilePersistence;
import com.mycompany.biblioteca.arquivos.SerializadorAutorJSON;
import com.mycompany.biblioteca.classes.Autor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorAutor {
    private List <Autor> lstAutor;
    private String caminho;

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
        public void salvarNoArquivo() throws IOException {
    SerializadorAutorJSON serializador = new SerializadorAutorJSON();
    String jsonData = serializador.autorToJSON((Autor) this.lstAutor);
    FilePersistence filePersistence = new FilePersistence();
    filePersistence.saveToFile(jsonData, this.caminho);
    System.out.println("Autores salvos com sucesso em " + this.caminho);
}

public void carregarDoArquivo() throws FileNotFoundException {
    FilePersistence filePersistence = new FilePersistence();
    String jsonData = filePersistence.loadToFile(this.caminho);
    SerializadorAutorJSON serializador = new SerializadorAutorJSON();
    this.lstAutor = (List<Autor>) serializador.JSONTo(jsonData);
    System.out.println("Autores carregados com sucesso de " + this.caminho);
}

}
