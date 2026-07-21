package com.mycompany.biblioteca.model.Valid;

import com.mycompany.biblioteca.model.entidades.Livro;


public class ValidadorLivro {
    


    public static void validar(Livro livro) {
        if (livro.getTitulo() == null || livro.getTitulo().isEmpty()) {
            throw new IllegalArgumentException("O título do livro não pode ser vazio.");
        }
        if (livro.getAutor() == null) {
            throw new IllegalArgumentException("O livro precisa ter um autor selecionado.");
        }
        if (livro.getAno()< 0) {
            throw new IllegalArgumentException("Ano de publicação inválido.");
        }
    }
}


