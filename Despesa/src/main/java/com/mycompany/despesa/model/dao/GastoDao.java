
package com.mycompany.despesa.model.dao;

import com.mycompany.despesa.model.entidade.Gasto;
import java.util.List;


public interface GastoDao {
    
    void inserir(Gasto gasto);

    void remover(int id);

    List<Gasto> listarTodos();

    List<Gasto> listarPorMes(int mes, int ano);

    double somarPorMes(int mes, int ano);
    
}
