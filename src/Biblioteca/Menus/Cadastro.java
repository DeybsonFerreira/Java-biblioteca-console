package Biblioteca.Menus;

import java.io.IOException;
import java.util.Scanner;

import Biblioteca.Vet.AlunosVet;
import Biblioteca.Vet.EmprestimoVet;
import Biblioteca.Vet.FuncionariosVet;
import Biblioteca.Vet.LivroVet;
import Biblioteca.Vet.PeriodicosVet;
import Biblioteca.Vet.ProfessorVet;

public class Cadastro {

    private Scanner lerTeclado;
    private ProfessorVet professores = new ProfessorVet();
    private AlunosVet alunos = new AlunosVet();
    private FuncionariosVet funcionarios = new FuncionariosVet();
    private PeriodicosVet periodicos = new PeriodicosVet();
    private LivroVet livros = new LivroVet();
    private EmprestimoVet emprestimos = new EmprestimoVet();

    public Cadastro(Scanner teclado) {
        lerTeclado = teclado;
    }

    public void menuCadastros() throws IOException {

        String entrada = "";

        int valorMenu = 1;
        while (valorMenu != 0) {

            System.out.println("************* Escolha um Cadastro***************");
            System.out.println("[1] - Professor");
            System.out.println("[2] - Alunos");
            System.out.println("[3] - Funcionário");
            System.out.println("[4] - Livro");
            System.out.println("[5] - Periódico");
            System.out.println("[6] - Empréstimo");
            System.out.println("[7] - Devolução");
            System.out.println("[0] - Voltar para menu principal");
            System.out.println("************* Escolha um Cadastro***************");

            entrada = lerTeclado.next();

            try {
                valorMenu = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                continue;
            }

            Menu.LimparTela();
            switch (valorMenu) {
                case 0:
                    break;
                case 1:
                    professores.cadastrarProfessores();
                    break;
                case 2:
                    alunos.cadastrarAlunos();
                    break;
                case 3:
                    funcionarios.cadastrarFuncionarios();
                    break;
                case 4:
                    livros.cadastrarlivros();
                    break;
                case 5:
                    periodicos.cadastrarPeriodicos();
                    break;
                case 6:
                    emprestimos.criarEmprestimo();
                    break;
                case 7:
                    emprestimos.criarDevolucao();
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }
        }

    }
}
