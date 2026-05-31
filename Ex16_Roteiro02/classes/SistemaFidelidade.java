
package classes;

public class SistemaFidelidade {
  
    private int pontos;

    public SistemaFidelidade() {
        this.pontos = 0; 
    }
    
    public SistemaFidelidade(SistemaFidelidade outro) {
        this.pontos = outro.pontos;
    }
    
    public void adicionarPontos(int pontos) {
        if (pontos > 0) {
            this.pontos += pontos;
        }
    }

    
    public int getSaldoPontos() {
        return pontos;
    }

  
    public boolean resgatarPontos(int pontosParaResgate) {
        if (pontosParaResgate <= 0 || pontosParaResgate > this.pontos) {
            return false;
        } else {
            this.pontos -= pontosParaResgate;
            return true;
        }
    }

    public int getPontos() {
        return pontos;
    }
    
}