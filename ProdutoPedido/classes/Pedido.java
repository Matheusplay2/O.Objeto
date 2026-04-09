
package classes;

public class Pedido {
    private String num;
    private String data;
    private double qtd;
    private Produto produto;
   

    public Pedido() {
        this.num=" ";
        this.data=" ";
        this.qtd=0.0;
        this.produto=new Produto();
   
    }

    
    public Pedido(String num, String data, double qtd,Produto produto){
        this.num=num;
        this.data=data;
        this.qtd=qtd;
        this.produto=produto;
       
    }

    @Override
    public String toString() {
        return "Pedido{" + "Numero:" + num + ", Data:" + data + ", Qtd:" + this.qtd +this.produto+'}';
    }
    
    
    
    public int hashCode(){
        
        int hash=7;
        
        hash= 20* hash *this.num.hashCode();
        hash= 20 * hash * this.data.hashCode();
        hash=(int) (20* hash *this.qtd);
        hash=20*hash*this.produto.funcaoHash();
        
        return hash;
    }
    
    public boolean equals(Object obj ){
        if (obj == null)
            return false;
       
        Pedido outro=(Pedido )obj;
        return this.num.equals(outro.num)&&
                this.data.equals(outro.data)&&
                this.qtd==outro.qtd &&
                this.produto.equals(outro.produto);
               
    }
         
        public void copiar(Pedido outro){
            this.num=outro.getNum();
            this.data=outro.getData();
            this.qtd=outro.getQtd();
            
            this.produto=new Produto();
            this.produto.copiar(outro.getProduto());
         
        }
        public double calcularTotal(){
          
           return this.qtd* this.produto.getPreco();
            
        }
        
    public String getNum() {
        return this.num;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public String getData() {
        return this.data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public double getQtd() {
        return this.qtd;
    }
    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    

}
