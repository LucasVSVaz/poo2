
package roupa;


public class Roupa {

    private Cor cor;
    private String preco;
    private String tecido;
    
    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }
    
    private Integer manequim;
    
    public Roupa() {
        
    }
    
    public void dobrar() {
        System.out.println("Roupa dobrada.");
    }
    
    public void lavar() {
        System.out.println("Roupa Lavada.");
    }



    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }



    public Integer getManequim() {
        return manequim;
    }

    public void setManequim(Integer manequim) {
        this.manequim = manequim;
    }

    @Override
    public String toString() {
        return " Cor=" + cor.getCor() + ", Preco=" + preco + ", Tecido=" + tecido + ", Manequim=" + manequim ;
    }   
}
