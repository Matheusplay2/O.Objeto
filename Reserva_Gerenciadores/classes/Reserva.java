
package classes;

import java.util.Objects;


public class Reserva {
    String nome;
    private int numPessoas;
    private String data;
    private String horas;

    public Reserva() {
    }
    
    public Reserva(String nome,int numPessoas,String data,String horas){
        this.nome=nome;
        this.numPessoas=numPessoas;
        this.data=data;
        this.horas=horas;
        
    }
    
    public void copiar( Reserva outro){
        
        this.nome=outro.getNome();
        this.numPessoas=outro.getNumPessoas();
        this.data=outro.getData();
        this.horas=outro.getHoras();
 
    }
    @Override
    public String toString(){
        
        return " Nome:"+this.nome+ 
                ", Numero de pessoas:"+this.numPessoas+
                ", Data:"+this.data + ", Horáio:"+this.horas + " hs";
   
    };
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.nome);
        hash = 31 * hash + this.numPessoas;
        hash = 31 * hash + Objects.hashCode(this.data);
        hash = 31 * hash + Objects.hashCode(this.horas);
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
        final Reserva other = (Reserva) obj;
        if (this.numPessoas != other.numPessoas) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return Objects.equals(this.horas, other.horas);
    }

    
    
    public String getNome(){
        return nome;
    }
    
    public int getNumPessoas(){
        return numPessoas;
    }
    
    public String getData(){
        return data;
    }

    public String getHoras() {
        return horas;
    }
    
  
    public void setNome(String nome){
       this.nome=nome;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }
    public void setNumPessoas(int numPessoas){
        this.numPessoas=numPessoas;
    }
    public void setData(String data){
        this.data=data;
    }       
        
}
