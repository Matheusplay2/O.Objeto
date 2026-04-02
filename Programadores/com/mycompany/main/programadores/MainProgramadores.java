package com.mycompany.main.programadores;
import classes.Programador;
import classes.GerenciadorProgramadores;
import java.util.Scanner;
public class MainProgramadores {
    
 
        

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        GerenciadorProgramadores p1= new GerenciadorProgramadores();
          int opcao;
        do{
            
            opcao=Menu(ler);
            if (opcao==1){
                
                Programador p =new Programador();
                preencher(ler, p);
                p1.add(p);
               
           
            }else if (opcao ==2){
                System.out.print("Digite Nome do programador para ser removido:");
                ler.nextLine();
                String nome=ler.nextLine();
                System.out.print("Digite seu cpf:");
                String cpf=ler.nextLine();
                p1.remove(nome, cpf);
                
                
            }else if(opcao == 3){
                System.out.print("Digite Nome do programador para ser Procurado:");
                ler.nextLine();
                String nome=ler.nextLine();
                System.out.print("Digite seu cpf:");
                String cpf=ler.nextLine();
                p1.procurar(nome, cpf);
            }else if(opcao ==4){
                p1.listar();
                
            }else if (opcao==5){
                System.out.println("SAINDO............."); 
            }
        }while(opcao!=5);       
            
    }
    
       public static int Menu( Scanner ler){
        System.out.println("================");
        System.out.println("     /MENU/         ");
        System.out.println("1-Adcionar");
        System.out.println("2-Remover");
        System.out.println("3-Procurar");
        System.out.println("4-Listar todos");
        System.out.println("5-Sair");
        System.out.println("================");
        System.out.print("Digite uma opcao :");
        int opcao=ler.nextInt();
        return opcao;
        
       }
       public static void  preencher (Scanner ler ,Programador p){
           ler.nextLine();
           System.out.print("Insira seu nome:");
           p.setNome(ler.nextLine());
           System.out.print("Idade:");
           p.setIdade(ler.nextInt());
           ler.nextLine();
           System.out.print("Empresa onde Trabalha:");
           p.setEmpresa(ler.nextLine());
           System.out.print("Seu CPF:");
           p.setCpf(ler.nextLine());
           
      
       }
     }
    


