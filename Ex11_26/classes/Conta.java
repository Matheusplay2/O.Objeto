package classes;

import java.util.Objects;

public class Conta {
    private String numeroDaConta;
    private String titularDaConta;
    private double saldo;

    public Conta() {
        this.numeroDaConta="";
        this.titularDaConta="";
        this.saldo=0.0;
    }

    public Conta(String numeroDaConta, String titularDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titularDaConta = titularDaConta;
        this.saldo = saldo;
    }
    
    public void copiar(Conta outro){
        this.numeroDaConta=outro.getNumeroDaConta();
        this.titularDaConta=outro.getTitulardaConta();
        this.saldo=outro.getSaldo();
    }
    
    @Override
    public String toString(){
        return "Conta{Numero da Conta:"+this.numeroDaConta+
                ",Titular da Conta:"+this.titularDaConta+
                ",Saldo:R$"+ this.saldo+"}";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.numeroDaConta);
        hash = 97 * hash + Objects.hashCode(this.titularDaConta);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
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
        final Conta other = (Conta) obj;
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        if (!Objects.equals(this.numeroDaConta, other.numeroDaConta)) {
            return false;
        }
        return Objects.equals(this.titularDaConta, other.titularDaConta);
    }
    public void Depositar(double valor){
        if( valor> 0){
            this.saldo+=valor; 
            System.out.print("Saldo atualizado apos deposito:"+ this.saldo);
        }else{
          System.out.println("Valor invalido para depositado");
        }
    }
    public void Sacar( double valor){
        if( valor  >0 && valor <= saldo){
            this.saldo-=valor;
            System.out.print("Saldo atualizado apos o saque:"+ this.saldo);
        }else{
            System.out.println("Saldo menor que valor a ser sacado");
        }
    }
 
    
    public String getNumeroDaConta(){
      return this.numeroDaConta;  
    }
    public String getTitulardaConta(){
      return this.titularDaConta;  
    }
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setNumeroDaConta(String numeroDaConta){
        this.numeroDaConta=numeroDaConta;
    }
    public void setTitularDaConta(String titularDaConta){
        this.titularDaConta=titularDaConta;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
}
