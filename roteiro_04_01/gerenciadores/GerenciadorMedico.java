
package com.mycompany.roteiro_04_01.gerenciadores;

import com.mycompany.roteiro_04_01.arquivo.FilePersistence;
import com.mycompany.roteiro_04_01.arquivo.SerializadorMedicoCSV;
import com.mycompany.roteiro_04_01.classes.Medico;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorMedico {
    private List<Medico>lstMedicos;
    
    private String caminho="src\\main\\java\\com\\mycompany\\roteiro_04_01\\dados\\medicoCsv.csv";
    public GerenciadorMedico() throws FileNotFoundException{
        this.lstMedicos= new ArrayList<>();
        this.carregarDoArquivo();
    }
    
    public void add(Medico medico){
        this.lstMedicos.add(medico);
    }
    
    public boolean remover(String crm){
        for(Medico medico: this.lstMedicos){
            if(medico.getCrm().equals(crm)){
            this.lstMedicos.remove(medico);
            return true;
          }
        }
  
       return false; 
    }
    
    
    public Medico pesquisar(String crm){
        for(Medico medico : this.lstMedicos){
            if(medico.getCrm().equals(crm)){
                return medico;     
            }
        }       
        return null;
    }
    
    public void atualizar(String crm , Medico novoMedico){
        
        for (Medico medico: this.lstMedicos){
            if(medico.getCrm().equals(crm)){
                medico.copiar(novoMedico);
            }
   
        }
  
    }
    public String listar(){
        String resultado="";
         for(Medico medico: this.lstMedicos){
           resultado+=medico + "\n";
            
        }
          return resultado;
    }
    
   public void salvarNoArquivo() throws IOException {
        SerializadorMedicoCSV serializador = new SerializadorMedicoCSV();
        String csvData = serializador.ToCSV(this.lstMedicos);
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, this.caminho);
        System.out.println("Medicos salvos com sucesso em " + this.caminho);
    }

    public void carregarDoArquivo() throws FileNotFoundException {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadToFile(this.caminho);
        SerializadorMedicoCSV serializador = new SerializadorMedicoCSV();
        this.lstMedicos = serializador.fromCSV(csvData);
        System.out.println("Medicos carregados com sucesso de " + this.caminho);
    }
}

