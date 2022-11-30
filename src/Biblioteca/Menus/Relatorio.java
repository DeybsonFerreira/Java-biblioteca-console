package Biblioteca.Menus;

import java.util.Scanner;

import Biblioteca.Operacoes.Buscar;

public class Relatorio {

    private Scanner lerTeclado;

    public Relatorio(Scanner teclado) {
        lerTeclado = teclado;
    }

    public void menuRelatorios() {
        int continuar = 1;
        String entrada = "";
        int valorMenu = 0;

        while (continuar != 0) {

            System.out.println("Escolha o Relatório desejado");
            System.out.println("[1] - Professores cadastrados");
            System.out.println("[2] - Alunos cadastrados");
            System.out.println("[3] - Funcionários cadastrados");
            System.out.println("[4] - Livros cadastrados");
            System.out.println("[5] - Periódicos cadastrados");
            System.out.println("[6] - Empréstimos realizados");
            System.out.println("[0] - Voltar para menu principal");
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
                    Buscar.mostrarProfessores();
                    break;
                case 2:
                    Buscar.mostrarAlunos();
                    break;
                case 3:
                    Buscar.mostrarFuncionario();
                    break;
                case 4:
                    Buscar.mostrarListaLivros();
                    break;
                case 5:
                    Buscar.mostrarPeriodicos();
                    break;
                case 6:
                    Buscar.mostrarEmprestimos();
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }
}
