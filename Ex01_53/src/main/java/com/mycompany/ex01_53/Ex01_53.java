
package com.mycompany.ex01_53;

import com.mycompany.ex01_53.Servicos.ProcessadorMensagem;
import com.mycompany.ex01_53.classesConcretas.EnviadorSMS;


public class Ex01_53 {

    public static void main(String[] args) {
        EnviadorSMS e= new EnviadorSMS();
        
        ProcessadorMensagem p = new ProcessadorMensagem(e);
        p.processar();
    }
}
