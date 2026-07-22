
package com.mycompany.biblioteca.model.files;

import com.mycompany.biblioteca.model.entidades.Livro;
import java.util.List;


public interface ISerializadorLivro {
    String toFile(List<Livro> livros);
    List<Livro> fromFile(String data);
}
