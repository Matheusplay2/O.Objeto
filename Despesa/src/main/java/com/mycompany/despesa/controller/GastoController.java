
package com.mycompany.despesa.controller;

import com.mycompany.despesa.model.entidade.Gasto;
import com.mycompany.despesa.model.service.GerenciadorGasto;
import java.util.List;


public class GastoController {
    private final GerenciadorGasto gerenciador; // injeção de dependência

    public GastoController(GerenciadorGasto gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void salvar(String data, double valor, String descricao) {
        gerenciador.adicionarGasto(data, valor, descricao);
    }

    public void remover(int id) {
        gerenciador.removerGasto(id);
    }

    public List<Gasto> buscarGastosDoMes(int mes, int ano) {
        return gerenciador.listarGastosDoMes(mes, ano);
    }

    public List<Gasto> buscarTodos() {
        return gerenciador.listarTodos();
    }

    public double buscarTotalDoMes(int mes, int ano) {
        return gerenciador.calcularTotalDoMes(mes, ano);
    }
    
    public void editar(int id, String data, double valor, String descricao) {
    gerenciador.editarGasto(id, data, valor, descricao);
    }
}
