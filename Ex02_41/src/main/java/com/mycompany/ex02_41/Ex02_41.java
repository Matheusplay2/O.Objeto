
package com.mycompany.ex02_41;

import com.mycompany.ex02_41.subClasses.Diretor;
import com.mycompany.ex02_41.subClasses.Engenheiro;
import com.mycompany.ex02_41.subClasses.Gerente;
import com.mycompany.ex02_41.subClasses.Secretario;
import com.mycompany.ex02_41.superClasse.Funcionario;

/**
 *
 * @author matheus henrique
 */
public class Ex02_41 {

    public static void main(String[] args) {
        Funcionario f= new Funcionario("Matheus","001",21);
        System.out.print("      FUNCIONARIO   ");
        System.out.print(f.toString());
       
        System.out.println();
        Engenheiro e= new Engenheiro("Ana Flavia","002",20,"123456/D-MG","Civil");
        System.out.print("      ENGENHEIRO     ");
        e.imprimir();
        System.out.println();
        Diretor d = new Diretor();
        System.out.println("Preenchendo Dados de Diretor");
        d.preencher();
        System.out.print("     DIRETOR      ");
        System.out.println(d.toString());
        
        Secretario s = new Secretario();
        System.out.println("Preenchendo Dados de Secretario");
        s.preencher();
        System.out.print("    SECRETARIO  ");
        s.imprimir();
        
        
        Gerente g= new Gerente("Jose","005",50,"Vendas");
        System.out.print("        GERENTE    ");
        System.out.print(g.toString());
    }
}
