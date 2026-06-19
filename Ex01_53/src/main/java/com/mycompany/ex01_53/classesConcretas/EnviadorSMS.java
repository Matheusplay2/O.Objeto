
package com.mycompany.ex01_53.classesConcretas;

import com.mycompany.ex01_53.Interface.IEnviadorMensagem;


public class EnviadorSMS implements IEnviadorMensagem{

    public EnviadorSMS() {
    }
  
    @Override
    public void enviarMensagem() {
        System.out.println(" Enviando mensagem por SMS...");
    }
    
}
