
package com.mycompany.biblioteca.model.dao;

import com.mycompany.biblioteca.model.entidades.Autor;
import java.util.List;


public  interface IAutorDao {
    
    void salvar(Autor autor);
    void remove(String nome, String cddNatal);
    void atualizar(String nome, String cddNatal, Autor autorAtualizado);
    Autor pesquisar(String nome,String cddNatal);
    List<Autor> listarTodos();
    
}
