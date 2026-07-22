package com.mycompany.biblioteca.model.files;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.biblioteca.model.entidades.Livro;
import java.util.List;



public class SerializadorLivroJSON implements ISerializadorLivro {

    @Override
    public String toFile(List<Livro> livros) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(livros);
            return jsonString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Livro> fromFile(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Livro> livros = mapper.readValue(jsonString, new TypeReference<List<Livro>>() {});
            return livros;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

