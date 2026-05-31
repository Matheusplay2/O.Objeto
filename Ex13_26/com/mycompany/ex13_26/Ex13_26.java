

package com.mycompany.ex13_26;

import classes.Curso;
import classes.Estudante;
import classes.Universidade;


public class Ex13_26 {

    public static void main(String[] args) {
        Universidade u1= new Universidade(" IFSMG");
        
        Estudante e1= new Estudante(" Matheus","20112");
        Estudante e2= new Estudante ("Ana "," 37484");
        Estudante e3=new Estudante(" Maria"," 4844873");
        Estudante e4= new Estudante(" Jose"," 766474");
        Estudante e5= new Estudante("Matheus Henrique", "736635");
        Estudante e6= new Estudante("Claudiana", " 08647647");
        
        Curso c1= new Curso("Computacao","001");
        c1.matricularAluno(e1);
        c1.matricularAluno(e3);
        c1.matricularAluno(e4);
        
        Curso c2= new Curso( "Direito", "002");
        c2.matricularAluno(e2);
        c2.matricularAluno(e6);
        
        Curso c3 = new Curso("Admministracao","003");
        c3.matricularAluno(e5);
        
        
        u1.addCursoUniversidade(c1);
        u1.addCursoUniversidade(c2);
        u1.addCursoUniversidade(c3);
        
        
        u1.addEstudante(e1);
        u1.addEstudante(e2);
        u1.addEstudante(e3);
        u1.addEstudante(e4);
        u1.addEstudante(e5);
        u1.addEstudante(e6);
        System.out.println("  Todos os Cursos");
        u1.listarCursos();
        System.out.println();
        System.out.println("  Estudantes  dos Cursos");
        u1.listarEstudantes();
        System.out.println();
        
        System.out.println("   Total de alunos");
         System.out.println("Total:"+ u1.totalAluno());
        System.out.println();
        System.out.println("  Curso com mais alunos");
        System.out.println(u1.cursoComMaisAlunos().getNomeCurso());
    }
}
