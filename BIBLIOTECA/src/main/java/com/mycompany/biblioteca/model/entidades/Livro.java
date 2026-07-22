package com.mycompany.biblioteca.model.entidades;

public class Livro {
    private String titulo;
    private int ano;
    private Autor autor;

    public Livro() {
        this.titulo="";
        this.ano=0;
        this.autor= null;
    }

    public Livro(String titulo, int ano, Autor autor) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }

    public String getTitulo() {
        return  this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
 
}
