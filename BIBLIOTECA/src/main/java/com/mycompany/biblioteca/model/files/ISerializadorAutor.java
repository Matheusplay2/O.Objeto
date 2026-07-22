
package com.mycompany.biblioteca.model.files;

import com.mycompany.biblioteca.model.entidades.Autor;
import java.util.List;

public interface ISerializadorAutor {
    String toFile(List<Autor> autores);
    List<Autor> fromFile(String data);
    
}
