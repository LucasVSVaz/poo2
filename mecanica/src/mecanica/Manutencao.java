/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mecanica;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Manutencao {
    private ArrayList<Peca> pecas = new ArrayList<>();
    private Veiculo veiculo = new Veiculo();

    public ArrayList<Peca> getPecas() {
        return pecas;
    }

    public void setPecas(ArrayList<Peca> pecas) {
        this.pecas = pecas;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public void addPeca(Peca peca) {
       pecas.add(peca);
    }

    Peca getPecas(int pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
