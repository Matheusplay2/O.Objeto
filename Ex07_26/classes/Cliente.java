
package classes;


public class Cliente {
    private String nome;
    private String cpf;
    private String email;

    public Cliente() {
        this.nome="";
        this.cpf="";
        this.email="";
    }

    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    public void imprimirCliente(){
        System.out.println(this);
    }
    @Override
    public String toString(){
      return " Cliente{Nome:"+this.nome+ ",Cpf:"+this.cpf+ ",Email:"+this.email+" }" ; 
        
    }
    @Override
    public int hashCode(){
      int hash=4;
      hash= 23* hash+this.nome.hashCode();
      hash=23* hash+ this.cpf.hashCode();
      hash=23*hash+ this.email.hashCode();
      
      return hash;
    }
    @Override
    public boolean equals(Object obj){
        
        if (obj== null)
        return false;
        Cliente outro=(Cliente)obj;
        return this.nome.equals(outro.getNome())&&
                this.cpf.equals(outro.getCpf())&&
                this.email.equals(outro.getEmail());
        
    }
    
    
    public String getNome(){
       return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getCpf(){
       return this.cpf;    
    }
    public void setCpf(String cpf){
       this.cpf=cpf; 
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}
