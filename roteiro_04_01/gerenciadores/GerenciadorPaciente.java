
package com.mycompany.roteiro_04_01.gerenciadores;

import com.mycompany.roteiro_04_01.arquivo.FilePersistence;
import com.mycompany.roteiro_04_01.arquivo.SerializadorPacienteCSV;
import com.mycompany.roteiro_04_01.classes.Paciente;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorPaciente {
    private List<Paciente> lstPacientes;
    
    private String caminho="src\\main\\java\\com\\mycompany\\roteiro_04_01\\dados\\pacienteCsv.csv";

    public GerenciadorPaciente() throws FileNotFoundException {
        this.lstPacientes= new ArrayList<>();
        this.carregarDoArquivo();
    }
    
    
    public void add(Paciente paciente){
       this.lstPacientes.add(paciente);
        System.out.println("Paciente add");
    }
    
    public boolean remover(String cpf){
        for(Paciente paciente: this.lstPacientes){
            if(paciente.getCpf().equals(cpf)){
                this.lstPacientes.remove(paciente);
                return true;
             }
            
        }
        return false;
    }
    
    public Paciente pesquisar(String cpf){
        for(Paciente paciente: this.lstPacientes){
           if (paciente.getCpf().equals(cpf)){ 
               return paciente;
           }
        }
        return null;
    }
    
    
    public void atualizar(String cpf, Paciente novoPaciente){
        for(Paciente paciente:this.lstPacientes){
            if (paciente.getCpf().equals(cpf)){
                paciente.copiar(novoPaciente);
            }
        }
 
    }
    
    public String listar(){
        String resultado="";
        
        for(Paciente paciente:this.lstPacientes){
          resultado+=paciente+"\n";
         }
        return resultado;
        
    }
   public void salvarNoArquivo() throws IOException {
        SerializadorPacienteCSV serializador = new SerializadorPacienteCSV();
        String csvData = serializador.toCSV(this.lstPacientes);
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, this.caminho);
        System.out.println("Pacientes salvos com sucesso em " + this.caminho);
    }

    public void carregarDoArquivo() throws FileNotFoundException {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadToFile(this.caminho);
        SerializadorPacienteCSV serializador = new SerializadorPacienteCSV();
        this.lstPacientes = serializador.fromCSV(csvData);
        System.out.println("Pacientes carregados com sucesso de " + this.caminho);
    }
}
