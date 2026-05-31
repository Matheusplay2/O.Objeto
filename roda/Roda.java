/*Faça um modelo para a classe Roda. Pense em cada atributo que este novo tipo deve ter.*/
package roda;
import java.util.Scanner;

public class Roda {

   
    int tam;
    String marca;

    public Roda( int tam, String marca){
        this.tam=tam;
        this.marca=marca;
    }
    public void mostrarDados(){
    System.out.println("          Dados preenchidos do produto(roda).       ");
    System.out.println();
    System.out.println("tamanho:" + tam + "  cm" );
    System.out.println("nome da marca:" + marca);
    }
    
    public static void main(String[] args) {
      Scanner ler= new Scanner(System.in);
      
      System.out.println( "  insira tamanho da roda em cm:" );
      int tam=ler.nextInt();
      ler.nextLine();
      
      
      System.out.println(" nome da marca:");
      String marca=ler.nextLine();
      
     Roda  roda1=new Roda(tam,marca);
     roda1.mostrarDados();
   
    }
    
}
