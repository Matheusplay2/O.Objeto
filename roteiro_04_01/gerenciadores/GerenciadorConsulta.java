
package com.mycompany.roteiro_04_01.gerenciadores;

import com.mycompany.roteiro_04_01.arquivo.FilePersistence;
import com.mycompany.roteiro_04_01.arquivo.SerializadorConsultaCSV;
import com.mycompany.roteiro_04_01.classes.Consulta;
import com.mycompany.roteiro_04_01.classes.Medico;
import com.mycompany.roteiro_04_01.classes.Paciente;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorConsulta {
    
    private List<Consulta>lstConsultas;
    private String caminho="src\\main\\java\\com\\mycompany\\roteiro_04_01\\dados\\consultasCSV.csv";

    public GerenciadorConsulta() throws FileNotFoundException {
        this.lstConsultas= new ArrayList<>();
        this.carregarDoArquivo();
    }
    
    
    public void add(Consulta consulta){
        this.lstConsultas.add(consulta);
        
    }
    
    
    public boolean remover(String data,String horas,Paciente paciente , Medico medico){
        for(Consulta consulta : this.lstConsultas){
        if(consulta.getData().equals(data)){
            if(consulta.getHoras().equals(horas)){
                if(consulta.getPaciente().equals(paciente)){
                   if(consulta.getMedico().equals(medico)) {
                     this.lstConsultas.remove(consulta);
                     return true;
                       
                   }
                }
       
            }
     
        }
    }
        
        return false;
    }
    
    
    public Consulta pesquisar(String data, String horas ,Paciente paciente, Medico medico){
        for(Consulta consulta: this.lstConsultas){
            
             if (consulta.getData().equals(data)&& consulta.getHoras().equals(horas)
                     && consulta.getMedico().equals(medico)&& consulta.getPaciente().equals(paciente)){
                 
                 return consulta;
                 
             }
       } 
        return null;
    }
    
    
    public void atualizar(String data, String horas, Paciente paciente, Medico medico ,Consulta novaConsulta){
       for(Consulta consulta : this.lstConsultas){
         if (consulta.getData().equals(data)&& consulta.getHoras().equals(horas)
              && consulta.getMedico().equals(medico)&& consulta.getPaciente().equals(paciente)){
                 consulta.copiar(novaConsulta);
               }
        }
        
    }
    public String listar(){
        
       String resultado="";
       for(Consulta consulta: this.lstConsultas){ 
           resultado+=consulta +"\n";
       }
     return resultado;
    }
     public void salvarNoArquivo() throws IOException {
        SerializadorConsultaCSV serializador = new SerializadorConsultaCSV();
        String csvData = serializador.toCSV(this.lstConsultas);
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, this.caminho);
        System.out.println("Consultas salvas com sucesso em " + this.caminho);
    }

    public void carregarDoArquivo() throws FileNotFoundException {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadToFile(this.caminho);
        SerializadorConsultaCSV serializador = new SerializadorConsultaCSV();
        this.lstConsultas = serializador.fromCSV(csvData);
        System.out.println("Consultas carregadas com sucesso de " + this.caminho);
    }

     
}
