package classes;

import java.util.Objects;


public class Transacao {
    private String identificador;
    private String tipo;
    private double valor;
    private String data;
    private Conta contaAssociada;

    public Transacao() {
        this.identificador="";
        this.tipo="";
        this.valor=0.0;
        this.data="";
        this.contaAssociada= new Conta();
      
    }

    public Transacao(String identificador, String tipo, double valor, String data) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.contaAssociada= new Conta();
    
    }
    public void copiar(Transacao outro){
        this.identificador= outro.getIdentificador();
        this.tipo=outro.getTipo();
        this.valor=outro.getValor();
        this.data=outro.getData();
        this.contaAssociada= new Conta();
        this.contaAssociada.copiar(outro.getContaAssociada());

    }
    @Override
    public String toString(){
       return "Transacao{Identificador:"+this.identificador+ 
               " ,Tipo:"+this.tipo+" ,Valor:"+this.valor+" ,Data:"+
               this.data+ " ,Conta associada:"+ this.contaAssociada+"}";
        
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.identificador);
        hash = 43 * hash + Objects.hashCode(this.tipo);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 43 * hash + Objects.hashCode(this.data);
        hash = 43 * hash + Objects.hashCode(this.contaAssociada);
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
        final Transacao other = (Transacao) obj;
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.identificador, other.identificador)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return Objects.equals(this.contaAssociada, other.contaAssociada);
    }
    

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public Conta getContaAssociada(){
      return this.contaAssociada;  
    }
    
   public void setContaAssociada(Conta contaAssociada){
       this.contaAssociada = contaAssociada;
   }
}

