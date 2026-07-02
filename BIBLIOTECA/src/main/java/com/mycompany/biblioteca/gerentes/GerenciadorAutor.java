
package com.mycompany.biblioteca.gerentes;

import com.mycompany.biblioteca.arquivos.FilePersistence;
import com.mycompany.biblioteca.arquivos.SerializadorAutorCSV;
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
        SerializadorAutorCSV serializador = new  SerializadorAutorCSV ();
        String csvData = serializador.toCsv(this.lstAutor);
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, this.caminho);
        System.out.println("Autor  salvo com sucesso em " + this.caminho);
    }

    public void carregarDoArquivo() throws FileNotFoundException {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadToFile(this.caminho);
        SerializadorAutorCSV serializador = new SerializadorAutorCSV();
        this.lstAutor = serializador.fromCSV(csvData);
        System.out.println("Autor carregadas com sucesso de " + this.caminho);
    }
}
