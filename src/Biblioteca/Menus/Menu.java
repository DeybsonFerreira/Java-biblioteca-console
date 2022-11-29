package Biblioteca.Menus;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    private Scanner lerTeclado = new Scanner(System.in);

    public void menuPrincipal() throws IOException {
        String entrada = "";
        int continuar = 1;
        int valorMenu = 0;

        while (continuar != 0) {

            System.out.println("**************** BIBLIOTECA *************************");
            System.out.println("Escolha uma opção");
            System.out.println("[1] - Cadastros");
            System.out.println("[2] - Relatórios");
            System.out.println("[0] - Finalizar");
            System.out.println("**************** BIBLIOTECA *************************");
            entrada = lerTeclado.next();

            LimparTela();

            try {
                valorMenu = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                continue;
            }

            switch (valorMenu) {
                case 0:
                    System.out.println("Programa Encerrado!");
                    continuar = 0;
                    break;
                case 1:
                    new Cadastro(lerTeclado).menuCadastros();
                    break;
                case 2:
                    new Relatorio(lerTeclado).menuRelatorios();
                default:
                    System.out.println("Opção Inválida!");
            }
        }

    }

    public static void LimparTela() {
        char esc = 27;
        String clear = esc + "[2J";
        System.out.print(clear);
    }
}
