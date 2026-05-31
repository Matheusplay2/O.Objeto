
package com.mycompany.roteiro_04_01.arquivo;

import com.mycompany.roteiro_04_01.classes.Paciente;
import java.util.ArrayList;
import java.util.List;


public class SerializadorPacienteCSV {
    
    public String toCSV(List<Paciente> pacientes){
        
        String csv= "Nome ;CPF ; Nascimento;historico;\n";
        for(Paciente paciente: pacientes){
            csv+= paciente.getNome()+";"
            +paciente.getCpf()+";"
            +paciente.getDataNascimento()+";"
            +paciente.getHistorico()+";\n";
            
            
        }
        
       return csv; 
    }
    
    public List<Paciente> fromCSV (String data){
        
       List<Paciente> pacientes= new ArrayList<>(); 
       String linhas[]= data.split("\n");
        
        
        for(int i=1; i< linhas.length;i++){
            
            String[] partes=linhas[i].split(";");
            
            if(partes.length >= 4){
                Paciente paciente = new Paciente();
                paciente.setNome(partes[0]);
                paciente.setCpf(partes [1]);
                paciente.setDataNascimento(partes[2]);
                paciente.setHistorico(partes[3]);
                
                pacientes.add(paciente);

            }            
        }
        return pacientes;
  }
    
}
