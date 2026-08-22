
package com.mycompany.despesa.model.entidade;

import java.util.Objects;


public class Gasto {
    public int id;
    public String data;
    public double valor;
    public String descricao;

    public Gasto() {
        this.id=0;
        this.data="";
        this.valor=0.0;
        this.descricao="";
        
    }
    
    

    public Gasto(int id, String data, double valor, String descricao) {
        this.id = id;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.data);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.descricao);
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
        final Gasto other = (Gasto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return Objects.equals(this.descricao, other.descricao);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gasto{");
        sb.append("id=").append(id);
        sb.append(", data=").append(data);
        sb.append(", valor=").append(valor);
        sb.append(", descricao=").append(descricao);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    public int getId(){
        return  this.id;
    }
    
    public String getData(){
        return this.data;
    }
    public double getValor(){
        return this.valor;
    }
    public String getDescricao(){
        return this.descricao;
    }
    
    public void  setId(int id){
        this.id=id;
     }
    public void setData(String data){
         this.data=data;
    }
    public void setValor(double valor){
        this.valor=valor;
    }
    
    public void setDescricao(String descricao){
        this.descricao=descricao;
        
    }
    
}
