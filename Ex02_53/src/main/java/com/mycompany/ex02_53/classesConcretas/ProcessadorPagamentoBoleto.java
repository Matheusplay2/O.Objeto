
package com.mycompany.ex02_53.classesConcretas;

import com.mycompany.ex02_53.Interface.IProcessadorPagamento;


public class ProcessadorPagamentoBoleto implements IProcessadorPagamento {

    public ProcessadorPagamentoBoleto() {
    }
    
    
    
    @Override
     public void processarPagamento(){
         System.out.println("Pagamento via Boleto......");
         
     }
}
