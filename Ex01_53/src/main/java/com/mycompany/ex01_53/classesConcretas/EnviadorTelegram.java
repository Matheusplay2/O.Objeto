
package com.mycompany.ex01_53.classesConcretas;

import com.mycompany.ex01_53.classeAbs.IEnviadorMensagem;


public class EnviadorTelegram extends IEnviadorMensagem{

    public EnviadorTelegram() {
    }
    
    @Override
    public void enviarMensagem(){
        System.out.println("Enviando mensagem por TELEGRAM...");
    }
    
}
