
package com.mycompany.enderecofuncionario;
import classes.Endereco;
import classes.Funcionario;
import java.util.Scanner;

public class EnderecoFuncionario {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Endereco e1= new Endereco("Dona julia", 12, "Vila", " Uba");
        Funcionario f1=new Funcionario(" Matheus", " 1801",1900.00, e1);
        
        
        Funcionario f2=new Funcionario();
        f2.copiar(f1);
        
        System.out.println("   /Funcionarios/");
        System.out.println(f1);
        System.out.println(f2);
        
        System.out.println("Alterando cidade do Funcionario 2.");
        f2.getEndereco().setCdd(" Juiz de Fora");
        System.out.println("Funcionario 2(Cidade modificada):"+ f2);
        
        Funcionario f3=new Funcionario();
        preencherF(ler , f3);
        
        System.out.println(" =================================");
        System.out.println("     TODOS OS FUNCIONARIOS ");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println("===================================");
    }
    
    public static void preencherF(Scanner ler , Funcionario f){
        System.out.println("   / PREENCHENDO Dados Do Funcioario /");
        System.out.print("Nome:");
        f.setNome(ler.nextLine());
        System.out.print("Matricula:");
        f.setMatricula(ler.nextLine());
        System.out.print("Salario:");
        f.setSalario(ler.nextDouble());
        ler.nextLine();
        
      Endereco e= new Endereco();
        preencherE(ler, e);
        f.setEndereco(e);
    }
    public static void preencherE(Scanner ler , Endereco e){
        System.out.println("    / Dados do Endereco /");
        System.out.print("Rua:");
        e.setRua(ler.nextLine());
        System.out.print("Numero:");
        e.setNum(ler.nextInt());
        ler.nextLine();
        System.out.print("Bairro:");
        e.setBairro(ler.nextLine());
        System.out.print("Cidade:");
        e.setCdd(ler.nextLine());
    }
}
