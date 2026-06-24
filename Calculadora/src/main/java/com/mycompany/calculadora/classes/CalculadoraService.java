
package com.mycompany.calculadora.classes;


public class CalculadoraService {
    private Calculo calculo;
 
    public CalculadoraService() {
        this.calculo = new Calculo();
    }
 
    
    public void setNumeroAtual(double numero) {
        calculo.setNumeroAtual(numero);
    }
 
    
    public void definirOperador(String op) {
        calculo.setNumeroAnterior(calculo.getNumeroAtual());
        calculo.setOperador(op);
    }
 
    
    public double calcularResultado() {
        double a = calculo.getNumeroAnterior();
        double b = calculo.getNumeroAtual();
 
        return switch (calculo.getOperador()) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "×" -> a * b;
            case "÷" -> b != 0 ? a / b : Double.NaN;
            default  -> b;
        };
    }
 
    
    public void resetar() {
        this.calculo = new Calculo();
    }
}
    

