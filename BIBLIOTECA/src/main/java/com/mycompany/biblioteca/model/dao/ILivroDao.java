
package com.mycompany.biblioteca.model.dao;

import com.mycompany.biblioteca.model.entidades.Autor;
import com.mycompany.biblioteca.model.entidades.Livro;
import java.util.List;

public interface ILivroDao {
    
    void salvar(Livro livro);
    void remover(String titulo );
    void atualizar(String titulo) ;
    Livro pesquisar(String titulo,Autor autor);
    List<Livro> listarTodos() ;
  
}
