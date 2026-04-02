
package classes;
import java.util.Objects;


public class Triangulo {
    
    Ponto p1;
    Ponto p2;
    Ponto p3;

    public Triangulo() {
    }

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    

    
    public boolean isColineares() {
        double area = (p1.getX() * (p2.getY() - p3.getY()) +
                       p2.getX() * (p3.getY()- p1.getY()) +
                       p3.getX() * (p1.getY() - p2.getY())) / 2.0;
        return area == 0;
    }
    
    public double areaTriangulo() {
        double area = (p1.getX() * (p2.getY() - p3.getY()) +
                       p2.getX()* (p3.getY()- p1.getY()) +
                       p3.getX() * (p1.getY()- p2.getY())) / 2.0;

        return Math.abs(area);
    }

    public double perimetro() {
        double a = p1.distancia(p2);
        double b = p2.distancia(p3);
        double c = p3.distancia(p1);

        return a + b + c;
    }
        
    public String tipo() {
        double a = p1.distancia(p2);
        double b = p2.distancia(p3);
        double c = p3.distancia(p1);

        if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || a == c || b == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.p1);
        hash = 37 * hash + Objects.hashCode(this.p2);
        hash = 37 * hash + Objects.hashCode(this.p3);
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
        final Triangulo other = (Triangulo) obj;
        if (!Objects.equals(this.p1, other.p1)) {
            return false;
        }
        if (!Objects.equals(this.p2, other.p2)) {
            return false;
        }
        return Objects.equals(this.p3, other.p3);
    }

    
    public void imprimir (){
        
        System.out.println("Ponto 1:"+ this.p1);
        System.out.println("Ponto 2:"+ this.p2);
        System.out.println("Ponto 3:"+ this.p3);
    }

    @Override
    public String toString() {
        return "Triangulo{" + "p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + '}';
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
 
    
}
