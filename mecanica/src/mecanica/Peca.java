/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mecanica;

/**
 *
 * @author Lucas
 */
public class Peca {
   private String nome, ano, marca, modelo;

    public Peca(String nome, String ano, String marca, String modelo) {
        this.nome = nome;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }
    public Peca() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Nome " + nome + ", Ano " + ano + ", Marca" + marca + ", Modelo " + modelo;
    }
    
}
