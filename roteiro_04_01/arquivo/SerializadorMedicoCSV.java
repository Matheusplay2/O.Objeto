
package com.mycompany.roteiro_04_01.arquivo;

import com.mycompany.roteiro_04_01.classes.Medico;
import java.util.ArrayList;
import java.util.List;


public class SerializadorMedicoCSV {
    
    
    public String ToCSV(List<Medico> medicos){
       String csv="Nome;CRM ;Especialidade; Horario;\n";
       
       
        for(Medico medico: medicos){
             csv+= medico.getNome()+";"
             + medico.getCrm()+";"
             + medico.getEspecialidade()+";"
             +medico.getHorariosDisponiveis()+";\n";
        }
    return csv;
    }
    
  
    public List<Medico> fromCSV(String data){
        
       List <Medico> medicos= new ArrayList<>();
       
       String []linhas =data.split("\n");
       for(int i=1; i < linhas.length;i++){
          
           String[]partes=linhas[i].split(";");
           
           if (partes.length >=4){
               Medico medico = new Medico();
               
               medico.setNome(partes[0]);
               medico.setCrm(partes[1]);
               medico.setEspecialidade(partes[2]);
               medico.setHorariosDisponiveis(partes[3]);
               
               
               medicos.add(medico);
           }
      
       }
       return medicos; 
       
    }
    
}
