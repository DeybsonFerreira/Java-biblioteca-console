package Biblioteca.Vet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Biblioteca.Models.Funcionario;
import Biblioteca.Operacoes.Constantes;
import Biblioteca.Operacoes.ManipulaArquivo;
import Biblioteca.Operacoes.Salvar;

public class FuncionariosVet {

    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    Scanner ler = new Scanner(System.in);

    public FuncionariosVet() {

    }

    public ArrayList<Funcionario> getFuncionarios() throws IOException {
        List<String> listStg = ManipulaArquivo.leitor(Constantes.Url_Csv_Funcionarios);

        setFuncionarios(funcionarios, listStg);

        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios, List<String> linhas) {
        int numLinhas = linhas.size();
        String linha, valorComSplit[];

        for (int i = 0; i < numLinhas; i++) {
            linha = linhas.get(i);
            valorComSplit = linha.split(";");
            funcionarios.add(new Funcionario(
                    Integer.parseInt(valorComSplit[0]),
                    valorComSplit[1],
                    valorComSplit[2],
                    valorComSplit[3],
                    valorComSplit[4],
                    valorComSplit[5],
                    valorComSplit[6]));
        }
        this.funcionarios = funcionarios;
    }

    public void cadastrarFuncionarios() throws IOException {

        System.out.println("*********** CADASTRAR FUNCIONÁRIOS *********** \n ");

        String entrada, linha = "";
        Funcionario funcionario = new Funcionario();
        System.out.printf("Informe o NÚMERO da matrícula do funcionario: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        funcionario.setMatricula(Integer.parseInt(entrada));

        System.out.printf("Informe o NOME do funcionario: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        funcionario.setNome(entrada);

        System.out.printf("Informe o ENDEREÇO do funcionario: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        funcionario.setEndereco(entrada);

        System.out.printf("Informe o SETOR do funcionario: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        funcionario.setSetor(entrada);

        System.out.printf("Informe a DATA de ingresso do funcionario: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        funcionario.setDataIngresso(entrada);

        System.out.printf("Informe o LOGIN do funcionario: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        funcionario.setLogin(entrada);

        System.out.printf("Informe a SENHA  do funcionario: ");
        entrada = ler.nextLine();
        linha += entrada + ";";
        funcionario.setSenha(entrada);

        String cabecalho = "";
        Salvar.SalvarNovoDado(linha, Constantes.Url_Csv_Funcionarios, cabecalho);
    }
}
