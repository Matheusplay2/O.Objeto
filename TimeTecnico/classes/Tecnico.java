
package classes;


public class Tecnico {
    private String nome;
    private String nacionalidade;
    private int nascimento;

    public Tecnico() {
        this.nome=" ";
        this.nacionalidade=" ";
        this.nascimento=0;
    }

    public Tecnico(String nome, String nacionalidade, int nascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.nascimento = nascimento;
    }
    @Override 
    public int hashCode(){
        int hash=9;
        
        hash= 20* hash *this.nome.hashCode();
        hash=20* hash * this.nacionalidade.hashCode();
        hash=20* hash * this.nascimento;
        return hash;
    }
    
    public void copiar( Tecnico outro){
        this.nome=outro.getNome();
        this.nacionalidade=outro.getNacionalidade();
        this.nascimento=outro.getNascimento();
        
    }
    @Override
    public boolean equals(Object obj){
        if (obj == null)
      return false;
        Tecnico outro=(Tecnico)obj;
        return this.nome.equals(outro.getNome())&&
                this.nacionalidade.equals(outro.nacionalidade)&&
                this.nascimento== outro.nascimento;
        
    }
    @Override
    public String toString (){
        
       return " Tecnico{Nome:"+this.nome+" Nacionalidade:"+this.nacionalidade+ " Ano de Nascimento:"+this.nascimento+ "}"; 
        
    }
    
    
    public String getNome(){
      return this.nome;  
    }
    public String getNacionalidade(){
       return this.nacionalidade; 
    }
    public int getNascimento(){
        return this.nascimento;
    }
    public void  setNome(String nome){
        this.nome=nome;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade=nacionalidade;
    }
    public void setNascimento(int nascimento){
        this.nascimento=nascimento;
    }
}
