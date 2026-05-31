
package classes;

import gerenciadores.GerenciadorVoo;
import java.util.Objects;

/*Atributos: nome, localização, lista de voos.*/
public class Aeroporto {
    private String nome;
    private String localizacao;
    private GerenciadorVoo lstVoo;

    public Aeroporto() {
        this.nome="";
        this.localizacao="";
        this.lstVoo= new GerenciadorVoo();
    }

    public Aeroporto(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.lstVoo =  new GerenciadorVoo();
    }
    
    public Aeroporto(Aeroporto outro){
        this.nome= outro.getNome();
        this.localizacao=outro.getLocalizacao();
        this.lstVoo= new GerenciadorVoo(outro.getLstVoo());

    }
    public void copiar(Aeroporto outro){
        this.nome=outro.getNome();
        this.localizacao=outro.getLocalizacao();
        this.lstVoo= new GerenciadorVoo();
        
         for( Voo v: outro.getLstVoo().getVoos()){
             Voo novo= new Voo();
             novo.copiarVoo(v);
             this.lstVoo.addVoo(novo);
             
         }

    }

    @Override
    public String toString() {
        return "Aeroporto{" + "nome=" + nome + ", localizacao=" + localizacao + ", lstVoo=" + lstVoo + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.nome);
        hash = 11 * hash + Objects.hashCode(this.localizacao);
        hash = 11 * hash + Objects.hashCode(this.lstVoo);
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
        final Aeroporto other = (Aeroporto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.localizacao, other.localizacao)) {
            return false;
        }
        return Objects.equals(this.lstVoo, other.lstVoo);
    }
    
   public void add(Voo v){
       this.lstVoo.addVoo(v);
       System.out.println("Voo adicionado");
   }
   
   public void remover(int numero){
       this.lstVoo.removerVoo(numero);
       System.out.println(" Voo removido");
  
   }

    
   public void listarVoos(){

    for(Voo v : this.lstVoo.getVoos()){

        System.out.println(v);
    }
}   
    public void verificarVoosPrejuizo(){
    for(Voo v : this.lstVoo.getVoos()){

        if(v.abaixoCapacidadeMinima()){

            System.out.println(
            "Voo " + v.getNumero() + " tera prejuizo");

        }
    }
}
    
public void iniciarVoo(int numero){

  for(Voo v : this.lstVoo.getVoos()){
    if(v.getNumero() == numero){
     v.alterarEstado("Voando");

            System.out.println("Voo iniciado");
            return;
        }
    }

    System.out.println("Voo nao encontrado");
}
    
    
  public String getNome(){  
    return this.nome;  
  }
  public String getLocalizacao(){
    return this.localizacao;  
  }
   
  public void setNome(String nome){
      this.nome=nome;
      
  }
  public void setLocalizacao(String localizacao){
     this.localizacao=localizacao; 
  }

    public GerenciadorVoo getLstVoo() {
        return this.lstVoo;
    }
  
}
