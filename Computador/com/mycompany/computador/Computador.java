

package com.mycompany.computador; 
import classe.PC;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Computador {

 
    public  static int Menu(){
        Scanner ler= new Scanner (System.in);
        System.out.println("------------------------------");
        System.out.println(" INSIRA UMA OPÇÃO");
        System.out.println("1- Adicionar Novo Computador");
        System.out.println("2- Remover");
        System.out.println("3-Procurar ");
        System.out.println("4-Sair");
         System.out.println("------------------------------");
      return ler.nextInt();
       
    }
  
    public static void main(String[] args) {
       List <PC> pc= new ArrayList<>();
       Scanner ler=new Scanner (System.in);
       
       int opcao;
        do{
          opcao= Menu();
           if (opcao==1) {
               System.out.println("Adicionando");
               PC C= new PC();
               C.preencher();
               pc.add(C);
               
           }else if (opcao==2){
               
               System.out.println("Removendo");
               System.out.println("Digite marca do computador para remover");
               ler.nextLine();
               String marca=ler.nextLine();
               for (int i=0; i  < pc.size();i++){
                   PC C=pc.get(i);
                   
                  if (marca.equals(C.getMarca()) ){
                      System.out.println(" Computador encontrado e removendo");
                      pc.remove(i);
                      i--;
                  }else{
                      System.out.print(" Computador nao existente");
                  }
               
               }
           } else if(opcao==3){
               System.out.println("Pesquisando Computador");
           
                System.out.println("Digite marca do computador para remover");
                ler.nextLine();
               String marca=ler.nextLine();
               for (int i=0; i  < pc.size();i++){
                   PC C=pc.get(i);
                   
                  if (marca.equals(C.getMarca()) ){
                      System.out.println(" Computador encontrado e removendo");
                     
                      System.out.println( C.toString());
                  }else{
                      System.out.print(" Computador nao existente");
       
                    
              }
            
           }
        }else if (opcao!= 4){
               System.out.println("Opção Invalida");
        }
        }while(opcao !=4);
            System.out.println("Saindo........");
  
       }
   
   }

