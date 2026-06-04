
package classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author matheus henrique
 */
public class Professor extends Pessoa{
    
    private String cpf;

    public Professor() {
        super();
        this.cpf="";
    }

    public Professor( String nome, char sexo, int idd, String cpf) {
        super(nome, sexo, idd);
        this.cpf = cpf;
    }
    
    
 
    @Override
    public String toString (){
        return "Professor{"+super.toString()+ "||Cpf:"+ this.cpf+"}";
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.cpf);
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
        final Professor other = (Professor) obj;
        return Objects.equals(this.cpf, other.cpf);
    }
    
    @Override
    public void preencher(){
        System.out.println("   /Preenchendo Professor/");
        super.preencher();
        Scanner ler= new Scanner(System.in);
        System.out.print("Digite cpf:");
        this.cpf=ler.nextLine();
    }
    
    @Override
    public void imprimir(){
       System.out.println(this);   
    }
    
    public void copiar(Professor outro){
        super.copiar(outro);
        this.cpf=outro.getCpf();
        
        
        
    }
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
}
