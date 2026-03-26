package com.mycompany.exercicio8;
import java.util.Scanner;
import classe.Musica;
import classe.Gerenciador;

 
public class Exercicio8 {

    public static void main(String[] args) {
 
        Scanner ler= new Scanner(System.in);
        Gerenciador play=new Gerenciador();
        int opcao;
        
        do {
            System.out.println("=================================");
            System.out.println("     //////MENU////// ");
            System.out.println("1-Adicionar Musica");
            System.out.println(" 2-Remover ");
            System.out.println( "3-Pesquisar");
            System.out.println("4- Listar Musicas");
            System.out.println("5- Sair");
            System.out.println("=================================="); 
            System.out.print("Digite uma opção do menu:");
            opcao=ler.nextInt();
            ler.nextLine();
            
                if (opcao==1){
                    Musica m=new Musica();
                    preencher(ler,m);
                    play.adicionarMusica(m);
                     
                }else if (opcao==2) {
                    System.out.print("Digite o Titulo da musica que deseja ser removida:");
                    String nome=ler.nextLine();
                    System.out.print("Nome do Artista(s):");
                    String nomeM=ler.nextLine();
                    boolean ok=play.removerMusica(nome, nomeM);
                    if(ok){
                        System.out.println("Musica removida");
                    }else{
                        System.out.println("Musica não encontrada");
                    }
                }else if( opcao==3){
                    System.out.print("Digite o Titulo da musica que deseja procurar:");
                    String nome=ler.nextLine();
                    System.out.print("Nome do Artista(s):");
                    String nomeM=ler.nextLine();
                    Musica m=play.pesquisarMusica(nome, nomeM);
                   if ( m!= null){
                        System.out.println("Musica encontrada");
                        System.out.println(m);
                    }else{
                        System.out.println("Musica não existente");
                    }
                    
                }else if( opcao==4 ){
                    play.ListarMusica();
                
                    
                }else if (opcao==5){
                    System.out.println("Saindo.............");
                    
                }else {
                    System.out.println("Opção Invalida");  
                }
        }while (opcao !=5);
        
    }

    public static void preencher(Scanner ler, Musica musicas){
        
        System.out.print("Digite titulo da Musica:");
        musicas.setTitulo(ler.nextLine());
        System.out.print("Digite Nome do artista:");
        musicas.setArtista(ler.nextLine());
        System.out.print("Duração da Musica:");
        musicas.setDuracao(ler.nextDouble());
        System.out.print("Preço da Musica:");
        musicas.setPreco(ler.nextDouble());
    }
}