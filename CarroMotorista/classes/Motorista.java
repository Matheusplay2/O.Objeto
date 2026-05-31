
package classes;


public class Motorista {
    private String nome;
    private Carro carro;

  
    public Motorista (){
            this.nome=" ";
            this.carro=null;
        }

    public Motorista(String nome, Carro carro) {
        this.nome = nome;
        this.carro = carro;
    }
    public void copiar(Motorista outro){
        this.nome=outro.getNome();
      
        if (outro.getCarro()!= null){
            this.carro=new Carro();
            this.carro.copiar(outro.getCarro());
        }else{
            this.carro=null;
        }
    }

    @Override
    public String toString() {
        return "Motorista{" + "Nome=" + this.nome +  "}";
    }
    public int funcaoHash(){
        int hash=6;
        hash=21*hash*this.nome.hashCode();
        hash=21 *hash* this.carro.funcaoHash();
        return hash;
    }
   public void motorita(){
       System.out.println(" O motorista  "+"("+this.nome+ " )"+" Esta dirigindo ("+carro.getModelo()+")");
   }
   public void dirigir(){
       
       if(this.carro!= null){
           
         System.out.println(" O motorista  "+"("+this.nome+ " )"+" Esta dirigindo ("+carro.getModelo()+")");
         this.carro.buzinar();
         this.carro.abrirPorta();
       }else {
           System.out.println("Motorista nao esta em um  carro");
       
      }
    
   }

    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public Carro getCarro(){
        return this.carro;
    }
    public void setCarro(Carro carro){
        this.carro=carro;
    }

}
