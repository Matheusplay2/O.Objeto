

package com.mycompany.contabancariacliente;
import classes.Cliente;
import classes.ContaBancaria;
import java.util.Scanner;

public class ContaBancariaCliente {

    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        Cliente c= new Cliente();
        cliente(ler, c);
        ContaBancaria c1=new ContaBancaria();
        ContaBancaria(ler,c1);
        c1.depositar(200);
        c1.sacar(30);
        System.out.println(c1.toString());
        
    }
    public static void cliente(Scanner ler , Cliente c){
        System.out.println("================");
        System.out.println("     / Dados do Cliente/    ");
        System.out.print("Seu nome:");
        c.setNome(ler.nextLine());
        System.out.print("Seu cpf:");
        c.setCpf(ler.nextLine());
        
        
    }
    public static void  ContaBancaria(Scanner ler, ContaBancaria c1){
        System.out.println("================");
        System.out.println("   PREENCHENDO DADOS DA CONTA BANCARIA");
        System.out.print("Digite numero da conta:");
        c1.setNumero(ler.nextInt());
        ler.nextLine();
        System.out.print("Tipo da conta:");
        c1.setTipo(ler.nextLine());
        System.out.print("Saldo da conta:");
        c1.setSaldo(ler.nextDouble());
    }
}
