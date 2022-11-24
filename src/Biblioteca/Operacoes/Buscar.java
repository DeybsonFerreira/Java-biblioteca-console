package Biblioteca.Operacoes;

import java.io.IOException;
import java.util.List;

import Biblioteca.Vet.AlunosVet;

public class Buscar {

    public static void mostrarListaLivros() {
        try {
            List<String> listStg = ManipulaArquivo.leitor(Constantes.Url_Csv_Livros);
            int qtd = listStg.size();
            if (qtd == 0) {
                System.out.println("\n ************ Não Existe LIVROS Cadastrados! ************* \n \n ");
                return;
            }

            System.out.println("................. LIVROS [" + (qtd + 1) + "].....................");

            for (int i = 0; i < listStg.size(); i++) {
                String linha = listStg.get(i);

                // todas as linhas separado por array
                String[] formatoLinha = linha.split(";");

                // unica linha de resultados (com cabeçalho)
                var resultadoLinha = "[Cod] " + formatoLinha[0];
                resultadoLinha += " - [Autor] " + formatoLinha[1];
                resultadoLinha += " - [Titulo] " + formatoLinha[2];
                resultadoLinha += " - [Editora] " + formatoLinha[3];
                resultadoLinha += " - [Tipo] " + formatoLinha[4];
                resultadoLinha += " - [Ano] " + formatoLinha[5];
                resultadoLinha += " - [ISSN] " + formatoLinha[6];

                System.out.println(resultadoLinha);
            }
            System.out.println("\n \n ");

        } catch (IOException e) {
            System.out.println("\n ************ Não Existe livros Cadastrados! ************* \n \n ");
        }
    }

    public static void mostrarAlunos() {
        try {
            List<String> listStg = ManipulaArquivo.leitor(Constantes.Url_Csv_Alunos);
            int qtd = listStg.size();
            if (qtd == 0) {
                System.out.println("\n ************ Não Existe ALUNOS Cadastrados! ************* \n \n ");
                return;
            }

            System.out.println("................. ALUNOS [" + (qtd + 1) + "].....................");

            for (int i = 0; i < listStg.size(); i++) {
                String linha = listStg.get(i);

                // todas as linhas separado por array
                String[] formatoLinha = linha.split(";");

                // unica linha de resultados (com cabeçalho)
                var resultadoLinha = "[Matricula] " + formatoLinha[0];
                resultadoLinha += " - | [Nome] " + formatoLinha[1];
                resultadoLinha += " - | [Endereco] " + formatoLinha[2];
                resultadoLinha += " - | [Curso] " + formatoLinha[3];
                resultadoLinha += " - | [Ingresso] " + formatoLinha[4];
                resultadoLinha += " - | [Multa] " + AlunosVet.ObterValorMulta(formatoLinha);

                System.out.println(resultadoLinha);

            }
            System.out.println("\n \n ");

        } catch (IOException e) {
            System.out.println("\n ************ Não Existe Alunos Cadastrados! ************* \n \n ");
        }
    }

    public static void mostrarFuncionario() {
        try {
            List<String> listStg = ManipulaArquivo.leitor(Constantes.Url_Csv_Funcionarios);
            int qtd = listStg.size();
            if (qtd == 0) {
                System.out.println("\n ************ Não Existe FUNCIONÁRIOS Cadastrados! ************* \n \n ");
                return;
            }

            System.out.println("................. FUNCIONÁRIOS [" + (qtd + 1) + "].....................");

            for (int i = 0; i < listStg.size(); i++) {
                String linha = listStg.get(i);

                // todas as linhas separado por array
                String[] formatoLinha = linha.split(";");

                // unica linha de resultados (com cabeçalho)
                var resultadoLinha = "[Matricula] " + formatoLinha[0];
                resultadoLinha += " - | [Nome] " + formatoLinha[1];
                resultadoLinha += " - | [Endereco] " + formatoLinha[2];
                resultadoLinha += " - | [Ingresso] " + formatoLinha[3];
                resultadoLinha += " - | [Setor] " + formatoLinha[4];
                resultadoLinha += " - | [Senha] " + formatoLinha[5];
                resultadoLinha += " - | [Login] " + formatoLinha[6];

                System.out.println(resultadoLinha);

            }
            System.out.println("\n \n ");

        } catch (IOException e) {
            System.out.println("\n ************ Não Existe Funcionários Cadastrados! ************* \n \n ");
        }
    }

    public static void mostrarEmprestimos() {
        try {
            List<String> listStg = ManipulaArquivo.leitor(Constantes.Url_Csv_Funcionarios);
            int qtd = listStg.size();
            if (qtd == 0) {
                System.out.println("\n ************ Não Existe EMPRÉSTIMOS Cadastrados! ************* \n \n ");
                return;
            }

            System.out.println("................. EMPRÉSTIMOS [" + (qtd + 1) + "].....................");

            for (int i = 0; i < listStg.size(); i++) {
                String linha = listStg.get(i);

                // todas as linhas separado por array
                String[] formatoLinha = linha.split(";");

                // unica linha de resultados (com cabeçalho)
                var resultadoLinha = "[Cod] " + formatoLinha[0];
                resultadoLinha += " - | [Matric. Cliente] " + formatoLinha[1];
                resultadoLinha += " - | [Matric. Func.] " + formatoLinha[2];
                resultadoLinha += " - | [Data Emprest.] " + formatoLinha[3];
                resultadoLinha += " - | [Data Devol.] " + formatoLinha[4];

                System.out.println(resultadoLinha);

            }
            System.out.println("\n \n ");

        } catch (IOException e) {
            System.out.println("\n ************ Não Existe Empréstimos Cadastrados! ************* \n \n ");
        }
    }

    public static void mostrarProfessores() {
        try {
            List<String> listStg = ManipulaArquivo.leitor(Constantes.Url_Csv_Professor);
            int qtd = listStg.size();
            if (qtd == 0) {
                System.out.println("\n ************ Não Existe PROFESSORES Cadastrados! ************* \n \n ");
                return;
            }

            System.out.println("................. PROFESSORES [" + (qtd + 1) + "].....................");

            for (int i = 0; i < listStg.size(); i++) {
                String linha = listStg.get(i);

                // todas as linhas separado por array
                String[] formatoLinha = linha.split(";");

                // unica linha de resultados (com cabeçalho)
                var resultadoLinha = "[Cod] " + formatoLinha[0];
                resultadoLinha += " - [Nome] " + formatoLinha[1];
                resultadoLinha += " - [Endereco] " + formatoLinha[2];
                resultadoLinha += " - [Ingresso] " + formatoLinha[3];
                resultadoLinha += " - [Setor] " + formatoLinha[4];

                System.out.println(resultadoLinha);

            }
            System.out.println("\n \n ");

        } catch (IOException e) {
            System.out.println("\n ************ Não Existe Professores Cadastrados! ************* \n \n ");
        }
    }
}
