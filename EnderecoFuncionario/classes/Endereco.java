
package classes;

import java.util.Objects;

public class Endereco {
    private String rua;
    private int num;
    private String bairro;
    private String cdd;

    public Endereco() {
        this.rua="";
        this.num=0;
        this.bairro="";
        this.cdd="";
    }

    public Endereco(String rua, int num, String bairro, String cdd) {
        this.rua = rua;
        this.num = num;
        this.bairro = bairro;
        this.cdd = cdd;
    }

    @Override
    public String toString() {
        return "Endereco{" + "Rua:" + this.rua + ", Numero:" + this.num + ", Bairro:" + this.bairro + ", Cidade:" + this.cdd + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.rua);
        hash = 43 * hash + this.num;
        hash = 43 * hash + Objects.hashCode(this.bairro);
        hash = 43 * hash + Objects.hashCode(this.cdd);
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
        final Endereco other = (Endereco) obj;
        if (this.num != other.num) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        return Objects.equals(this.cdd, other.cdd);
    }

    public void copiar(Endereco outro){
        this.rua=outro.getRua();
        this.num=outro.getNum();
        this.bairro=outro.getBairro();
        this.cdd=outro.getCdd();

    }
    
    
    
    public String getRua() {
        return this.rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNum() {
        return this.num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getBairro() {
        return this.bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCdd() {
        return cdd;
    }
    public void setCdd(String cdd) {
        this.cdd = cdd;
    }

    
}
