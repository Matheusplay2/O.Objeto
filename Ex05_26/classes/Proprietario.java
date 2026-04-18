
package classes;

import java.util.Objects;


public class Proprietario {
    private String nome;
    private String email;
    private String cpf; 
    private gCarro carro;

    public Proprietario() {
        this.nome="";
        this.cpf="";
        this.email="";
        this.carro= new gCarro();
        
    }

    public Proprietario(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.carro=new gCarro();
    }
    public void imprimir(){
        System.out.println(this); 
    }
    public Proprietario(Proprietario outro){
        this.nome=outro.getNome();
        this.cpf=outro.getCpf();
        this.email=outro.getEmail();
        this.carro=new gCarro(outro.getCarro().getLstCarro());
        
        
        
    }
 public void copiar(Proprietario outro){
      this.nome = outro.getNome();
    this.email = outro.getEmail();
    this.cpf = outro.getCpf();

    this.carro = new gCarro(); 

    for(Carro c : outro.getCarro().getLstCarro()){
        Carro novo = new Carro();
        novo.copiar(c);
        this.carro.addCarro(novo);
    }
}
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.email);
        hash = 67 * hash + Objects.hashCode(this.cpf);
        hash = 67 * hash + Objects.hashCode(this.carro);
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
        final Proprietario other = (Proprietario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.carro, other.carro);
    }
    
    

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public gCarro getCarro() {
        return this.carro ;
    }

    public void setCarro(gCarro carro) {
        this.carro = carro;
    }
 
      
}
