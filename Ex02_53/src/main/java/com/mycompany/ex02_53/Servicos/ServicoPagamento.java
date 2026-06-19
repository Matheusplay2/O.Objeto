
package com.mycompany.ex02_53.Servicos;

import com.mycompany.ex02_53.Interface.IProcessadorPagamento;

public class ServicoPagamento {
    private IProcessadorPagamento pagamento;

    public ServicoPagamento(IProcessadorPagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    public void realizarPagamento(){
        
        System.out.println("Processando pagamento");
        pagamento.processarPagamento();
    }
    
}
