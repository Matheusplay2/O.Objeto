
package classes;


public class Produto {
    private String nome;
    private String categoria;
    private double preco;
 

    public Produto() {
        this.nome="";
        this.categoria=" ";
        this.preco=0.0;
      
       
    }
    
   
    
    public Produto(String nome,String categoria, double preco ){
        this.nome=nome;
        this.categoria=categoria;
        this.preco=preco;
        
       
    }
    @Override
    public String toString(){
       return " Produto{"+" Nome:"+this.nome+" Categoria:"+this.categoria+
               " Preco:R$"+this.preco;
    }
    public int funcaoHash(){
        int hash=7;
        
        hash=20 *hash * this.nome.hashCode();
        hash=20 *hash * this.categoria.hashCode();
        hash=(int) (20 *hash* this.preco);
     
            
       return hash; 
    }
    
    public boolean equals(Object obj){
        if (obj == null)
            return false;
       Produto outro=(Produto)obj;
       return this.nome.equals(outro.nome)&&
               this.categoria.equals(outro.categoria)&&
               this.preco== outro.preco;
       
    }
       
    public void copiar( Produto outro){
        this.nome=outro.getNome();
        this.categoria=outro.getCategoria();
        this.preco=outro.getPreco();
     
    }
    
    
    
    public String getNome(){
        return this.nome;
    }
    public String getCategoria(){
       return this.categoria; 
    }
    public double getPreco(){
       return this.preco; 
    }
   
    public void setNome(String nome){
       this.nome=nome; 
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
           
}
