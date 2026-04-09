
package classes;

public class ContaBancaria {
    private int numero;
    private String tipo;
    private double saldo;

    public ContaBancaria() {
        this.numero=0;
        this.tipo="";
        this.saldo=0.0;
    }

    public ContaBancaria(int numero, String tipo, double saldo) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
    }
    @Override 
    public String toString(){
        return " Conta Bancaria{Numero:"+this.numero+ " Tipo:"+this.tipo+ " Saldo:"+this.saldo+" }";
    }
  
    public int funcaoHash(){
        int hash=9;
        hash= 20* hash *this.numero;
        hash=20* hash *this.tipo.hashCode();
        hash=(int) (20* hash *this.saldo);
        
        return hash;
    }
    public void depositar(double valor){
        if ( valor > 0){
            this.saldo+= valor;
            System.out.println("Deposito de RS"+ valor+ " com sucesso");
        }else{
            System.out.println("Deposito nao realizado");
        }
    }
    public void sacar(double valor){
        if ( valor >0 && valor <= this.saldo){
            this.saldo-=valor;
            System.out.println("Saque realizado no valor de "+valor+ "  Reais");
        }else{
            System.out.println("Saldo insfiente ou invalido!!! ");
        }
        
    }
    public void copiar( ContaBancaria outro){
        this.numero=outro.getNumero();
        this.tipo=outro.getTipo();
        this.saldo=outro.getSaldo();
    }
    
  
    @Override
    public boolean equals(Object obj){
       if (obj == null)
           return false;
           ContaBancaria outro=(ContaBancaria)obj;
       
           return this.numero==outro.numero&&
                   this.tipo.equals(outro.tipo)&&
                   this.saldo==outro.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    
}
