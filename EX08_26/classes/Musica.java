
package classes;

import java.util.Objects;


public class Musica {
    private String titulo;
    private double duracao;

    public Musica() {
        this.titulo="";
        this.duracao=0.0;
    }

    public Musica(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }
   @Override
    public String toString(){
        return " Musica{ Titulo:"+this.titulo+ " ,Duracao:"+this.duracao+" }";
        
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.titulo);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.duracao) ^ (Double.doubleToLongBits(this.duracao) >>> 32));
        return hash;
    }
    public void copiar(Musica outro){
        this.titulo=outro.getTitulo();
        this.duracao=outro.getDuracao();
        
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
        final Musica other = (Musica) obj;
        if (Double.doubleToLongBits(this.duracao) != Double.doubleToLongBits(other.duracao)) {
            return false;
        }
        return Objects.equals(this.titulo, other.titulo);
    }

    
    
    public Musica (Musica outro){
        this.titulo=outro.getTitulo();
        this.duracao=outro.getDuracao();
        
        
    }
    
    
    
    public String getTitulo() {
        return this.titulo;
    }

    public double getDuracao() {
        return this.duracao;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
  
    
}
