
package com.mycompany.biblioteca.model.dao;

import com.mycompany.biblioteca.model.Exceptions.DaoException;
import java.util.List;

public interface IDAO<T> {
    
   
    void add(T objeto) throws DaoException;
    void remover(T objeto) throws DaoException;
    void atualizar(T objeto) throws DaoException;
    List<T> listarTodos() throws DaoException;
  
}
