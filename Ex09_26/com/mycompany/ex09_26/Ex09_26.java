
package com.mycompany.ex09_26;

import classes.Departamento;
import classes.Funcionario;
import classes.Gerente;
import java.util.Scanner;

public class Ex09_26 {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);

        
        System.out.print("Nome do departamento: ");
        String nomeDep = ler.nextLine();
        Departamento d1 = new Departamento(nomeDep);

        
        System.out.println("\n--- Cadastro do Gerente ---");
        Gerente g1 = new Gerente();

        System.out.print("Nome: ");
        g1.setNome(ler.nextLine());

        System.out.print("Identificacao: ");
        g1.setIdentificacao(ler.nextLine());

        System.out.print("Salario: ");
        g1.setSalario(ler.nextDouble());
        ler.nextLine();

        System.out.print("Area de trabalho: ");
        g1.setAreaDtrabalho(ler.nextLine());

        d1.definirGerente(g1);

      
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar funcionario");
            System.out.println("2 - Listar funcionarios");
            System.out.println("3 - Remover funcionario");
            System.out.println("4 - Mostrar departamento");
            System.out.println("5 - Sair");
            System.out.print("Opcao: ");

            opcao = ler.nextInt();
            ler.nextLine();

            if (opcao == 1) {

                Funcionario f = new Funcionario();

                System.out.print("Nome: ");
                f.setNome(ler.nextLine());

                System.out.print("Identificacao: ");
                f.setIdentificacao(ler.nextLine());

                System.out.print("Salario: ");
                f.setSalario(ler.nextDouble());
                ler.nextLine();

                d1.addFuncionario(f);

            } else if (opcao == 2) {

                d1.ListarFuncionarios();

            } else if (opcao == 3) {

                System.out.print("Nome: ");
                String nome = ler.nextLine();

                System.out.print("Identificacao: ");
                String id = ler.nextLine();

                boolean removido = d1.removerFuncionario(nome, id);

                if (!removido) {
                    System.out.println("Funcionario nao encontrado!");
                }

            } else if (opcao == 4) {

                System.out.println(d1);

            }

        } while (opcao != 5);

        System.out.println("Encerrando sistema...");

    }
}
