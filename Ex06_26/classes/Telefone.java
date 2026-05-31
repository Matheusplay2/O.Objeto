
package classes;

import java.util.Objects;


public class Telefone {
    private String ddd;
    private String numero;
    private String descricao;
    private String operadora;

    public Telefone() {
        this.ddd="";
        this.numero="";
        this.descricao="";
        this.operadora="";
    }
    
   public Telefone(Telefone outro){
       this.ddd=outro.getDdd();
       this.numero=outro.getNumero();
       this.descricao=outro.getDescricao();
       this.operadora=outro.getOperadora();
       
   }
    public Telefone(String ddd, String numero, String descricao, String operadora) {
        this.ddd = ddd;
        this.numero = numero;
        this.descricao = descricao;
        this.operadora = operadora;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.ddd);
        hash = 97 * hash + Objects.hashCode(this.numero);
        hash = 97 * hash + Objects.hashCode(this.descricao);
        hash = 97 * hash + Objects.hashCode(this.operadora);
        return hash;
    }
    
    @Override 
    public String toString(){
        return " Telefone{DDD:"+this.ddd+ " ,Numero:"+this.numero
                +", Descricao:"+this.descricao+ " ,Operadora:"+this.operadora+"}";
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
        final Telefone other = (Telefone) obj;
        if (!Objects.equals(this.ddd, other.ddd)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return Objects.equals(this.operadora, other.operadora);
    }
    
    public void imprimirTel(){
        System.out.println(this);
    }
    public void copiar( Telefone outro){
        
        this.ddd=outro.getDdd();
        this.numero= outro.getNumero();
        this.descricao=outro.getDescricao();
        this.operadora= outro.getOperadora();
        
    }
    

    public String getDdd() {
        return this.ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOperadora() {
        return this.operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    
    
    
    
}
