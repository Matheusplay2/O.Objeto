
package com.mycompany.biblioteca.arquivos;

import com.mycompany.biblioteca.classes.Autor;
import com.mycompany.biblioteca.classes.Livro;
import java.util.ArrayList;
import java.util.List;

public class SerializadorLivroCSV {
    
        
    public String toCsv(List <Livro>livros){
       String csv = "Titulo;Ano;Autor\n";
        
        for(Livro livro: livros){
            csv+= livro.getTitulo()+";"+
                  livro.getAno()+";"+
                  livro.getAutor()+";\n";
         }
        return csv;
    }
    
    public List<Livro> fromCSV(String data){
         List<Livro> livros = new ArrayList<>();
        
        String[] linhas = data.split("\n");
        
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >=3) {
               Livro  livro = new Livro();
               livro.setTitulo(partes[0]);
               livro.setAno(Integer.parseInt(partes[1]));
               
               Autor autor= new Autor();
               autor.setNome(partes[2]);
               autor.setCddNatal(partes[3]);
               
       
                livros.add(livro);
            }
        }
        return livros;
    }
}
