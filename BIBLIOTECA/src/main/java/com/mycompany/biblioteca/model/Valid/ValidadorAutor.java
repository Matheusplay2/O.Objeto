
package com.mycompany.biblioteca.model.Valid;

import com.mycompany.biblioteca.model.entidades.Autor;


public class ValidadorAutor {
 

    public static void validar(Autor autor) {
        if (autor.getNome() == null || autor.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do autor não pode ser vazio.");
        }
        if (autor.getCddNatal()== null || autor.getCddNatal().trim().isEmpty()) {
            throw new IllegalArgumentException("A cidade natal não pode ser vazia.");
        }
    }

}
