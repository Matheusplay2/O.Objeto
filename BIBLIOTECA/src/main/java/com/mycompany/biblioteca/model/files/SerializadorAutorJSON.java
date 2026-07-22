package com.mycompany.biblioteca.model.files;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.biblioteca.model.entidades.Autor;
import java.util.List;

public class SerializadorAutorJSON implements ISerializadorAutor {


     @Override
    public String toFile(List<Autor> autores) {
        try {
            // Convertendo objeto autor para JSON
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(autores);

            return jsonString;
        } catch (JsonProcessingException e) {
          e.printStackTrace();
        }
          return null;
    }
   
    public List<Autor> fromFile(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Autor> autores = mapper.readValue(jsonString, new TypeReference<List<Autor>>() {});
             return autores;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
        
        

    

