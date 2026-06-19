
package com.mycompany.ex01_53.classesConcretas;

import com.mycompany.ex01_53.classeAbs.IEnviadorMensagem;


public class EnviadorEmail extends IEnviadorMensagem {

    public EnviadorEmail() {
    }
    
    
    @Override
    public void enviarMensagem(){
        System.out.println(" Enviando mensagem por EMAIl...");
    }
}
