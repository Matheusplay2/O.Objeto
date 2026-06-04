
package classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author matheus henrique
 */
public class Pessoa {
    private String nome;
    private char sexo;
    private int idd;

    public Pessoa() {
        this.nome="";
        this.sexo='m';
        this.idd=0;
    }
    
    public Pessoa(String nome, char sexo, int idd){
        this.nome=nome;
        this.sexo=sexo;
        this.idd=idd;
    }
    
    @Override
    public String toString (){
        return "Nome:"+this.nome+
                ",Sexo:"+this.sexo+
                ",Idade:"+ this.idd+"";
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + this.sexo;
        hash = 79 * hash + this.idd;
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
        final Pessoa other = (Pessoa) obj;
        if (this.sexo != other.sexo) {
            return false;
        }
        if (this.idd != other.idd) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
    
    public void copiar(Pessoa outro){
        this.nome=outro.getNome();
        this.sexo=outro.getSexo();
        this.idd=outro.getIdd();
        
    }
    
    public void imprimir(){
        System.out.println(this);
    }
    
    public void preencher(){
        Scanner ler= new Scanner(System.in);
        System.out.println("Preenchendo dados");
        System.out.print("Digite seu nome:");
        this.nome= ler.nextLine();
        System.out.print("Seu sexo(m /f):");
        this.sexo=ler.next().charAt(idd);
        System.out.print("Sua idade:");
        this.idd=ler.nextInt();
    }
    
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
       this.nome=nome;         
    }
    public char getSexo(){
       return this.sexo; 
   }
    public void setSexo(char sexo){
        this.sexo=sexo;;
    }
    public int getIdd(){
        return this.idd;
    }
    public void setIdd(int idd){
        this.idd=idd;
    }
}
