package com.mycompany.ex00_41;

import classes.Aluno;
import classes.Pessoa;
import classes.Professor;

/**
 *
 * @author matheus henrique
 */
public class Ex00_41 {

    public static void main(String[] args) {
        Pessoa p1= new Pessoa("Matheus", 'm', 21);
        System.out.println(p1.toString());
        
        Aluno a1= new Aluno();
        a1.preencher();
        System.out.println();
        a1.imprimir(); 
              
         
       Professor prof = new Professor("Carlos", 'M', 45, "123.456.789-00");
       System.out.println(prof.toString());

        
    }
}
