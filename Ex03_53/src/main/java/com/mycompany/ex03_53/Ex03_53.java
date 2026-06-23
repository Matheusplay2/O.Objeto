
package com.mycompany.ex03_53;


import com.mycompany.ex03_53.Servico.ServicoPagamento;
import com.mycompany.ex03_53.classesConcretas.FormatadorTextoCaixaAlta;

/*Crie uma interface chamada IFormatadorTexto com o método formatarTexto() Em seguida,
implemente duas classes concretas: FormatadorTextoCaixaAlta e FormatadorTextoCaixaBaixa.
Crie uma classe chamada ServicoFormatacao, que possui um método formatar() e depende da abstração 
(a interface IFormatadorTexto). No método formatar(), chame o método formatarTexto() do objeto IFormatadorTexto.*/

/**
  @author matheus henrique
 */
public class Ex03_53 {

    public static void main(String[] args) {
       FormatadorTextoCaixaAlta fCaixa= new  FormatadorTextoCaixaAlta();
       ServicoPagamento sAlta= new ServicoPagamento(fCaixa);
       
       String texto= " Texto Formatado em Caixa Alta ";
       
        System.out.println(sAlta.formatar(texto));
       
       
       
    }
}
