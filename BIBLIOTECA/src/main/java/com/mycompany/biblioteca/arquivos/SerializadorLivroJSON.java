
package com.mycompany.biblioteca.arquivos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.biblioteca.classes.Livro;


public class SerializadorLivroJSON {
    
        
     public String livroToJSON(Livro livro) {
        try {
            // Convertendo objeto livro para JSON
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(livro);

            return jsonString;
        } catch (JsonProcessingException e) {
            return null;
        }
    }

    public Livro JSONTo(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Livro livro = mapper.readValue(jsonString, Livro.class);

            return livro;
        } catch (JsonProcessingException e) {
            return null;
        }
    }
}
