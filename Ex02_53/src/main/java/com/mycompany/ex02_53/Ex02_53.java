

package com.mycompany.ex02_53;

import com.mycompany.ex02_53.Servicos.ServicoPagamento;
import com.mycompany.ex02_53.classesConcretas.ProcessadorPagamentoBoleto;
import com.mycompany.ex02_53.classesConcretas.ProcessadorPagamentoCartao;


public class Ex02_53 {

    public static void main(String[] args) {
       ProcessadorPagamentoCartao p= new ProcessadorPagamentoCartao();
       
       ServicoPagamento s= new ServicoPagamento(p);
       s.realizarPagamento();
       
       ProcessadorPagamentoBoleto b= new ProcessadorPagamentoBoleto();
       ServicoPagamento s1= new ServicoPagamento(b);
       s1.realizarPagamento();
    }
}
