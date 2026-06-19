
package com.mycompany.ex02_53.classesConcretas;

import com.mycompany.ex02_53.Interface.IProcessadorPagamento;


public class ProcessadorPagamentoCartao implements IProcessadorPagamento{

    public ProcessadorPagamentoCartao() {
    }
    
    @Override
     public void processarPagamento(){
         System.out.println("Pagamento via cartao(Debito,Credito)");
         
     }
    
}
