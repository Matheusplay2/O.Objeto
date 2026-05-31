
package com.mycompany.roteiro_04_01.arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FilePersistence {
    
    
    public void saveToFile(String texto, String caminho) throws IOException{
        FileWriter  arquivo= new FileWriter(caminho);
        PrintWriter gravarArquivo = new PrintWriter(arquivo);
        gravarArquivo.print(texto);
        arquivo.close();
    }
    
    
    public String loadToFile( String caminho) throws FileNotFoundException{
   
        String conteudoLido="";
        
        File arquivo=  new File(caminho);
        
        Scanner ler= new Scanner(arquivo);
        
        ler.useDelimiter("\\z");
        
        while(ler.hasNext()){
            conteudoLido+= ler.next();
            
        }
    
        return conteudoLido;
    
   }
}
