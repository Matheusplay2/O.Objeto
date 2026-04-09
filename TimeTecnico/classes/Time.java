
package classes;

public class Time {
    private String nome;
    private String cdd;
    private String fundacao;
    private Tecnico tecnico;

    public Time() {
        this.nome="";
        this.cdd="";
        this.fundacao="";
        this.tecnico=new Tecnico();
    }

    public Time(String nome, String cdd, String fundacao, Tecnico tecnico) {
        this.nome = nome;
        this.cdd = cdd;
        this.fundacao = fundacao;
        this.tecnico = tecnico;
    }
    
    public void copiar (Time outro){
        this.nome=outro.getNome();
        this.cdd=outro.getCdd();
        this.fundacao=outro.getFundacao();
        
        this.tecnico=new Tecnico();
        this.tecnico.copiar(outro.getTecnico());
  
    }
    @Override 
    public boolean equals(Object obj){
        
        if (obj == null)
            return false;
        Time outro= (Time)obj;
        return this.nome.equals(outro.getNome())&&
                this.cdd.equals(outro.getCdd())&&
                this.fundacao.equals(outro.getCdd())&&
                this.tecnico.equals(outro.getTecnico());

    }
    public void escalarTecnico(Tecnico novoTecnico){  
        this.tecnico=novoTecnico;
        
    }
    @Override
    public int hashCode(){
        int hash=7;
        
        hash= 20 * hash * this.nome.hashCode();
        hash=20*hash* this.cdd.hashCode();
        hash= 20* hash * this.fundacao.hashCode();
        hash=20 * hash * this.fundacao.hashCode();
        hash=20* hash *this.tecnico.hashCode();

        return hash; 
    }
   @Override
   public String toString(){
       
      return " Time{" +" Nome:"+ this.nome+ " Cidade:"+this.cdd+
              " Ano da Fundacao:"+ this.fundacao+ this.tecnico+ " }";
   }
    

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCdd() {
        return this.cdd;
    }
    public void setCdd(String cdd) {
        this.cdd = cdd;
    }
    public String getFundacao() {
        return this.fundacao;
    }
    public void setFundacao(String fundacao) {
        this.fundacao = fundacao;
    }
    public Tecnico getTecnico() {
        return this.tecnico;
    }
    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
   
    
    
}
