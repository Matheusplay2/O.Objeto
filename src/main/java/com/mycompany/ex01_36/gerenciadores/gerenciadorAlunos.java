package com.mycompany.ex01_36.gerenciadores;

import com.mycompany.ex01_36.arquivo.CSVAlunos;
import com.mycompany.ex01_36.arquivo.FilePersitence;
import com.mycompany.ex01_36.classes.Alunos;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class gerenciadorAlunos {
    private List<Alunos> lstAlunos;
    private String caminho="src\\main\\java\\com\\mycompany\\ex01_36\\dados\\AlunosCsv.csv";
    
    public gerenciadorAlunos(){
        this.lstAlunos= new ArrayList<>();
    }
    
    public void add(Alunos aluno){
        this.lstAlunos.add(aluno);
        System.out.println("Aluno add");
    }
    
    public boolean remover(String matricula){
        for(Alunos aluno: this.lstAlunos){
            if (aluno.getMatricula().equals(matricula)){
                this.lstAlunos.remove(aluno);
                return true;
             }
            
        }
         return false;
    }
    
    public Alunos pesquisar(String matricula){
        for(Alunos aluno : this.lstAlunos){
            if (aluno.getMatricula().equals(matricula)){
                return aluno;
             }
        }
        return null;
    }
    
    public void atualizar(String matricula, Alunos novoAluno){
        for(Alunos aluno: this.lstAlunos){
            if (aluno.getMatricula().equals(matricula)){
                aluno.copiar(novoAluno);
                
            }
            
        }
   
    }
    
    public String listar(){
        String resultado="";
        for (Alunos aluno : this.lstAlunos){
           resultado+=aluno +"\n"; 
            
        }
        return resultado;
    }
    public void salvarNoArquivo() throws IOException{
      CSVAlunos serializador= new CSVAlunos();
       String dataCsv= serializador.toCsv(lstAlunos);
      
       FilePersitence filePersitence=  new FilePersitence();
       filePersitence.saveToFile(dataCsv, caminho);
        System.out.println("Alunos salvos com sucesso "+ this.caminho);
    }
    
    public void carregarDoArquivo() throws FileNotFoundException{
        
        FilePersitence filePersitence= new FilePersitence();
        String dataCsv= filePersitence.loadToFile(caminho);
        
        CSVAlunos serializador= new CSVAlunos();
        serializador.fromCsv(dataCsv);
        System.out.println("Alunos carregados com sucesso de "+ this.caminho);
        
    }
}
