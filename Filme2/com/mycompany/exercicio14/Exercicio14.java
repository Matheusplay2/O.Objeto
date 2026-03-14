
package com.mycompany.exercicio14;
import classe.Filme;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio14 {

    public static int menu() {

        Scanner ler = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("    ESCOLHA UMA OPCAO");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Remover");
        System.out.println("3 - Procurar");
        System.out.println("----------------------------");

        return ler.nextInt();
    }

    public static void main(String[] args) {

        List<Filme> filmes = new ArrayList<>();
        Scanner ler = new Scanner(System.in);

        int opcao = menu();

        if (opcao == 1) {

            System.out.println("Adicionando");

            Filme f1 = new Filme();
            f1.preencher();

            filmes.add(f1);

        }

        else if (opcao == 2) {

            System.out.println("Removendo");

            System.out.println("Informe titulo:");
            ler.nextLine();
            String titulo = ler.nextLine();

            System.out.println("Informe nome do Diretor:");
            String nome = ler.nextLine();

            for (int i = 0; i < filmes.size(); i++) {

                Filme f1 = filmes.get(i);

                if (titulo.equals(f1.getTitulo()) && nome.equals(f1.getDiretor())) {

                    System.out.println("Filme encontrado e removido");

                    filmes.remove(i);
                }
            }
        }

        else if (opcao == 3) {

            System.out.println("Procurando");

            System.out.println("Informe titulo:");
            ler.nextLine();
            String titulo = ler.nextLine();

            System.out.println("Informe nome do Diretor:");
            String nome = ler.nextLine();

            for (int i = 0; i < filmes.size(); i++) {

                Filme f1 = filmes.get(i);

                if (titulo.equals(f1.getTitulo()) && nome.equals(f1.getDiretor())) {

                    System.out.println("Filme encontrado");

                    f1.imprimir();
                }
            }
        }
    }
}