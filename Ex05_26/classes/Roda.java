
package classes;

import java.util.Objects;

public class Roda {
    private double raio;
    private String  material;
    private String  cor;

    public Roda() {
        this.raio=0.0;
        this.material=" ";
        this.cor="";
    }

    public Roda(double raio, String material, String cor) {
        this.raio = raio;
        this.material = material;
        this.cor = cor;
    }
   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.raio) ^ (Double.doubleToLongBits(this.raio) >>> 32));
        hash = 61 * hash + Objects.hashCode(this.material);
        hash = 61 * hash + Objects.hashCode(this.cor);
        return hash;
    }

    @Override
    public String toString() {
        return "Roda{" + "Raio:" + this.raio + ", Material:" +this.material + ", Cor:" + this.cor + '}';
    }
    public void imprimir(){  
        System.out.println(this);  
    }
    
    public void copiar( Roda outro){
        
      this.raio=outro.getRaio();
      this.material=outro.getMaterial();
      this.cor=outro.getCor();
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
        final Roda other = (Roda) obj;
        if (Double.doubleToLongBits(this.raio) != Double.doubleToLongBits(other.raio)) {
            return false;
        }
        if (!Objects.equals(this.material, other.material)) {
            return false;
        }
        return Objects.equals(this.cor, other.cor);
    }
    

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }   
    
}
