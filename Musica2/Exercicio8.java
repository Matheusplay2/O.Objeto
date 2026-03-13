

package com.mycompany.exercicio8;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;


 
public class Exercicio8 {

    public static void main(String[] args) {
 
        
        List<Musica> musica=new LinkedList<>();
        Scanner ler= new Scanner(System.in);
        int opcao;
        
        do {
            
            System.out.println(" Insira a funcao desejada ");
            System.out.println("1-Adicionar Musica");
            System.out.println(" 2-Remover ");
            System.out.println( "3-Pesquisar");
            System.out.println("4- Playlist");
            System.out.println("5- Sair");
            
            opcao=ler.nextInt();
            ler.nextLine();
            
            switch(opcao){
                
                case 1:
                    Musica.inserir(musica, ler);
                      break;
                case 2:
                    Musica.remover(musica, ler);
                    break;
                case 3:
                    Musica.pesquisar(musica, ler);
                    break;
                  
                case 4:
                    Musica.PlayList(musica);
                    break;
                case 5:
                    System.out.println("Fechando" );
                    break;
                default:
                    System.out.println(" Opção invalida");
                
            }
            
        }while (opcao !=5);
        
    }
}
