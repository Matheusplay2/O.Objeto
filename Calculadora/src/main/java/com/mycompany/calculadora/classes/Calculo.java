
package com.mycompany.calculadora.classes;

import java.util.Objects;


public class Calculo {
    
    
    private double numeroAnterior;
    private double numeroAtual;
    private String operador;

    public Calculo() {
        this.numeroAnterior=0.0;
        this.numeroAtual=0.0;
        this.operador="";
    }

    public Calculo(double numeroAnterior, double numeroAtual, String operador) {
        this.numeroAnterior = numeroAnterior;
        this.numeroAtual = numeroAtual;
        this.operador = operador;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.numeroAnterior) ^ (Double.doubleToLongBits(this.numeroAnterior) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.numeroAtual) ^ (Double.doubleToLongBits(this.numeroAtual) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.operador);
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
        final Calculo other = (Calculo) obj;
        if (Double.doubleToLongBits(this.numeroAnterior) != Double.doubleToLongBits(other.numeroAnterior)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numeroAtual) != Double.doubleToLongBits(other.numeroAtual)) {
            return false;
        }
        return Objects.equals(this.operador, other.operador);
    }

    public double getNumeroAnterior() {
        return  this.numeroAnterior;
    }

    public void setNumeroAnterior(double numeroAnterior) {
        this.numeroAnterior = numeroAnterior;
    }

    public double getNumeroAtual() {
        return this.numeroAtual;
    }

    public void setNumeroAtual(double numeroAtual) {
        this.numeroAtual = numeroAtual;
    }

    public String getOperador() {
        return this.operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
  
}
