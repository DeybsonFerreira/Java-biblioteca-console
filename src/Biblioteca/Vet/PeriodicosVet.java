package Biblioteca.Vet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Biblioteca.Models.Periodicos;
import Biblioteca.Operacoes.Constantes;
import Biblioteca.Operacoes.ManipulaArquivo;
import Biblioteca.Operacoes.Salvar;

public class PeriodicosVet {

    private ArrayList<Periodicos> periodicos = new ArrayList<Periodicos>();
    Scanner ler = new Scanner(System.in);

    public PeriodicosVet() {

    }

    public ArrayList<Periodicos> getPeriodicos() throws IOException {
        List<String> listStg = ManipulaArquivo.leitor(Constantes.Url_Csv_Periodicos);

        setPeriodicos(periodicos, listStg);

        return periodicos;
    }

    public void setPeriodicos(ArrayList<Periodicos> periodicos, List<String> linhas) {
        int numLinhas = linhas.size();
        String linha, valorComSplit[];

        for (int i = 0; i < numLinhas; i++) {
            linha = linhas.get(i);
            valorComSplit = linha.split(";");
            periodicos.add(new Periodicos(
                    Integer.parseInt(valorComSplit[0]),
                    valorComSplit[1],
                    valorComSplit[2],
                    valorComSplit[3],
                    valorComSplit[4],
                    valorComSplit[5],
                    Float.parseFloat(valorComSplit[6])));
        }
        this.periodicos = periodicos;
    }

    public void cadastrarPeriodicos() throws IOException {

        System.out.println("*********** CADASTRAR PERIÓDICOS *********** \n");

        String entrada, linha = "";
        Periodicos periodico = new Periodicos();

        System.out.printf("Informe o CÓDIGO do periódico: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        periodico.setCodigo(Integer.parseInt(entrada));

        System.out.printf("Informe o AUTOR do periódico: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        periodico.setAutor(entrada);

        System.out.printf("Informe o TITULO do periódico: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        periodico.setTipo(entrada);

        System.out.printf("Informe a EDITORA periódico: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        periodico.setEditora(entrada);

        System.out.printf("Informe o TIPO periódico: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        periodico.setTipo(entrada);

        System.out.printf("Informe o ISSN periódico: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        periodico.setIssn(entrada);

        System.out.printf("Informe o Fator de impacto ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        periodico.setFatorImpacto(Float.parseFloat(entrada));

        Salvar.SalvarNovoDado(linha, Constantes.Url_Csv_Periodicos);

    }
}
