
package com.mycompany.ex12_26;

import classes.Empresa;
import classes.Funcionario;
import classes.Projeto;


public class Ex12_26 {

    public static void main(String[] args) {
    
    Empresa e1 = new Empresa("Tech Solutions");

   
        Funcionario f1 = new Funcionario("Ana", "F001");
        Funcionario f2 = new Funcionario("Carlos", "F002");
        Funcionario f3 = new Funcionario("Marcos", "F003");

        e1.addFuncionarioNaEmpresa(f1);
        e1.addFuncionarioNaEmpresa(f2);
        e1.addFuncionarioNaEmpresa(f3);

        Projeto p1 = new Projeto(
                "Sistema Bancario",
                101,
                "Projeto em Java"
        );

        Projeto p2 = new Projeto(
                "Pesquisa de Mercado",
                102,
                "Analise de dados"
        );

        Projeto p3 = new Projeto(
                "Aplicativo Mobile",
                103,
                "Projeto Android"
        );

        e1.addProjetoNaEmpresa(p1);
        e1.addProjetoNaEmpresa(p2);
        e1.addProjetoNaEmpresa(p3);

       
        f1.addProjeto(p1);
        f1.addProjeto(p2);
        f1.addProjeto(p3);

        p1.addFuncionario(f1);
        p2.addFuncionario(f1);
        p3.addFuncionario(f1);

        
        f2.addProjeto(p1);

        p1.addFuncionario(f2);

        
        f3.addProjeto(p2);
        f3.addProjeto(p3);

        p2.addFuncionario(f3);
        p3.addFuncionario(f3);

        

        System.out.println("\nLISTA DE FUNCIONARIOS:");
        e1.ListarFuncionario();

        

        System.out.println("\nLISTA DE PROJETOS:");
        e1.ListarProjeto();

     

        System.out.println("\nFUNCIONARIO MAIS PRODUTIVO:");
        System.out.println(e1.funcionarioMaisProdutivo());

        

        System.out.println("\nFUNCIONARIO MENOS PRODUTIVO:");
        System.out.println(e1.funcionarioMenosProdutivo());

    }
}