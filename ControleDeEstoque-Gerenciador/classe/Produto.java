
package classe;
import java.util.Objects;


public class Produto {
    private String codigo;
    private String nome;
    private int qtd;

    public Produto() {
    }

    public Produto(String codigo, String nome, int qtd) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtd = qtd;
    }
    
    
    
    @Override
    public String  toString(){
        
        return " Codigo:"+ this.codigo
                +" Nome do Produto:"+ this.nome
                +" Quantidade:" + this.qtd;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.codigo);
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + this.qtd;
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
        final Produto other = (Produto) obj;
        if (this.qtd != other.qtd) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
    
    public void copiar(Produto outro){
        this.codigo=outro.codigo;
        this.nome=outro.nome;
        this.qtd=outro.qtd;
        
    }
    
    
    public String getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public int getQtd(){
        return qtd;
    }
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setQtd( int qtd){
        this.qtd=qtd;
    }
}
