
package com.mycompany.gerenciadores;
import classes.Reserva;
import classes.GerenciadorReservas;
import java.util.Scanner;

public class Gerenciadores {

    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        GerenciadorReservas sistema=new GerenciadorReservas(); 
        
        int opcao;
       do{ 
        
            System.out.println("----------------------------------------------");
            System.out.println("              MENU                            ");
            System.out.println("1- Adicionar reserva");
            System.out.println("2- Remover reserva");
            System.out.println("3- Pesquisar reserva");
            System.out.println("4- Listar todas as reservas");
            System.out.println("5- Sair");
            System.out.println("----------------------------------------------");
            System.out.print("Digite uma opção:");
            opcao=ler.nextInt();
            ler.nextLine();
        if  ( opcao==1  ){
            Reserva r1=new Reserva();
            preencher(ler,r1);
            sistema.adicionar(r1);
        }else if (opcao==2){
    
            System.out.print(" Digite nome da reserva para ser removida:");
            String nome=ler.nextLine();
            boolean ok= sistema.cancelarReserva(nome);
            if (ok){
                System.out.println("Reserva Cancelada");
            }else{
                System.out.println("Reserva não encontrada");
            }
        }else if (opcao ==3){
            
           System.out.print(" Digite nome  da reserva para ser pesquisado: ");
           String nome=ler.nextLine();
           Reserva r=sistema.encontrarReserva(nome);
           if ( r!=null){
                System.out.println("Reserva Encontrada");
               System.out.println(r);
           }else{
               System.out.println("Reserva nao encontrada"); 
           }
        }else if (opcao==4 ){
            sistema.ListarReserva();
        
        }else if ( opcao==5){
            System.out.println("Saindo");
       }
        
    }while(opcao!=5);
    }
    public  static void preencher(Scanner ler, Reserva reservas){
        
      
        System.out.println(" ===  PREENCHENDO RESERVA  ===");
        System.out.print("  Nome:");
        reservas.setNome(ler.nextLine());
        System.out.print(" Numero de pessoas:");
        reservas.setNumPessoas(ler.nextInt());
        ler.nextLine();
        System.out.print(" Data:");
        reservas.setData(ler.nextLine());
        System.out.print("Horas:");
        reservas.setHoras(ler.nextLine());
    }
}
