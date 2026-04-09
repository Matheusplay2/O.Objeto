
package com.mycompany.maincarromotorista;
import classes.Carro;
import classes.Motorista;
import java.util.Scanner;
public class MainCarroMotorista {

    public static void main(String[] args) {
       Scanner ler= new Scanner(System.in);
               
      Carro meuCarro=new Carro();
      preencherCarro(ler , meuCarro);
      
        System.out.println(meuCarro.toString());
      System.out.println("\n=== MOTORISTAS DO CARRO ===");
        for (Motorista m : meuCarro.getMotor()) {
            System.out.println("- " + m.getNome());
            
        }
    }
  

 
    
    public static void preencherMotorista(Scanner ler , Motorista m){
        System.out.println("=============================");
        System.out.println("          /PREENCHENDO/      ");
        System.out.print("Nome do motorista:");
        m.setNome(ler.nextLine());
     
    }
    public static void preencherCarro (Scanner ler, Carro c){
        System.out.println("======================="); 
        System.out.println("   / PREENCHENDO DADOS  DO CARRO/");
        System.out.print("Modelo :");
        c.setModelo(ler.nextLine());
        System.out.print(" Ano:");
        c.setAno(ler.nextInt());
        ler.nextLine();
        System.out.print("Cor:");
        c.setCor(ler.nextLine());
       
        
        String resposta;
        do{
            Motorista moto=new Motorista();
            preencherMotorista(ler,moto);
            c.adicionarMotorista(moto);
           
            System.out.println("Deseja inserir mais um Motorista:(s/n)");
            resposta=ler.nextLine();
        }while(resposta.equalsIgnoreCase("s"));
    }
}
