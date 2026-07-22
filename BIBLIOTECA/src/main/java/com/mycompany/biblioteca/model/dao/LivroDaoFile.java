
package com.mycompany.biblioteca.model.dao;

import com.mycompany.biblioteca.model.entidades.Autor;
import com.mycompany.biblioteca.model.entidades.Livro;
import com.mycompany.biblioteca.model.files.FilePersistence;
import com.mycompany.biblioteca.model.files.ISerializadorLivro;
import com.mycompany.biblioteca.model.files.SerializadorLivroJSON;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LivroDaoFile implements ILivroDao {

    private ISerializadorLivro serializador = new SerializadorLivroJSON();
    private String caminhoArquivo;
    private FilePersistence filePersistence = new FilePersistence();

    public LivroDaoFile(String caminhoArquivo, ISerializadorLivro serializador) {
        this.caminhoArquivo = caminhoArquivo;
        this.serializador = serializador;
    }

    @Override
    public void salvar(Livro livro) {
        try {
            List<Livro> livros = listarTodos();
            livros.add(livro);

            String jsonData = serializador.toFile(livros);
            filePersistence.saveToFile(jsonData, caminhoArquivo);
            System.out.println("Livro salvo com sucesso no arquivo");
        } catch (IOException e) {
            System.out.println("Nao foi possivel salvar no arquivo " + e.getMessage());
        }
    }

    @Override
    public void remover(String titulo) {
        Livro livroExcluir = this.pesquisar(titulo);
        if (livroExcluir != null) {
            List<Livro> livros = this.listarTodos();
            livros.remove(livroExcluir);

            String jsonData = serializador.toFile(livros);
            try {
                filePersistence.saveToFile(jsonData, caminhoArquivo);
                System.out.println("Livro removido com sucesso do arquivo.");
            } catch (IOException e) {
                System.out.println("Nao foi possivel remover livro do arquivo " + e.getMessage());
            }
        }
    }

    @Override
    public void atualizar(String tituloAntigo, Livro livroAtualizado) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Livro pesquisar(String titulo) {
        List<Livro> livros = listarTodos();
        for (Livro l : livros) {
            if (l.getTitulo().equals(titulo)) {
                return l;
            }
        }
        return null;
    }

    @Override
    public List<Livro> listarTodos() {
        String jsonData;
        try {
            jsonData = filePersistence.loadToFile(caminhoArquivo);
            return serializador.fromFile(jsonData);
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel encontrar todos os livros " + e.getMessage());
        }
        return new ArrayList<>();
    }
}

 
