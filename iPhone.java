
package app;


public class iPhone extends ProdutoAcabado {
    
    private String ModeloCelular;
    private int AnoLancamento;
    private float Valor;
    
    public iPhone(String ModeloCelular , int AnoLancamento, float Valor) {
      this.ModeloCelular = ModeloCelular;
      this.AnoLancamento = AnoLancamento;
      this.Valor = Valor;
    
    }

    public String getModeloCelular() {
        return ModeloCelular;
    }

    public void setModeloCelular(String ModeloCelular) {
        this.ModeloCelular = ModeloCelular;
    }

    public int getAnoLancamento() {
        return AnoLancamento;
    }

    public void setAnoLancamento(int AnoLancamento) {
        this.AnoLancamento = AnoLancamento;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    
    
}
