/*Simule uma fila de atendimento de um banco. Adicione 5 clientes à fila. Enquanto houver clientes, atenda-os um por um (usando `poll()`),
exibindo quem está sendo atendido e quantos ainda aguardam. Ao final, confirme que a fila está vazia.

Dica: use `queue.size()` dentro do `while` para exibir a quantidade de clientes restantes antes de chamar o próximo.*/
package com.mycompany.atendimento;

import java.util.LinkedList;
import java.util.Queue;

public class Atendimento {

    public static void main(String[] args) {
        Queue <String> fila =new LinkedList<>();
        
        fila.add("Paciente 1-Matheus");
        fila.add("Paciente 2- Ana");
        fila.add("Paciente 3- Carlos");
        fila.add("Paciente 4- José");
        
        while(! fila.isEmpty()){
              
            System.out.println("Paciente sendo atendido: "+ fila.poll());
            System.out.println("Aguardando atendimento "+fila.size()+ " Pacientes");
        }
        System.out.println("Fila vazia  "+ fila.isEmpty());
    }
}
