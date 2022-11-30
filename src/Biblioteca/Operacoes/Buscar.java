package Biblioteca.Operacoes;

import java.io.IOException;
import java.util.ArrayList;
import Biblioteca.Models.Alunos;
import Biblioteca.Models.Emprestimo;
import Biblioteca.Models.Funcionario;
import Biblioteca.Models.Livro;
import Biblioteca.Models.Periodicos;
import Biblioteca.Models.Professor;
import Biblioteca.Vet.AlunosVet;
import Biblioteca.Vet.EmprestimoVet;
import Biblioteca.Vet.FuncionariosVet;
import Biblioteca.Vet.LivroVet;
import Biblioteca.Vet.PeriodicosVet;
import Biblioteca.Vet.ProfessorVet;

public class Buscar {

    public static void mostrarListaLivros() {
        LivroVet operacao = new LivroVet();

        try {

            ArrayList<Livro> lista = operacao.getLivros();
            int qtd = lista.size();
            if (qtd == 0) {
                System.out.println("\n ************ Não Existe LIVROS Cadastrados! ************* \n \n ");
                return;
            }

            System.out.println("................. LIVROS [" + (qtd) + "].....................");
            for (int i = 0; i < lista.size(); i++) {
                Livro item = lista.get(i);
                System.out.println(item.toString());
            }

            System.out.println("\n \n ");

        } catch (IOException e) {
            System.out.println("\n ************ Não Existe LIVROS Cadastrados! ************* \n \n ");
        }
    }

    public static void mostrarAlunos() {
        AlunosVet operacao = new AlunosVet();

        try {

            ArrayList<Alunos> lista = operacao.getAlunos();
            int qtd = lista.size();
            if (qtd == 0) {
                System.out.println("\n ************ Não Existe ALUNOS Cadastrados! ************* \n \n ");
                return;
            }

            System.out.println("................. ALUNOS [" + (qtd) + "].....................");
            for (int i = 0; i < lista.size(); i++) {
                Alunos item = lista.get(i);
                System.out.println(item.toString());
            }

            System.out.println("\n \n ");

        } catch (IOException e) {
            System.out.println("\n ************ Não Existe ALUNOS Cadastrados! ************* \n \n ");
        }
    }

    public static void mostrarFuncionario() {
        FuncionariosVet operacao = new FuncionariosVet();

        try {

            ArrayList<Funcionario> lista = operacao.getFuncionarios();
            int qtd = lista.size();
            if (qtd == 0) {
                System.out.println("\n ************ Não Existe FUNCIONÁRIOS Cadastrados! ************* \n \n ");
                return;
            }

            System.out.println("................. FUNCIONÁRIOS [" + (qtd) + "].....................");
            for (int i = 0; i < lista.size(); i++) {
                Funcionario item = lista.get(i);
                System.out.println(item.toString());
            }

            System.out.println("\n \n ");

        } catch (IOException e) {
            System.out.println("\n ************ Não Existe FUNCIONÁRIOS Cadastrados! ************* \n \n ");
        }
    }

    public static void mostrarEmprestimos() {
        EmprestimoVet operacao = new EmprestimoVet();
        try {

            ArrayList<Emprestimo> lista = operacao.getEmprestimos();
            int qtd = lista.size();
            if (qtd == 0) {
                System.out.println("\n ************ Não Existe EMPRÉSTIMOS Cadastrados! ************* \n \n ");
                return;
            }

            System.out.println("................. EMPRÉSTIMOS [" + (qtd) + "].....................");
            for (int i = 0; i < lista.size(); i++) {
                Emprestimo item = lista.get(i);
                System.out.println(item.toString());
            }

            System.out.println("\n \n ");

        } catch (IOException e) {
            System.out.println("\n ************ Não Existe EMPRÉSTIMOS Cadastrados! ************* \n \n ");
        }
    }

    public static void mostrarProfessores() {
        ProfessorVet operacao = new ProfessorVet();

        try {

            ArrayList<Professor> lista = operacao.getProfessores();
            int qtd = lista.size();
            if (qtd == 0) {
                System.out.println("\n ************ Não Existe PROFESSORES Cadastrados! ************* \n \n ");
                return;
            }

            System.out.println("................. PROFESSORES [" + (qtd) + "].....................");
            for (int i = 0; i < lista.size(); i++) {
                Professor item = lista.get(i);
                System.out.println(item.toString());
            }

            System.out.println("\n \n ");

        } catch (IOException e) {
            System.out.println("\n ************ Não Existe PROFESSORES Cadastrados! ************* \n \n ");
        }
    }

    public static void mostrarPeriodicos() {
        PeriodicosVet operacao = new PeriodicosVet();

        try {

            ArrayList<Periodicos> lista = operacao.getPeriodicos();
            int qtd = lista.size();
            if (qtd == 0) {
                System.out.println("\n ************ Não Existe PERIÓDICOS Cadastrados! ************* \n \n ");
                return;
            }

            System.out.println("................. PERIÓDICOS [" + (qtd) + "].....................");
            for (int i = 0; i < lista.size(); i++) {
                Periodicos item = lista.get(i);
                System.out.println(item.toString());
            }

            System.out.println("\n \n ");

        } catch (IOException e) {
            System.out.println("\n ************ Não Existe PERIÓDICOS Cadastrados! ************* \n \n ");
        }
    }
}
