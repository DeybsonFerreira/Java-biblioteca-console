package Biblioteca.Vet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Biblioteca.Models.Livro;
import Biblioteca.Operacoes.Constantes;
import Biblioteca.Operacoes.ManipulaArquivo;
import Biblioteca.Operacoes.Salvar;

public class LivroVet {
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    Scanner ler = new Scanner(System.in);

    public LivroVet() {
    }

    public ArrayList<Livro> getLivros() throws IOException {
        List<String> listStg = ManipulaArquivo.leitor(Constantes.Url_Csv_Livros);
        setLivros(livros, listStg);
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros, List<String> linhas) {
        int numLinhas = linhas.size();
        String linha, valorComSplit[];

        for (int i = 0; i < numLinhas; i++) {
            linha = linhas.get(i);
            valorComSplit = linha.split(";");

            String tipo = valorComSplit[4];
            String ano = valorComSplit[5];
            String issn = valorComSplit[6];

            livros.add(new Livro(
                    Integer.parseInt(valorComSplit[0]),
                    valorComSplit[1],
                    valorComSplit[2],
                    valorComSplit[3],
                    ano,
                    issn,
                    tipo));

        }
        this.livros = livros;
    }

    public void cadastrarlivros() throws IOException {

        System.out.println("*********** CADASTRAR LIVROS *********** \n ");

        String entrada, linha = "";
        Livro livro = new Livro();

        System.out.printf("informe o CÓDIGO do Livro :");
        entrada = ler.nextLine();
        linha += entrada + ";";
        livro.setCodigo(Integer.parseInt(entrada));

        System.out.printf("informe o nome do AUTOR :");
        entrada = ler.nextLine();
        linha += entrada + ";";
        livro.setAutor(entrada);

        System.out.printf("informe o TÍTULO do livro :");
        entrada = ler.nextLine();
        linha += entrada + ";";
        livro.setTitulo(entrada);

        System.out.printf("informe a EDITORA :");
        entrada = ler.nextLine();
        linha += entrada + ";";
        livro.setEditora(entrada);

        System.out.printf("informe o TIPO do livro :");
        entrada = ler.nextLine();
        linha += entrada + ";";
        livro.setTipo(entrada);

        System.out.printf("informe o ANO de publicação  :");
        entrada = ler.nextLine();
        linha += entrada + ";";
        livro.setAnoPublicado(entrada);

        System.out.printf("infome o ISSN do Livro :");
        entrada = ler.nextLine();
        linha += entrada + ";";
        livro.setIssn(entrada);

        String cabecalho = "";
        Salvar.SalvarNovoDado(linha, Constantes.Url_Csv_Livros, cabecalho);

    }
}
