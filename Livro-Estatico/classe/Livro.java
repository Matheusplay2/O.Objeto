
package classe;

import java.util.Objects;


public class Livro {
    private String titulo;
    private String autor;
    private int  numPag;

    public Livro() {
    }

    public Livro(String titulo, String autor, int numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    public static String  nomeDaBiblioteca="Biblioteca Central ";
        
        
 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.titulo);
        hash = 47 * hash + Objects.hashCode(this.autor);
        hash = 47 * hash + this.numPag;
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
        final Livro other = (Livro) obj;
        if (this.numPag != other.numPag) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", numPag=" + numPag + " Biblioteca="+ nomeDaBiblioteca+"}";
    }
    
    public void copiar(Livro outro){
        
       this.autor=outro.getAutor();
       this.titulo=outro.getTitulo();
       this.numPag=outro.getNumPag();
    }
  
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    } 
}
