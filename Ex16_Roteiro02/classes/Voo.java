
package classes;

import gerenciadores.GerenciadorEscala;
import gerenciadores.GerenciadorPassageiro;
import java.util.Objects;


public class Voo {
    private int numero;
    private String destino;
    private GerenciadorPassageiro gerenciadorpassageiro;
    private GerenciadorEscala gerenciadorescala;
    private String estado;
    private int capacidadeMaxima;
    
public Voo(){
    this.numero = 0;
    this.destino= "";
    this.gerenciadorpassageiro = new GerenciadorPassageiro();
    this.gerenciadorescala= new GerenciadorEscala();
    this.estado="";
    this.capacidadeMaxima=0;
}
public Voo(int numero,String destino, String estado, int capacidadeMaxima){
    this.numero= numero;
    this.destino= destino;
    this.estado=estado;
    this.capacidadeMaxima=capacidadeMaxima;
    this.gerenciadorpassageiro= new GerenciadorPassageiro();
    this.gerenciadorescala= new GerenciadorEscala();
}

   
public Voo(Voo outro){
    this.numero= outro.getNumero();
    this.destino= outro.getDestino();
    this.estado=outro.getEstado();
    this.gerenciadorpassageiro= new GerenciadorPassageiro(outro.getGerenciadorpassageiro());
    this.gerenciadorescala= new GerenciadorEscala(outro.getGerenciadorescala());
   
}
    public void add(Passageiro passageiros){
        this.gerenciadorpassageiro.add(passageiros);
        
    }
    
    public boolean removerPassageiro(String cpf){
           return gerenciadorpassageiro.remove(cpf);

}     
     public void removerEscala(String escala){
           gerenciadorescala.removerEscala(escala);

}
    public void alterarEstado(String novoEstado){
    this.estado = novoEstado;
    System.out.println("Estado do voo alterado para: "
            + this.estado);

}   
    public void concluirVoo(){
    this.estado = "Concluido";

    for(Passageiro p :gerenciadorpassageiro.getLstPassageiros()){

        p.getSistema().adicionarPontos(100);

    }
    System.out.println( "Voo concluido com sucesso");

}
      
  public boolean abaixoCapacidadeMinima(){
    return gerenciadorpassageiro.getLstPassageiros().size() <5;

}

  
  public boolean capacidadeMaximaAtingida(){
         return this.gerenciadorpassageiro.getLstPassageiros().size() <=this.capacidadeMaxima;

}
     public void verificarCapacidade(){
      if(abaixoCapacidadeMinima()){
      System.out.println("Voo abaixo da capacidade minima"); 
      }else{
          System.out.println("Voo dentro da capacidade permitida");
    }
}
    
 public void adicionarEscala(String escala){
    gerenciadorescala.add(escala);
     System.out.println("Escala adicionada");

}
 
 
public void copiarVoo(Voo outro){
    this.numero = outro.getNumero();
    this.destino= outro.getDestino();
    this.gerenciadorpassageiro= new GerenciadorPassageiro(outro.getGerenciadorpassageiro());
    this.gerenciadorescala= new GerenciadorEscala(outro.getGerenciadorescala());
    this.estado=outro.getEstado();
    this.capacidadeMaxima=outro.getCapacidadeMaxima();
}
@Override
public String toString(){
    return "Voo{"+"Numero do voo:"+this.numero+",Destino:"+
            this.destino+ " ,Estado do voo:"+ this.estado+ " ,Capacidade Maxima:"+ this.capacidadeMaxima+"}";      
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.numero;
        hash = 29 * hash + Objects.hashCode(this.destino);
        hash = 29 * hash + Objects.hashCode(this.gerenciadorpassageiro);
        hash = 29 * hash + Objects.hashCode(this.gerenciadorescala);
        hash = 29 * hash + Objects.hashCode(this.estado);
        hash = 29 * hash + this.capacidadeMaxima;
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
        final Voo other = (Voo) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.capacidadeMaxima != other.capacidadeMaxima) {
            return false;
        }
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.gerenciadorpassageiro, other.gerenciadorpassageiro)) {
            return false;
        }
        return Objects.equals(this.gerenciadorescala, other.gerenciadorescala);
    }

    

   

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public GerenciadorPassageiro getGerenciadorpassageiro() {
        return this.gerenciadorpassageiro;
    }


    public GerenciadorEscala getGerenciadorescala() {
        return this.gerenciadorescala;
    }
   public String getEstado(){
       return this.estado;
   }
   public void setEstado(String estado){
       this.estado=estado;
   }

    public int getCapacidadeMaxima() {
        return this.capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
   
}
