package com.mycompany.biblioteca.model.Exceptions;


public class DaoException extends RuntimeException {

    public DaoException(String mensagem) {
        super(mensagem);
    }
    
}
