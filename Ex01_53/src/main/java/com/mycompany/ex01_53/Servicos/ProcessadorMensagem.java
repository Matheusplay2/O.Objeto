
package com.mycompany.ex01_53.Servicos;

import com.mycompany.ex01_53.classeAbs.IEnviadorMensagem;


public class ProcessadorMensagem {
    private IEnviadorMensagem enviar;

    public ProcessadorMensagem(IEnviadorMensagem enviar) {
        this.enviar = enviar;
    }
    
    public void processar(){
        System.out.println("Processando mensagem");
        enviar.enviarMensagem();
    }
    
}
