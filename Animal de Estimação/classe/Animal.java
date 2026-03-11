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
        this.especie = "";
        this.raca = "";
        this.idade = 0;
        this.peso = 0.0;
        this.som= "";
    }
    
    
    public void copiar( Animal outro){
        this.especie= outro.getEspecie();
        this.raca=outro.getRaca();
        this.idade=outro.getIdade();
        this.peso=outro.getPeso();
        this.som= outro.getSom();

    }
    public void preencher(){
        Scanner ler= new Scanner (System.in);
        
        System.out.println("     PREENCHENDO DADOS     ");
        System.out.println( " Especie de animal:");
        this.setEspecie(ler.nextLine());
        
        System.out.println("  Raça do animal:");
        this.setRaca(ler.nextLine());
        
        System.out.println( " Insira idade:");
        this.setIdade(ler.nextInt());
        System.out.println(" Digite o peso do animal:");
        this.setPeso(ler.nextDouble());
        ler.nextLine();
        System.out.println("Descreva da melhor forma o som  do animal:");
        this.setSom(ler.nextLine());
        
    }

public void imprimir(){

    System.out.println(
        this.raca + " - " + this.getEspecie() +
        " | Idade: " + this.getIdade() + " anos" +
        " | Peso: " + this.getPeso() + "kg" +
        " | Idade humana: " + calculaIdadeHumana() + " anos"
    );

}

public int calculaIdadeHumana(){
    return this.getIdade() *7;
    
}

public void fazSom(){
    
    System.out.println(this.getRaca() +" faz o som:"+this.getSom());
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

        
        
    


    
    
    
    

