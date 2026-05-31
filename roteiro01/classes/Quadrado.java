package classes;
import java.util.Objects;

public class Quadrado {
   private Ponto p1;
   private Ponto p2;
   private Ponto p3;
   private Ponto p4;

    public Quadrado() {
    }

    public Quadrado(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    @Override
    public String toString() {
        return "Quadrado{" + "p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + '}';
    }
    public   double areaQuadrado(){
       
        double lado = p1.distancia(p2);
        return lado * lado;
    }
   
    public double perimetro(){
       double lado=p1.distancia(p2);
        return lado * 4;
    }
   
    
   public void imprimir (){
       System.out.println("Pontos do quadrado:");
       System.out.println("P1:"+this.p1);
       System.out.println("P2:" +this.p2);
       System.out.println("P3:"+ this.p3);
       System.out.println("P4:"+this.p4);

   }
   public boolean isQuadrado() {

        double l1 = p1.distancia(p2);
        double l2 = p2.distancia(p3);
        double l3 = p3.distancia(p4);
        double l4 = p4.distancia(p1);

        boolean ladosIguais =
            (Math.abs(l1 - l2) < 0.0001) &&
            (Math.abs(l2 - l3) < 0.0001) &&
            (Math.abs(l3 - l4) < 0.0001);

     
        double d = p1.distancia(p3);

        boolean anguloReto =
            Math.abs((l1 * l1 + l2 * l2) - (d * d)) < 0.0001;

        return ladosIguais && anguloReto;
    }
    public String tipo() {
       if (isQuadrado()){
        return "Quadrado";
       }else{
        return " Nao e Quadrado"  ; 
       }
     }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.p1);
        hash = 53 * hash + Objects.hashCode(this.p2);
        hash = 53 * hash + Objects.hashCode(this.p3);
        hash = 53 * hash + Objects.hashCode(this.p4);
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
        final Quadrado other = (Quadrado) obj;
        if (!Objects.equals(this.p1, other.p1)) {
            return false;
        }
        if (!Objects.equals(this.p2, other.p2)) {
            return false;
        }
        if (!Objects.equals(this.p3, other.p3)) {
            return false;
        }
        return Objects.equals(this.p4, other.p4);
    }



    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }

    public Ponto getP3() {
        return p3;
    }

    public void setP3(Ponto p3) {
        this.p3 = p3;
    }

    public Ponto getP4() {
        return p4;
    }

    public void setP4(Ponto p4) {
        this.p4 = p4;
    }
   
}
