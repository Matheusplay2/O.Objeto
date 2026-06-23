
package com.mycompany.ex03_53.Servico;

import com.mycompany.ex03_53.Interface.IFormatadorTexto;


public class ServicoPagamento {
    
    private IFormatadorTexto servico;

    public ServicoPagamento(IFormatadorTexto servico) {
        this.servico = servico;
    }

 
    
     public String formatar(String texto) {
        return servico.formatarTexto(texto);
    }
    
    
}
