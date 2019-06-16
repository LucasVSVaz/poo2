
package mecanica;

import java.util.ArrayList;


public class Mecanica {
   private ArrayList<Cliente> clientes = getClientesCadastrados();
   private ArrayList<Veiculo> veiculos = getVeiculosCadastrados();
   private ArrayList<Manutencao> manutencoes = new ArrayList<>();
   private ArrayList<Peca> pecas = getPecasCadastradas();
   
   public String cadastarCliente(Cliente cliente) {
       clientes.add(cliente);
       return "Cliente Cadastrado com Sucesso";
   }
   
   public String cadastrarVeiculo(Veiculo veiculo, Integer pos) {
       veiculo.setCliente(clientes.get(pos));
       veiculos.add(veiculo);
       return "Veiculo Cadastrado com Sucesso";
   }
   
   public String cadastarManutencao(Manutencao manutencao) {
       manutencoes.add(manutencao);
       return "Manutencao Registrada";
   }

    public void getClientes() {
        int pos = 0;
        for(Cliente cliente : clientes) {
            System.out.println(pos + " " + cliente.toString());
            pos++;
        }
    }

    private ArrayList<Peca> getPecasCadastradas() {
        ArrayList<Peca> pecasCadastradas = new ArrayList<>();
        pecasCadastradas.add(new Peca("Motor", "2000","Fiat", "Palio"));
        pecasCadastradas.add(new Peca("Radiador", "2000","Fiat", "Palio"));
        pecasCadastradas.add(new Peca("Roda", "2000","Fiat", "Palio"));
        pecasCadastradas.add(new Peca("Volante", "2000","Fiat", "Palio"));
        pecasCadastradas.add(new Peca("Freio", "2000","Fiat", "Palio"));
        pecasCadastradas.add(new Peca("Cambio", "2000","Fiat", "Palio"));
       
        return pecasCadastradas;
    }
    
    public void getPecas() {
        int pos = 0;
        for(Peca peca : pecas) {
            System.out.println(pos + " " + peca.toString());
            pos++;
        }
    }

    public Peca getPeca(int pos) {
       return pecas.get(pos);
    }

    public void getVeiculos() {
        int pos = 0;
        for(Veiculo veiculo : veiculos) {
            System.out.println(pos + " " + veiculo.toString());
            pos++;
        }
    }

    public Veiculo getVeiculos(int pos) {
        return veiculos.get(pos);
    }

    void addManutencao(Manutencao manutencao) {
        manutencoes.add(manutencao);
    }

    private ArrayList<Cliente> getClientesCadastrados() {
        ArrayList<Cliente> cli = new ArrayList();
        cli.add(new Cliente("Lucas", "123456789", "Avenida Rondon", "3412341234"));
        cli.add(new Cliente("Ezrom", "123456789", "Avenida Rondon", "3412341234"));
        cli.add(new Cliente("Matheus", "123456789", "Avenida Rondon", "3412341234"));
        return cli;
    }
    
    private ArrayList<Veiculo> getVeiculosCadastrados() {
        ArrayList<Veiculo> vei = new ArrayList();
        vei.add(new Veiculo("JQK-1010", "2000", "Fiat", "Palio", "120123", "Gasolina", clientes.get(0)));
        vei.add(new Veiculo("JQK-1010", "2000", "Fiat", "Fiorino", "120123", "Gasolina", clientes.get(1)));
        vei.add(new Veiculo("JQK-1010", "2000", "Chevrolet", "Chevetao", "120123", "Gasolina", clientes.get(2)));
        
        return vei;
    }
   
}
