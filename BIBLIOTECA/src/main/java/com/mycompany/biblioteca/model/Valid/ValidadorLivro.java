package com.mycompany.biblioteca.model.Valid;

import com.mycompany.biblioteca.model.Exceptions.LivroException;
import com.mycompany.biblioteca.model.entidades.Autor;
import com.mycompany.biblioteca.model.entidades.Livro;


public class ValidadorLivro {
    


  public Livro validacao(String titulo, Autor autor, String anoPublicacao) {
        Livro l = new Livro();

        if (titulo.isEmpty())
            throw new LivroException("Error - Campo vazio: 'titulo'.");
        l.setTitulo(titulo);

        if (autor == null)
            throw new LivroException("Error - Livro precisa de um autor selecionado.");
        l.setAutor(autor);

        if (anoPublicacao.isEmpty())
            throw new LivroException("Error - Campo vazio: 'anoPublicacao'.");

        if (anoPublicacao.matches("[A-Za-z]*"))
            throw new LivroException("Error - Valor inválido no campo 'anoPublicacao'.");

        int valorAno = Integer.parseInt(anoPublicacao);
        l.setAno(valorAno);

        return l;
    }
}


