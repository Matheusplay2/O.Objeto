
package com.mycompany.ex01_36.arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FilePersitence {
    
    public void saveToFile(String texto, String caminho) throws IOException{
        
        FileWriter arq= new FileWriter(caminho);
        PrintWriter gravarArq= new PrintWriter(arq);
        gravarArq.print(texto);
        arq.close();
        
    }
    
    public String loadToFile(String caminho) throws FileNotFoundException{ 
        String conteudoLido= "";
        
        File arquivo= new File(caminho);
        Scanner ler= new Scanner(arquivo);
        
        ler.useDelimiter("\\z");
        
        
        while (ler.hasNext()){
      }
       return conteudoLido; 
    }
}
