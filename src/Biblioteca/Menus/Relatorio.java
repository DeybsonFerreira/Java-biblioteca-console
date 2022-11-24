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
            System.out.println("[1] - Livros cadastrados");
            System.out.println("[2] - Empréstimos realizados");
            System.out.println("[3] - Funcionários cadastrados");
            System.out.println("[4] - Alunos cadastrados");
            System.out.println("[5] - Professores cadastrados");
            System.out.println("[6] - Imprimir multa individual");
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
                    Buscar.mostrarListaLivros();
                    break;
                case 2:
                    Buscar.mostrarEmprestimos();
                    break;
                case 3:
                    Buscar.mostrarFuncionario();
                    break;
                case 4:
                    Buscar.mostrarAlunos();
                    break;
                case 5:
                    Buscar.mostrarProfessores();
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }
}
