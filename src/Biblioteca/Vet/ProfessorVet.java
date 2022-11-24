package Biblioteca.Vet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Biblioteca.Models.Professor;
import Biblioteca.Operacoes.Constantes;
import Biblioteca.Operacoes.ManipulaArquivo;
import Biblioteca.Operacoes.Salvar;

public class ProfessorVet {

    private ArrayList<Professor> professores = new ArrayList<Professor>();
    Scanner ler = new Scanner(System.in);

    public ProfessorVet() {
        // construtor com chamada dos dados
        try {
            getProfessores();
        } catch (IOException e) {
        }
    }

    public ArrayList<Professor> getProfessores() throws IOException {
        List<String> listStg = ManipulaArquivo.leitor(Constantes.Url_Csv_Professor);

        setProfessores(professores, listStg);

        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores, List<String> linhas) {
        int numLinhas = linhas.size();
        String linha, valorComSplit[];

        for (int i = 0; i < numLinhas; i++) {
            linha = linhas.get(i);
            valorComSplit = linha.split(";");
            professores.add(new Professor(
                    Integer.parseInt(valorComSplit[0]),
                    valorComSplit[1],
                    valorComSplit[2],
                    valorComSplit[3],
                    valorComSplit[4]));
        }
        this.professores = professores;
    }

    public void cadastrarProfessores() throws IOException {

        System.out.println("*********** CADASTRAR PROFESSOR *********** \n");

        String entrada, linha = "";
        Professor professor = new Professor();
        System.out.printf("Informe o Número da matrícula do professor: ");
        entrada = ler.nextLine();
        linha += entrada + ";";

        professor.setMatricula(Integer.parseInt(entrada));
        System.out.printf("Informe o Nome do professor: ");
        entrada = ler.nextLine();
        linha += entrada + ";";

        professor.setNome(entrada);
        System.out.printf("Informe o endereço do professor: ");
        entrada = ler.nextLine();
        linha += entrada + ";";

        professor.setEndereco(entrada);
        System.out.printf("Informe a data de ingresso do professor: ");
        entrada = ler.nextLine();
        linha += entrada + ";";

        professor.setDataIngresso(entrada);
        System.out.printf("Informe o setor do professor: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        professor.setSetor(entrada);

        // inserir novo professor no array
        professores.add(professor);

        Salvar.SalvarNovoDado(linha, Constantes.Url_Csv_Professor);

    }

    @Override
    public String toString() {
        String resposta = "";
        int tam = professores.size();
        for (int i = 0; i < tam; i++) {
            resposta += (i + 1) + "." + this.professores.get(i).toString() + "\n";
        }
        return resposta;
    }
}