/*nomeEmpresa - String; precoAcao - double; qtdAcoes - double; variacaoDiaria - double.*/
package classe;
import java.util.Scanner;

public class Ativo {
    private String nome;
    private double precoAcao;
    private int  qtdAcoes;
    private double variacaoDiaria;

    public Ativo() {
    }

    public Ativo(String nome, double precoAcao, int qtdAcoes, double variacaoDiaria) {
        this.nome = "";
        this.precoAcao = 0.0;
        this.qtdAcoes = 0;
        this.variacaoDiaria = 0.0;
    }
    
    
    
    public void copia ( Ativo outro){
        this.nome=outro.getNome();
        this.precoAcao= outro.getPrecoAcao();
        this.qtdAcoes=outro.getQtdAcoes();
        this.variacaoDiaria=outro.getVariacaoDiaria();
        
    }
    public void preencher(){
        System.out.println("   *** PREENCHENDO ***  ");
        Scanner ler=new Scanner(System.in);
        System.out.print("Digite o nome da Empresa:");
        this.setNome(ler.nextLine());
        System.out.print("Preço da Ação:");
        this.setPrecoAcao(ler.nextDouble());
        System.out.print(" Quantidade de ações:");
        this.setQtdAcoes(ler.nextInt());
        System.out.print(" Variação diaria:");
        this.setVariacaoDiaria(ler.nextDouble());
    }
    public void imprimir(){
        
        System.out.println("Nome da empresa:"+ this.getNome()+ "Preço da ação:"+
                this.getPrecoAcao()+" Quantidade de ações:"+this.getQtdAcoes()
                + " Variação diaria:"+ this.getVariacaoDiaria());
    }
    public double calcularPosiçaoDoAtivo(){
        
        return (double)  (this.getPrecoAcao()*this.getQtdAcoes());
    }
    
      public void exibirResumo(){      
          
         System.out.println(this.getNome() + "|"+ " Preço: R$"+this.getPrecoAcao()+"|"+" Qtd: "+
                 this.getQtdAcoes()+ " |"+ " Variação: "+this.getVariacaoDiaria()+"%" + "| "+
                 "Posição: R$ "+ this.calcularPosiçaoDoAtivo());
          
      }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoAcao() {
        return precoAcao;
    }

    public void setPrecoAcao(double precoAcao) {
        this.precoAcao = precoAcao;
    }

    public int getQtdAcoes() {
        return qtdAcoes;
    }

    public void setQtdAcoes(int qtdAcoes) {
        this.qtdAcoes = qtdAcoes;
    }

    public double getVariacaoDiaria() {
        return variacaoDiaria;
    }

    public void setVariacaoDiaria(double variacaoDiaria) {
        this.variacaoDiaria = variacaoDiaria;
    }
    
    
}
