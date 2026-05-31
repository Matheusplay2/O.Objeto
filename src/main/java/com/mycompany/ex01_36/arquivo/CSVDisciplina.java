package com.mycompany.ex01_36.arquivo;

import com.mycompany.ex01_36.classes.Alunos;
import com.mycompany.ex01_36.classes.Disciplina;
import com.mycompany.ex01_36.classes.Professor;
import java.util.ArrayList;
import java.util.List;

/*Para cada disciplina, registre o nome, semestre, horário, 
o professor ministrante e uma lista dos alunos matriculados.*/

public class CSVDisciplina {
    
    
    public String toCsv(List<Disciplina> disciplinas){
        String csv="Nome;Codigo;Semestre;Horario; ProfessorNome;Sexo;Idade;Cpf"+
                "AlunoNome;Sexo;Idade;Matricula;AnoIngressao;\n";
        
        for(Disciplina disciplina: disciplinas){
            Professor p= new Professor();
            Alunos a= new Alunos();
        csv+=  disciplina.getNome()+";"+
                disciplina.getSemestre()+";"+
                disciplina.getCod()+";"+
                disciplina.getHorario()+";"+
                p.getNome()+";"+
                p.getSexo()+";"+
                p.getIdd()+";"+
                p.getCpf()+";"+
                a.getNome()+";"+
                a.getSexo()+";"+
                a.getMatricula()+";"+
                a.getIddAluno()+";"+
                a.getIddAluno()+";"+
                a.getMatricula()+";"+
                a.getAno()+";\n";
                    
        }
        return csv;
    }
    
    public List<Disciplina> fromCsv(String data){
        List<Disciplina> disciplinas= new ArrayList<>();
        
        String []linhas = data.split("\n");
        
        for(int i=1; i <= linhas.length;i++){
            String []partes= linhas[i].split(";");
            
            if ( partes.length >=13){
                Disciplina disciplina = new Disciplina();
                Alunos aluno= new Alunos();
                Professor professor= new Professor();
                
                disciplina.setNome(partes[0]);
                disciplina.setCod(partes[1]);
                disciplina.setSemestre(partes[2]);
                disciplina.setHorario(partes[3]);
                professor.setNome(partes[4]);
                professor.setSexo(partes[5]);
                professor.setIdd(Integer.parseInt(partes[6]));
                professor.setCpf(partes[7]);
                aluno.setNome(partes[8]);
                aluno.setSexo(partes[9]);
                aluno.setIddAluno(Integer.parseInt(partes[10]));
                aluno.setMatricula(partes[11]);
                aluno.setAno(Integer.parseInt(partes[12]));
                
                disciplinas.add(disciplina);
            }
  
        }
        return disciplinas;
    }
}
