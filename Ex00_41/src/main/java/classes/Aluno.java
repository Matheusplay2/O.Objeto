
package classes;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author matheus henrique
 */
public class Aluno extends Pessoa {
    private String matricula;
    private int ano;

    public Aluno() {
        super();
        this.matricula="";
        this.ano=0;
    }
   
    
    public Aluno(String matricula, int ano, String nome, char sexo, int idd){
        super(nome, sexo, idd);
        this.matricula=matricula;
        this.ano=ano;
    }
    
    @Override
    public String toString(){
        return "Aluno{"+super.toString()+"|| Matricula:"+ this.matricula+
                ",Ano de Ingressao:"+this.ano;
        
    }
    
    @Override
    public void preencher(){
        
        super.preencher();
        Scanner ler = new Scanner(System.in);
        System.out.print("Numero da Matricula:");
        this.matricula= ler.nextLine();
        System.out.print("Ano de Ingressao:");
        this.ano=ler.nextInt();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.matricula);
        hash = 37 * hash + this.ano;
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
        final Aluno other = (Aluno) obj;
        if (this.ano != other.ano) {
            return false;
        }
        return Objects.equals(this.matricula, other.matricula);
    }
    
    public void copiar(Aluno outro){
        super.copiar(outro);
        this.matricula=outro.getMatricula();
        this.ano=outro.getAno();
        
    }
    
    
    
    public String getMatricula(){
       return this.matricula; 
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    
    public int getAno (){
        return this.ano;
    }
    public void setNome(int ano){
        this.ano= ano;
    }
    
    
    
}
