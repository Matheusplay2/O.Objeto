package com.mycompany.biblioteca.arquivos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.biblioteca.classes.Autor;

public class SerializadorAutorJSON {

    public String autorToJSON(Autor autor) {
        try {
            // Convertendo objeto autor para JSON
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(autor);

            return jsonString;
        } catch (JsonProcessingException e) {
            return null;
        }
    }
   
    public Autor JSONTo(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Autor autor = mapper.readValue(jsonString, Autor.class);

            return autor;
        } catch (JsonProcessingException e) {
            return null;
        }
    }
}
        
        

    

