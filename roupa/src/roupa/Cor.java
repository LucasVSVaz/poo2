
package roupa;

public class Cor {
    
//    private ArrayList<Cor> cores = new ArrayList<>();
    private String cor;
    private Integer quantidade;

    public Cor() {
    }

    public Cor(String cor, Integer quantidade) {
        this.cor = cor;
        this.quantidade = quantidade;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    } 
}
