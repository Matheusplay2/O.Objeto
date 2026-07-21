package com.mycompany.biblioteca.model.entidades;



import com.mycompany.biblioteca.Controller.GerenciadorAutor;
import com.mycompany.biblioteca.Controller.GerenciadorLivro;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Biblioteca {
    private GerenciadorLivro gerenciadorLivro;
    private GerenciadorAutor gerenciadorAutor;

    public Biblioteca() throws FileNotFoundException {
        this.gerenciadorLivro = new GerenciadorLivro();
        this.gerenciadorAutor = new GerenciadorAutor();
        
//        INICIANDO OS GERENCIADORES PRA QUANDO ABRIR A TELA DA BBT JA TER OS DADOS SALVOSS

        gerenciadorLivro.carregarDoArquivo();
        gerenciadorAutor.carregarDoArquivo();
    }
       

//   Parte dos autores e seus metodos 
 public void addAutor(Autor autor) {
        gerenciadorAutor.add(autor);
        
    }

    public boolean removerAutor(String nome, String cddNatal) {
        return gerenciadorAutor.remover(nome, cddNatal);
    }

    public Autor pesquisarAutor(String nome, String cddNatal) {
        return gerenciadorAutor.pesquisar(nome, cddNatal);
    }

    public String listarAutores() {
        return gerenciadorAutor.listar();
    }

    public void salvarAutoresNoArquivo() throws IOException {
        gerenciadorAutor.salvarNoArquivo();
    }

    public void carregarAutoresDoArquivo() throws FileNotFoundException {
        gerenciadorAutor.carregarDoArquivo();
    }

    // Parte dos livros e seus metodos somente retornando 
    

    public void addLivro(Livro livro) throws IOException {
        gerenciadorLivro.add(livro);
        gerenciadorLivro.salvarNoArquivo();
    }

    public boolean removerLivro(String titulo, Autor autor) {
        return gerenciadorLivro.remover(titulo, autor);
    }

    public Livro pesquisarLivro(String titulo, Autor autor) {
        return gerenciadorLivro.pesquisar(titulo, autor);
    }

    public String listarLivros() {
        return gerenciadorLivro.listar();
    }

    public void salvarLivrosNoArquivo() throws IOException {
        gerenciadorLivro.salvarNoArquivo();
    }

    public void carregarLivrosDoArquivo() throws FileNotFoundException {
        gerenciadorLivro.carregarDoArquivo();
    }
}
    
    
    

