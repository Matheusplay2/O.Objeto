
package com.mycompany.ex03_53.classesConcretas;

import com.mycompany.ex03_53.Interface.IFormatadorTexto;


public class FormatadorTextoCaixaBaixa implements IFormatadorTexto {

    public FormatadorTextoCaixaBaixa() {
    }
    
    @Override 
    public  String formatarTexto(String texto){
         return texto.toUpperCase();
         
     }
}
