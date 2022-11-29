package Biblioteca.Vet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Biblioteca.Models.Emprestimo;
import Biblioteca.Operacoes.Constantes;
import Biblioteca.Operacoes.ManipulaArquivo;
import Biblioteca.Operacoes.Salvar;

public class EmprestimoVet {

    private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    Scanner ler = new Scanner(System.in);

    public EmprestimoVet() {
    }

    public ArrayList<Emprestimo> getEmprestimos() throws IOException {
        List<String> listStg = ManipulaArquivo.leitor(Constantes.Url_Csv_Emprestimos);

        setEmprestimos(emprestimos, listStg);

        return emprestimos;
    }

    public static String ObterDataDevolucao(String[] formatoLinha) {
        try {
            return (formatoLinha[4]);

        } catch (Exception e) {
        }
        return "...";
    }

    public static String ObterDataEmprestimo(String[] formatoLinha) {
        try {
            return (formatoLinha[3]);

        } catch (Exception e) {
        }
        return "...";
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos, List<String> linhas) {

        int numLinhas = linhas.size();
        String linha, valorComSplit[];

        for (int i = 0; i < numLinhas; i++) {
            linha = linhas.get(i);
            valorComSplit = linha.split(";");

            String codigo = valorComSplit[0];
            if (codigo.isEmpty())
                codigo = "0";

            String matriculaCliente = valorComSplit[1];
            if (matriculaCliente.isEmpty())
                matriculaCliente = "0";

            String matriculaFuncionario = valorComSplit[2];
            if (matriculaFuncionario.isEmpty())
                matriculaFuncionario = "0";

            String dataEmprestimo = ObterDataEmprestimo(valorComSplit);
            String dataDevolucao = ObterDataDevolucao(valorComSplit);

            emprestimos.add(new Emprestimo(
                    Long.parseLong(codigo),
                    Long.parseLong(matriculaCliente),
                    Long.parseLong(matriculaFuncionario),
                    dataEmprestimo,
                    dataDevolucao));
        }
        this.emprestimos = emprestimos;
    }

    public void criarEmprestimo() throws IOException {

        System.out.println("*********** CRIAR NOVO EMPRESTIMO *********** \n");

        Emprestimo emprestimo = new Emprestimo();
        String entrada, linha = "";

        System.out.printf("Informe o CÓDIGO do empréstimo :");
        entrada = ler.nextLine();
        linha += entrada + ";";
        emprestimo.setCodigo(Long.parseLong(entrada));

        System.out.printf("Informe a MATRÍCULA do cliente :");
        entrada = ler.nextLine();
        linha += entrada + ";";
        emprestimo.setMatriculaCliente(Long.parseLong(entrada));

        System.out.printf("Informe a MATRÍCULA do funcionário :");
        entrada = ler.nextLine();
        linha += entrada + ";";
        emprestimo.setMatriculaFuncionario(Long.parseLong(entrada));

        System.out.printf("Informe a DATA do emprestimo :");
        entrada = ler.nextLine();
        linha += entrada + ";";
        emprestimo.setDataEmprestimo(entrada);

        // inserir novo emprestimo no array
        emprestimos.add(emprestimo);

        Salvar.SalvarNovoDado(linha, Constantes.Url_Csv_Emprestimos);
    }

    public void criarDevolucao() throws IOException {

        System.out.println("*********** CRIAR NOVA DEVOLUCAO *********** \n");

        Emprestimo emprestimo = new Emprestimo();
        String entrada, linha = "";

        System.out.printf("Informe o CÓDIGO do empréstimo :");
        entrada = ler.nextLine();
        linha += entrada + ";";
        emprestimo.setCodigo(Long.parseLong(entrada));

        System.out.printf("Informe a DATA da DEVOLUÇÃO :");
        entrada = ler.nextLine();
        linha += entrada + ";";
        emprestimo.setDataDevolucao(entrada);

        // Salvar.SalvarNovoDado(linha, Constantes.Url_Csv_Emprestimos);
    }
}
