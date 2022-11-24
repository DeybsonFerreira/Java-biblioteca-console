package Biblioteca.Menus;

import java.util.Scanner;

public class Emprestimo {

    private Scanner lerTeclado;

    public Emprestimo(Scanner teclado) {
        lerTeclado = teclado;
    }

    public void menuEmprestimo() {
        int continuar = 1;
        String entrada = "";
        int valorMenu = 0;

        while (continuar != 0) {

            System.out.println("XXXXXXXX");
            System.out.println("1 - YYYYYYY");
            System.out.println("2 - TTTTTTTT");
            System.out.println("0 - Voltar para menu principal");
            entrada = lerTeclado.next();

            try {
                valorMenu = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                continue;
            }

            Menu.LimparTela();

            switch (valorMenu) {
                case 0:
                    continuar = 0;
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                default:
                    System.out.println("Opção Inválida!");
            }
        }

    }
}
