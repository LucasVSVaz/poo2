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
public class Veiculo {
    private String placa, ano, marca,modelo,chassi,combustivel;
    private Cliente cliente;

    public Veiculo(String placa, String ano, String marca, String modelo, String chassi, String combustivel, Cliente cliente) {
        this.placa = placa;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.chassi = chassi;
        this.combustivel = combustivel;
        this.cliente = cliente;
    }

    public Veiculo() {
    
    }
   
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Placa" + placa + ", Marca " + marca + ", Modelo " + modelo + ", Cliente " + cliente.toString();
    }
    
}
