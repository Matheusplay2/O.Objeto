package com.mycompany.biblioteca.model.entidades;

import java.util.Objects;

public class Autor {
    private String nome;
    private String cddNatal;

    public Autor() {
        this.nome="";
        this.cddNatal="";
        
    }
   

    public Autor(String nome, String cddNatal) {
        this.nome = nome;
        this.cddNatal = cddNatal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.cddNatal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.cddNatal, other.cddNatal);
    }
    
    
    public void copiar(Autor outro){
        this.nome=outro.getNome();
        this.cddNatal=outro.getCddNatal();
    }
    
    @Override
    public String toString(){
        return "Autor{"+"Nome:"+this.nome+"\n"+
                "Cidade Natal:"+this.cddNatal+"}";
        }
    
    
    
    public String getNome(){
        return  this.nome;
    }
    public String getCddNatal(){
        return this.cddNatal;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCddNatal(String cddNatal){
        this.cddNatal=cddNatal;
    }
            
}
