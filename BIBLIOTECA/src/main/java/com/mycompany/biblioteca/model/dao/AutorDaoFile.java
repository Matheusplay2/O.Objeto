
package com.mycompany.biblioteca.model.dao;


import com.mycompany.biblioteca.model.entidades.Autor;
import com.mycompany.biblioteca.model.files.FilePersistence;
import com.mycompany.biblioteca.model.files.ISerializadorAutor;
import com.mycompany.biblioteca.model.files.SerializadorAutorJSON;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class AutorDaoFile implements IAutorDao {
    private ISerializadorAutor serializador=  new SerializadorAutorJSON();
    private String caminhoArquivo;
    private FilePersistence filePersistence= new FilePersistence();
  

    public AutorDaoFile(String caminhoArquivo,ISerializadorAutor serializador) {
        this.caminhoArquivo = caminhoArquivo;
        this.serializador=serializador;
    }

    @Override
    public void salvar(Autor autor) {
        try {
            List<Autor> autores = listarTodos();
            autores.add(autor);
            
            String jsonData=serializador.toFile(autores);
            filePersistence.saveToFile(jsonData, caminhoArquivo);
            System.out.println("Autor Salvo com sucesso no arquivo");
        } catch (IOException e) {
            System.out.println("Nao foi possivel salvar no arquivo "+ e.getMessage());
        }
    }

    @Override
    public void remove(String nome, String cddNatal) {
        Autor autorExcluir = this.pesquisar(nome, cddNatal);
        if(autorExcluir != null){
            List<Autor> autores=this.listarTodos();
            autores.remove(autorExcluir);
            
            
            String jsonData = serializador.toFile(autores);
            try {
                filePersistence.saveToFile(jsonData, caminhoArquivo);
                System.out.println("Autor removido com sucesso do arquivo.");
            
            } catch (IOException e) {
                 System.out.println("Nao foi possivel remover autor do arquivo "+ e.getMessage());
            }
        
        }
    }

    @Override
    public void atualizar(String nome, String cddNatal, Autor autorAtualizado) {
          throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Autor pesquisar(String nome, String cddNatal) {
        List<Autor> autores = listarTodos();
        for (Autor a : autores) {
            if (a.getNome().equals(nome) && a.getCddNatal().equals(cddNatal)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public List<Autor> listarTodos() {
            String jsonData;
        try {
            jsonData = filePersistence.loadToFile(caminhoArquivo);
                return serializador.fromFile(jsonData);
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel encontrar todos os autores "+ e.getMessage());
        }
        return new ArrayList<>();
   
    }
}

   
