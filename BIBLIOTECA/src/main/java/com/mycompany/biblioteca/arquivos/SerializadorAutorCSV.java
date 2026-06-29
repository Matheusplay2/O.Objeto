
package com.mycompany.biblioteca.arquivos;

import com.mycompany.biblioteca.classes.Autor;
import java.util.ArrayList;
import java.util.List;


public class SerializadorAutorCSV {
    
    public String toCsv(List <Autor>autores){
        String csv=" Nome;CidadeNatal;\n";
        
        for(Autor autor: autores){
            csv+= autor.getNome()+";"+
                    autor.getCddNatal()+";\n";
         }
        return csv;
    }
    
    public List<Autor> fromCSV(String data){
         List<Autor> autores = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 2) {
                Autor autor = new Autor();
               autor.setNome(partes[0]);
               autor.setCddNatal(partes[1]);
                
                
                autores.add(autor);
            }
        }
        return autores;
    }
        
        
}
    

