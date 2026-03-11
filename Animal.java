/*especie	String /raca	String/idade	int/peso	double*/
package classe;
import java.util.Scanner;
public class Animal {
    private String especie;
    private String raca;
    private int idade;
    private double peso;
    private String som;

    public Animal() {
    }

    public Animal(String especie, String raca, int idade, double peso, String som) {
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.som= som;
    }
    
    
    public void copiar( Animal outro){
        this.especie= outro.especie;
        this.raca=outro.raca;
        this.idade=outro.idade;
        this.peso=outro.peso;
        this.som= outro.som;

    }
    public void preencher(){
        Scanner ler= new Scanner (System.in);
        
        System.out.println("     PREENCHENDO DADOS     ");
        System.out.println( " Especie de animal:");
        this.especie=ler.nextLine();
        
        System.out.println("  Raça do animal:");
        this.raca=ler.nextLine();
        
        System.out.println( " Insira idade:");
        this.idade=ler.nextInt();
        System.out.println(" Digite o peso do animal:");
        this.peso=ler.nextDouble();
        ler.nextLine();
        System.out.println("Descreva da melhor forma o som  do animal:");
        this.som=ler.nextLine();
        
    }

public void imprimir(){

    System.out.println(
        this.raca + " - " + this.especie +
        " | Idade: " + this.idade + " anos" +
        " | Peso: " + this.peso + "kg" +
        " | Idade humana: " + calculaIdadeHumana() + " anos"
    );

}

public int calculaIdadeHumana(){
    return this.idade *7;
    
}

public void fazSom(){
    
    System.out.println(this.raca +" faz o som:"+this.som);
}

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }
    public String getSom(){
        return som;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
   
    public void setSom(String som){
        this.som = som;
    }
}

        
        
    


    
    
    
    

