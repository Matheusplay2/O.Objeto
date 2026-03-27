
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
         opcao=Menu( ler);
        if  ( opcao==1  ){
            Reserva r1=new Reserva();
            preencher(ler,r1);
            sistema.adicionar(r1);
        }else if (opcao==2){
    
            System.out.print(" Digite nome da reserva para ser removida:");
            String nome=ler.nextLine();
             sistema.cancelarReserva(nome);
        }else if (opcao ==3){
            
           System.out.print(" Digite nome  da reserva para ser pesquisado: ");
           String nome=ler.nextLine();
           sistema.encontrarReserva(nome);
           
        }else if (opcao==4 ){
            sistema.ListarReserva();
        
        }else if ( opcao==5){
            System.out.println("Saindo");
       
        }else{
            System.out.println("opcao invalida");
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
    public static int Menu(Scanner ler){
        System.out.println("----------------------------------------------");
            System.out.println("              MENU                            ");
            System.out.println("1- Adicionar reserva");
            System.out.println("2- Remover reserva");
            System.out.println("3- Pesquisar reserva");
            System.out.println("4- Listar todas as reservas");
            System.out.println("5- Sair");
            System.out.println("----------------------------------------------");
            System.out.print("Digite uma opção:");
            int opcao=ler.nextInt();
            ler.nextLine();
            return opcao;
        
    }
}
