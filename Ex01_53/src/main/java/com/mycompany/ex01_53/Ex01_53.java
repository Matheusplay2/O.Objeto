
package com.mycompany.ex01_53;

import com.mycompany.ex01_53.Interface.IEnviadorMensagem;
import com.mycompany.ex01_53.Servicos.ProcessadorMensagem;
import com.mycompany.ex01_53.classesConcretas.EnviadorSMS;
import com.mycompany.ex01_53.classesConcretas.EnviadorTelegram;


public class Ex01_53 {

    public static void main(String[] args) {
        IEnviadorMensagem e= new EnviadorSMS();
        
        ProcessadorMensagem p = new ProcessadorMensagem(e);
        p.processar();
    }
}
