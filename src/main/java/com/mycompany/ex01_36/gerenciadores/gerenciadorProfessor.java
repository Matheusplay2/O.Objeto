package com.mycompany.ex01_36.gerenciadores;

import com.mycompany.ex01_36.arquivo.CSVProfessor;
import com.mycompany.ex01_36.arquivo.FilePersitence;
import com.mycompany.ex01_36.classes.Professor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus henrique
 */
public class gerenciadorProfessor {
    private List<Professor>lstProf;
    private String caminho= "src\\main\\java\\com\\mycompany\\ex01_36\\dados\\ProfessorCsv.csv";
    public gerenciadorProfessor() {
        this.lstProf= new ArrayList<>();
    }
    
    public void add(Professor professor){
        this.lstProf.add(professor);
        System.out.println("Professor add");
    }
    
    public boolean remover(String cpf){
        for (Professor professor : this.lstProf){
            if(professor.getCpf().equals(cpf)){
                this.lstProf.remove(professor);
                return true;
            }
        }
        return false;
    }
    
    public Professor pesquisar(String cpf){
        for(Professor professor : this.lstProf){
            if (professor.getCpf().equals(cpf)){
                return professor;
                
            }
        }
      return null;
    }
    
    public void atualizar(String cpf,Professor novoProfessor){
        for(Professor professor : this.lstProf){
            if(professor.getCpf().equals(cpf))
            professor.copiar(novoProfessor);
        }
     }
    
    public String listar(){
        String resultado="";
        for(Professor professor: this.lstProf){
            resultado+=professor+ "\n";
        }
        return resultado;
     }
    public void salvarNoArquivo() throws IOException{
       CSVProfessor serializador= new CSVProfessor();
       String csvData=serializador.toCsv(lstProf);
       FilePersitence filePersistence= new FilePersitence();
       filePersistence.saveToFile(csvData, caminho);
        System.out.println("Professores salvos com sucesso "+ this.caminho);
        
    }
    
    public void carregarDoArquivo() throws FileNotFoundException{
        FilePersitence filePersitence= new FilePersitence();
       String csvData= filePersitence.loadToFile(caminho);
       
        CSVProfessor serializador= new CSVProfessor();
        this.lstProf= serializador.fromCsv(csvData);
        System.out.println("Professores carregados com sucesso de "+ this.caminho);
    }
}
