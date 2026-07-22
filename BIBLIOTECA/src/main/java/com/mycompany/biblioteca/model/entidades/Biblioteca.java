package com.mycompany.biblioteca.model.entidades;


import com.mycompany.biblioteca.Controller.AutorController;
import com.mycompany.biblioteca.Controller.LivroController;
import com.mycompany.biblioteca.model.dao.IAutorDao;
import com.mycompany.biblioteca.model.dao.ILivroDao;

import java.util.List;

public class Biblioteca {

    private LivroController gerenciadorLivro;
    private AutorController gerenciadorAutor;

    public Biblioteca(IAutorDao autorDao, ILivroDao livroDao) {
        this.gerenciadorAutor = new AutorController(autorDao);
        this.gerenciadorLivro = new LivroController(livroDao);
    }

    // ---- Parte dos autores ----

    public void addAutor(String nome, String cddNatal) {
        gerenciadorAutor.salvar(nome, cddNatal);
    }

    public void removerAutor(String nome, String cddNatal) {
        gerenciadorAutor.remover(nome, cddNatal);
    }

    public Autor pesquisarAutor(String nome, String cddNatal) {
        return gerenciadorAutor.pesquisar(nome, cddNatal);
    }

    public List<Autor> listarAutores() {
        return gerenciadorAutor.listarTodos();
    }

    // ---- Parte dos livros ----

    public void addLivro(String titulo, Autor autor, String anoPublicacao) {
        gerenciadorLivro.salvar(titulo, autor, anoPublicacao);
    }

    public void removerLivro(String titulo) {
        gerenciadorLivro.remover(titulo);
    }

    public Livro pesquisarLivro(String titulo) {
        return gerenciadorLivro.pesquisar(titulo);
    }

    public List<Livro> listarLivros() {
        return gerenciadorLivro.listarTodos();
    }
}

    
    
    

