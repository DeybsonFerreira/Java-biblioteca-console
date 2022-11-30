package Biblioteca.Vet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Biblioteca.Models.Alunos;
import Biblioteca.Operacoes.Constantes;
import Biblioteca.Operacoes.ManipulaArquivo;
import Biblioteca.Operacoes.Salvar;

public class AlunosVet {

    private ArrayList<Alunos> Alunos = new ArrayList<Alunos>();
    Scanner ler = new Scanner(System.in);

    public AlunosVet() {
    }

    public ArrayList<Alunos> getAlunos() throws IOException {
        List<String> listStg = ManipulaArquivo.leitor(Constantes.Url_Csv_Alunos);

        setAlunos(Alunos, listStg);

        return Alunos;
    }

    public void setAlunos(ArrayList<Alunos> Alunos, List<String> linhas) {
        int numLinhas = linhas.size();
        String linha, valorComSplit[];

        for (int i = 0; i < numLinhas; i++) {
            linha = linhas.get(i);
            valorComSplit = linha.split(";");

            Alunos.add(new Alunos(
                    Integer.parseInt(valorComSplit[0]),
                    valorComSplit[1],
                    valorComSplit[2],
                    valorComSplit[3],
                    valorComSplit[4],
                    ObterValorMulta(valorComSplit)));
        }
        this.Alunos = Alunos;
    }

    public static Float ObterValorMulta(String[] formatoLinha) {
        try {
            return Float.parseFloat(formatoLinha[5]);

        } catch (Exception e) {
        }
        return 0.F;
    }

    public void cadastrarAlunos() throws IOException {

        System.out.println("*********** CADASTRAR ALUNOS *********** \n");

        String entrada, linha = "";
        Alunos alunos = new Alunos();

        System.out.printf("Informe o NÚMERO da matrícula do aluno: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        alunos.setMatricula(Integer.parseInt(entrada));

        System.out.printf("Informe o NOME do aluno: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        alunos.setNome(entrada);

        System.out.printf("Informe o ENDEREÇO do aluno: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        alunos.setEndereco(entrada);

        System.out.printf("Informe o CURSO do aluno: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        alunos.setCurso(entrada);

        System.out.printf("Informe a DATA de ingresso do aluno: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        alunos.setDataIngresso(entrada);

        String cabecalho = "";
        Salvar.SalvarNovoDado(linha, Constantes.Url_Csv_Alunos, cabecalho);
    }
}
