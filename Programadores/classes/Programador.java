
package classes;

public class Programador {
    private String nome;
    private int idade;
    private String empresa;
    private String cpf;

    public Programador() {
    }
    
    
    public Programador(String nome, int idade, String empresa, String cpf){
        this.nome=nome;
        this.idade=idade;
        this.empresa=empresa;
        this.cpf=cpf;
        
    }
    public void copiar(Programador outro){
        
        this.nome=outro.getNome();
        this.idade=outro.getIdade();
        this.empresa=outro.getEmpresa();
        this.cpf=outro.getCpf();
    }
    @Override
    public String toString (){
        
        return "Dados {"+ "Nome:"+this.nome+
                " Idade:"+this.idade +
                "  Empresa onde trabalha:"+this.empresa+
                " Cpf:"+this.cpf+" }";
    }
    @Override 
    public int hashCode(){
        
       int hash=5;
       hash= 22* hash *this.nome.hashCode( );
       hash= 22* hash * this.idade;
       hash=22 * hash * this.empresa.hashCode();
       hash=22 * hash *this.cpf.hashCode();
        
       return hash;
    }


    @Override 
    public boolean equals(Object obj){
        if (obj == null)
            return false;
            
        Programador outro=(Programador )obj;
            return this.nome.equals(outro.nome)&&
                    this.idade== outro.idade && 
                    this.empresa.equals(outro.empresa)&&
                    this.cpf== outro.cpf;
        
    }
    
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getEmpresa(){
        return this.empresa;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setNome(String nome){
      this.nome=nome;  
    }
    public void setIdade(int idade){
       this.idade=idade;    
    }
    public void setEmpresa(String empresa){
        this.empresa=empresa;
    }
    public void setCpf(String cpf){
       this.cpf=cpf; 
    }
}
