/* Faça um programa que receba como entrada o nome de dois alunos e verifique se eles tem o mesmo nome.
Caso na tenham o mesmo nome informe qual dos dois tem maior número de caracteres. Dica: use os métodos da classe string*/
package alunos;
import java.util.Scanner;
public class Alunos {

    
    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        
        String nome1;
        String nome2;
        
            
        System.out.println( "digite o primeiro nomes:");
        nome1=ler.nextLine();
        
        System.out.println(" segundo nome:");
        nome2= ler.nextLine();
        
        
        if ( nome1.length()< nome2.length()){
         System.out.println( " nome do 2° aluno com mais  qtd caracter:" + nome2);
        }else if( nome1.length()> nome2.length()){
            System.out.println("nome do 1° aluno com mais qtd de caracter:" + nome1);
        }else{
            System.out.println(" nomes com mesma quantidade de caracteres:"+ nome1 +" e "+ nome2);
        }
        
        System.out.println(" nomes digitados para comparacao:"+ nome1 + " e "+nome2);
     }
        
    }
    

