package com.mycompany.ex01_36.gerenciadores;

import com.mycompany.ex01_36.arquivo.CSVDisciplina;
import com.mycompany.ex01_36.arquivo.FilePersitence;
import com.mycompany.ex01_36.classes.Disciplina;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class gerenciadorDisciplina {
    private List<Disciplina> lstDisciplinas;
    private String caminho= "src\\main\\java\\com\\mycompany\\ex01_36\\dados\\DisciplinaCsv.csv";
    public gerenciadorDisciplina() {
        this.lstDisciplinas= new ArrayList<>();
    }
    
    public void add(Disciplina disciplina){
        this.lstDisciplinas.add(disciplina);
  }
    
    public boolean remover(String cod){
        for(Disciplina disciplina: this.lstDisciplinas){
            if (disciplina.getCod().equals(cod)){
                this.lstDisciplinas.remove(disciplina);
                return true;
            }
         }
        
        return false;
    }
    
    public Disciplina pesquisar(String cod){
        for(Disciplina disciplina: this.lstDisciplinas){
            if (disciplina.getCod().equals(cod)){
                return disciplina;
                
            }
        }
        
        return null;
    }
    
    public void atualizar(String cod , Disciplina novaDisciplina){
        for(Disciplina disciplina: this.lstDisciplinas){
            if(disciplina.getCod().equals(cod)){
            disciplina.copiar(novaDisciplina);
            
           }
        } 
    }
    public String listar(){
        String resultado="";
        for(Disciplina disciplina: this.lstDisciplinas){
            resultado+= disciplina+ "\n";
            
        }
        
      return resultado;  
    }
    
    public void salvarNoArquivo() throws FileNotFoundException, IOException{
       CSVDisciplina serializador= new CSVDisciplina();
       String dataCsv= serializador.toCsv(lstDisciplinas);
       
       FilePersitence filePersitence= new FilePersitence();
       filePersitence.saveToFile(dataCsv, caminho);
       System.out.println("Disciplina  Salva  com sucesso " + this.caminho);  
        
    }
    
    public void carregarDoArquivo() throws FileNotFoundException{
        FilePersitence  filePersitence= new FilePersitence();
        String dataCsv=filePersitence.loadToFile(caminho);
        
        
        CSVDisciplina serializador= new CSVDisciplina();
        serializador.fromCsv(dataCsv);
        
        System.out.println(" Disciplinas carregada  com sucesso de "+ this.caminho);
        
    }
}
