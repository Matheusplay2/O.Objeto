
package classes;

import java.util.Objects;

public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private gRoda rodas;

    public Carro() {
        this.fabricante="";
        this.modelo="";
        this.cor="";
        this.rodas=new gRoda();
        
    }

    public Carro(String fabricante, String modelo, String cor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.rodas=new gRoda();
       
    }
    
    public void imprimir(){
        System.out.println(this);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.fabricante);
        hash = 89 * hash + Objects.hashCode(this.modelo);
        hash = 89 * hash + Objects.hashCode(this.cor);
       
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
        final Carro other = (Carro) obj;
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.cor, other.cor);
    }

    
    @Override
    public String toString() {
        return "Carro{" + "fabricante=" + fabricante + ", modelo=" + modelo + ", cor=" + cor + '}';
    }
 
    
   
        
    public void copiar(Carro outro){
        this.fabricante=outro.getFabricante();
        this.modelo=outro.getModelo();
        this.cor=outro.getCor();
        
        
        for (Roda r: outro.rodas.getLstRoda()){
            Roda nova= new Roda();
            nova.copiar(r);
           this.rodas.addRoda(nova);
        }
    }
    

    public String getFabricante() {
        return this.fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public gRoda getRodas() {
        return this.rodas;
    }

    public void setRodas(gRoda rodas) {
        this.rodas = rodas;
    }
    
    
}
