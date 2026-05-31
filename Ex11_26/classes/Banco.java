
package classes;

import java.util.ArrayList;
import java.util.List;


public class Banco {
    private String nomeBanco;
    private List<Conta>lstContas;
    private List<Transacao> lstTransacao;

    public Banco() {
        this.nomeBanco="";
        this.lstContas= new ArrayList<>();
        this.lstTransacao=new ArrayList<>();
    }

    public void addContas(Conta c){
        this.lstContas.add(c);
        System.out.println("Conta adicionada.");
    }
    
    public boolean RemoverConta(String numeroDaConta){
        for (Conta c : lstContas) {
            if (c.getNumeroDaConta().equals(numeroDaConta)){
            lstContas.remove(c);
            return true;
            
            }
        }
        
            return false;
 
}
    public Conta pesquisarConta(String numeroDaConta){
        
        for(Conta c: lstContas){
            if(c.getNumeroDaConta().equals(numeroDaConta)){
                System.out.println("Conta Encontrada");  
            return c;
            }
        }

        return null;  
    }
    
    public void ListarConta(){
        for(Conta c: lstContas){
            System.out.println("--------------------------------------------");
            System.out.println(c.toString());
            System.out.println("---------------------------------------------");
        }
        
    }
   public Conta contaMaiorSaldo(){
    Conta maior = lstContas.get(0);

    for(Conta c : lstContas){
        if(c.getSaldo() > maior.getSaldo()){
            maior = c;
        }
    }

    return maior;
}
   
   public Conta contaMenorSaldo(){
    if(lstContas.isEmpty()){
        return null;
    }
    Conta menor = lstContas.get(0);

    for(Conta c : lstContas){

        if(c.getSaldo() < menor.getSaldo()){
            menor = c;
        }
    }

    return menor;
}
   public void totalDevedores(){

    int qtdDevedores = 0;
    double somaDividas = 0;

    for(Conta c : lstContas){

        if(c.getSaldo() < 0){

            qtdDevedores++;
            somaDividas += c.getSaldo();
        }
    }

    System.out.println("Quantidade de devedores: " + qtdDevedores);
    System.out.println("Total das dívidas: R$ " + somaDividas);
}
 public void totalCredores(){
    int qtdCredores = 0;
    double somaCreditos = 0;

    for(Conta c : lstContas){

        if(c.getSaldo() > 0){

            qtdCredores++;
            somaCreditos += c.getSaldo();
        }
    }

    System.out.println("Quantidade de credores: " + qtdCredores);
    System.out.println("Total em saldo positivo: R$ " + somaCreditos);
}
   
  
    
    public void addTransacao(Transacao t){
        this.lstTransacao.add(t);
        System.out.println("Transacao adicionada");
        
    }
    public boolean removerTransacao(String identificador){
        for(Transacao t: lstTransacao){
           if(t.getIdentificador().equals(identificador)) {
               System.out.println("Transacao removida"); 
               lstTransacao.remove(t);
               return true;
           }
        }
        
        return false;
    }
    
    public Transacao pesquisarTransacao(String identificador){ 
        for(Transacao t: lstTransacao){
            if(t.getIdentificador().equals(identificador)){
                System.out.println("Transacao encontrada"); 
                return t;
            }
        }
        
        return null;
    }
    
    public void ListarTransacoes(){
       for(Transacao t: lstTransacao) {
           System.out.println("--------------------------------------------------");
           System.out.println(t.toString());
           System.out.println("--------------------------------------------------");
       }

    }

    
    public String getNomeBanco() {
        return nomeBanco;
    }

    public List<Conta> getLstContas() {
        return lstContas;
    }

    public List<Transacao> getLstTransacao() {
        return lstTransacao;
    }

}
