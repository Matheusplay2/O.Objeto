
package classes;

import java.util.Objects;


public class Avaliacao {
    private double nota;
    private String comentario;

    public Avaliacao() {
        this.nota=0.0;
        this.comentario="";
    }

    public Avaliacao(double nota, String comentario) {
        this.nota = nota;
        this.comentario = comentario;
    }
    
    public Avaliacao(Avaliacao outro){
        this.comentario=outro.getComentario();
        this.nota=outro.getNota();
        
    }
    
    public void copiar(Avaliacao outro){
        this.nota=outro.getNota();
        this.comentario=outro.getComentario();
  
    }
    
    @Override
    public String toString(){
        return " Avaliacao{Nota:"+this.nota+", Comentario:"+this.comentario+"}";
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.nota) ^ (Double.doubleToLongBits(this.nota) >>> 32));
        hash = 43 * hash + Objects.hashCode(this.comentario);
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
        final Avaliacao other = (Avaliacao) obj;
        if (Double.doubleToLongBits(this.nota) != Double.doubleToLongBits(other.nota)) {
            return false;
        }
        return Objects.equals(this.comentario, other.comentario);
    }
    
    
    
    public double getNota(){
       return this.nota; 
    }
    public String getComentario(){
       return this.comentario; 
    }
    public void setNota( double nota){
       this.nota= nota;
    }
    public void setComentario(String comentario){
        this.comentario= comentario;
    }
    
}
