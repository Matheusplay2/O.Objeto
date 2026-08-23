package com.mycompany.despesa.model.service;

import com.mycompany.despesa.model.dao.GastoDao;
import com.mycompany.despesa.model.entidade.Gasto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;


public class GerenciadorGasto {
    
     // Formato que o USUÁRIO digita na tela (dd/MM/yyyy)
    private static final DateTimeFormatter FORMATO_EXIBICAO =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final GastoDao dao; // injeção de dependência, igual na biblioteca

    public GerenciadorGasto(GastoDao dao) {
        this.dao = dao;
    }

    /**
     * MANUTENÇÃO: aqui é onde a data digitada pelo usuário (dd/MM/yyyy)
     * é convertida para o formato ISO (yyyy-MM-dd) antes de salvar no banco.
     * Isso é necessário porque o SQLite só entende ORDER BY e strftime()
     * corretamente em formato ISO. Se mudar a forma de entrada de data,
     * mexer AQUI, não na classe Gasto.
     */
    public void adicionarGasto(String dataDigitada, double valor, String descricao) {

        // 1. Validação + conversão dd/MM/yyyy -> yyyy-MM-dd
        String dataISO = converterParaISO(dataDigitada);

        // 2. Validação do valor
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }

        // 3. Validação da descrição
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser vazia.");
        }

        // 4. Cria o objeto Gasto já com data em ISO e persiste
        Gasto gasto = new Gasto(0, dataISO, valor, descricao);
        dao.inserir(gasto);
    }

    public void removerGasto(int id) {
        dao.remover(id);
    }

    public List<Gasto> listarGastosDoMes(int mes, int ano) {
        return dao.listarPorMes(mes, ano);
    }

    public List<Gasto> listarTodos() {
        return dao.listarTodos();
    }

    public double calcularTotalDoMes(int mes, int ano) {
        return dao.somarPorMes(mes, ano);
    }

    /**
     * MANUTENÇÃO: converte a data digitada (dd/MM/yyyy) para ISO (yyyy-MM-dd).
     * Lança IllegalArgumentException se o usuário digitar formato errado
     * (ex: "31/13/2026" ou "abc") — a TelaGastos deve capturar isso
     * e mostrar aviso ao usuário via JOptionPane.
     */
    private String converterParaISO(String dataDigitada) {
        try {
            LocalDate data = LocalDate.parse(dataDigitada, FORMATO_EXIBICAO);
            return data.toString(); // "2026-01-15"
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Data inválida. Use o formato dd/MM/yyyy.");
        }
    }
}
