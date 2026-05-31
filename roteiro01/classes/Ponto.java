package classes;


public class Ponto {
    private double x;
    private double y;

    
    public Ponto(){
       this.x=0.0;
       this.y=0.0;
        
    }
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void imprimir(){
        System.out.println("X:"+this.x);
        System.out.println("Y:"+this.y);
    }
    public double distancia(Ponto outro){
       
        double deltaX=outro.getX()-this.x;
        double deltaY=outro.getY()-this.y;
       
        deltaX=deltaX * deltaX;
        deltaY=deltaY * deltaY;
        double dist= Math.sqrt(deltaX+ deltaY);
                
        return dist;
        
    }

    @Override
    public String toString() {
        return "Ponto{" + "x=" + x + ", y=" + y + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
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
        final Ponto other = (Ponto) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        return Double.doubleToLongBits(this.y) == Double.doubleToLongBits(other.y);
    }

   
    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    
}