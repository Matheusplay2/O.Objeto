
package com.mycompany.ex01_36.arquivo;

import com.mycompany.ex01_36.classes.Professor;
import java.util.ArrayList;
import java.util.List;


public class CSVProfessor {
    public String toCsv(List<Professor>professores){
       String csv= "Nome;Sexo;Idade;CPF;\n" ;
        
       for(Professor professor: professores ){
        csv+=   professor.getNome()+";"+
           professor.getSexo()+";"+
           professor.getCpf()+";"+
           professor.getIdd()+";\n";
        }
        return csv;
    }
    
    public  List<Professor> fromCsv(String data){
        List<Professor> professores= new ArrayList<>();
        
        String []linhas= data.split("\n");
        for(int i=1; i < linhas.length;i++){
            
           String []partes=linhas[i].split(";");
           if (partes.length <= 3){
               Professor professor= new Professor();
               professor.setNome(partes[0]);
               professor.setSexo(partes[1]);
               professor.setIdd(Integer.parseInt(partes[2]));
               professor.setCpf(partes[3]);
               
               professores.add(professor);
           }
        }
        
        return professores;
    }
}
