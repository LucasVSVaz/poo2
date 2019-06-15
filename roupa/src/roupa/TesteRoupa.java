package roupa;

import java.util.Scanner;

public class TesteRoupa {

    static Scanner scanner = new Scanner(System.in);
    static GuardaRoupa guardaRoupa = new GuardaRoupa();

    public static void main(String[] args) {
        abrirMenuPrincipal();
    }

    private static void cadastarRoupa() {
        Cor cor = new Cor();
        Roupa roupa = new Roupa();
        System.out.println("Cor");
        cor.setCor(scanner.next());
        roupa.setCor(cor);
        System.out.println("Numero");
        roupa.setManequim(scanner.nextInt());
        System.out.println("Tecido");
        roupa.setTecido(scanner.next());
        System.out.println("Preço");
        roupa.setPreco(scanner.next());

        guardaRoupa.porNoGuardaRoupa(roupa);
    }

    private static void abrirGuardaRoupa() {
        Integer position = 0;
        System.out.println("Escolha Uma Roupa");
        guardaRoupa.mostrarGuardaRoupa();
        position = scanner.nextInt();
        mostrarOpcoes(guardaRoupa.getRoupa(position));
    }

    private static void mostrarOpcoes(Roupa roupa) {
        Integer opcao = 0;
        do {
            System.out.println("1-Lavar\n"
                    + "2- Usar\n"
                    + "3- Voltar Ao Guarda Roupa\n"
                    + "4- Voltar Ao Menu Principal\n"
                    + "5- Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    guardaRoupa.porNaLavanderia(roupa);
                    break;
                case 2:
                    guardaRoupa.porEmUso(roupa);
                    break;
                case 3:
                    abrirGuardaRoupa();
                    break;
                case 4:
                    abrirMenuPrincipal();
                    break;
                default:
                    System.out.println("Opção Invalida");

            }
        } while (opcao != 5);
    }

    private static void abrirMenuPrincipal() {
        Integer menu = 0;
        do {
            System.out.println("Menu Principal\n"
                    + "0- Abrir Guarda Roupa\n"
                    + "1- Colocar no Guarda Roupa\n"
                    + "2- Status Roupa\n"
                    + "3- Sair");
            menu = scanner.nextInt();
            switch (menu) {
                case 0:
                    abrirGuardaRoupa();
                    break;
                case 1:
                    cadastarRoupa();
                    break;
                case 2:
                    System.out.println(guardaRoupa.getStatus());
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }

        } while (menu != 3);
    }


}
