package com.mycompany.ex01_36.arquivo;
import com.mycompany.ex01_36.classes.Alunos;
import java.util.ArrayList;
import java.util.List;

/*nome, sexo, idade, matrícula, e ano de ingresso.*/


public class CSVAlunos {
    public String toCsv(List<Alunos> alunos){
        
        String csv="Nome;Sexo;Idade;Matricula;Ingresso;\n";
        
         for (Alunos aluno: alunos){
             csv+=aluno.getNome()+";"+
                     aluno.getSexo()+";"+
                     aluno.getIddAluno()+";"+
                     aluno.getMatricula()+";"+
                     aluno.getAno()+";\n";
             
             
         }
          return csv;
    }
    
    public List<Alunos>fromCsv(String data){
        List<Alunos> alunos= new ArrayList<>();
        
        String []linhas=data.split("\n");
        
        for(int i=1; i<= linhas.length;i++){
            String []partes= linhas[i].split("");
            
            
            if (partes.length >= 5){
                 Alunos aluno = new Alunos();
                 
                 aluno.setNome(partes[0]);
                aluno.setSexo(partes[1]);
                aluno.setIddAluno(Integer.parseInt(partes[2]));
                aluno.setMatricula(partes[3]);
                aluno.setAno(Integer.parseInt(partes[4]));
                
                
                alunos.add(aluno);
            }
            
        }
        return alunos;
    }
}
