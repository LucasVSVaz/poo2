/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mecanica;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class TesteMecanica {

    static Mecanica mecanica = new Mecanica();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        Integer op;
        do {
            System.out.println("1- Cadastar Cliente\n"
                    + "2- Cadastar Veiculo\n"
                    + "3- Cadastar Peça\n"
                    + "4- Agendar Manutenção\n"
                    + "5- Sair");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    cadastarCliente();
                    break;
                case 2:
                    cadastarVeiculo();
                    break;
                case 3:
                    cadastrarPeca();
                    break;
                case 4:
                    agendarMantutencao();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcao Invalida");
                    break;

            }
        } while (op != 5);

    }

    private static void cadastarCliente() {
        Cliente cliente = new Cliente();
        System.out.println("Nome");
        cliente.setNome(scanner.next());
        System.out.println("Cpf");
        cliente.setCpf(scanner.next());
        System.out.println("Endereço");
        cliente.setEndereco(scanner.next());
        System.out.println("Telefone");
        cliente.setTelefone(scanner.next());
        mecanica.cadastarCliente(cliente);
    }

    private static void cadastarVeiculo() {
        Veiculo veiculo = new Veiculo();
        Integer pos;
        System.out.println("Marca");
        veiculo.setMarca(scanner.next());
        System.out.println("Modelo");
        veiculo.setModelo(scanner.next());
        System.out.println("Placa");
        veiculo.setPlaca(scanner.next());
        System.out.println("Chassi");
        veiculo.setChassi(scanner.next());
        System.out.println("Combustivel");
        veiculo.setCombustivel(scanner.next());
        System.out.println("Selecione Um Cliente");
        mecanica.getClientes();
        pos = scanner.nextInt();
        mecanica.cadastrarVeiculo(veiculo, pos);
    }

    private static void agendarMantutencao() {
        int op;
        Manutencao manutencao = new Manutencao();
        do {
            System.out.println("1- Adicionar Peça\n"
                    + "2- Informar Veiculo\n"
                    + "3- Confirmar Agendamento\n"
                    + "4- Sair");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    mostrarPecas(manutencao);
                    break;
                case 2:
                    informarVeiculo(manutencao);
                    break;
                case 3:
                    confirmarAgendamento(manutencao);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção Invalida.");
                    break;
            }
        } while (op != 4);
    }

    private static void mostrarPecas(Manutencao manutencao) {
        int pos;
        System.out.println("Escolha uma peça");
        mecanica.getPecas();
        pos = scanner.nextInt();
        manutencao.addPeca(mecanica.getPeca(pos));
    }

    private static void informarVeiculo(Manutencao manutencao) {
        int pos;
        System.out.println("Escolha um Veiculo");
        mecanica.getVeiculos();
        pos = scanner.nextInt();
        manutencao.setVeiculo(mecanica.getVeiculos(pos));
    }

    private static void confirmarAgendamento(Manutencao manutencao) {
        if(manutencao.getVeiculo() == null) {
            System.out.println("Adiocione Um Veiculo Antes de Confirmar o Agendamento.");
        }
        else {
        mecanica.addManutencao(manutencao);
        }
    }

    private static void cadastrarPeca() {
       Peca peca = new Peca();
        System.out.println("Nome");
        peca.setNome(scanner.next());
        System.out.println("Ano");
        peca.setAno(scanner.next());
        System.out.println("Marca");
        peca.setMarca(scanner.next());
        System.out.println("Modelo");
        peca.setModelo(scanner.next());
       
    }
}
