
package com.mycompany.biblioteca.model.Valid;

import com.mycompany.biblioteca.model.Exceptions.AutorException;
import com.mycompany.biblioteca.model.entidades.Autor;


public class ValidadorAutor {
 

  public Autor validacao(String nome, String cidadeNatal) {
        Autor a = new Autor();

        if (nome.isEmpty())
            throw new AutorException("Error - Campo vazio: 'nome'.");
        a.setNome(nome);

        if (cidadeNatal.isEmpty())
            throw new AutorException("Error - Campo vazio: 'cidadeNatal'.");
        a.setCddNatal(cidadeNatal);

        return a;
    }
}
