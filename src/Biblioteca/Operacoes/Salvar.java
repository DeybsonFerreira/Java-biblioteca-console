package Biblioteca.Operacoes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Biblioteca.Menus.Menu;

public class Salvar {

    public static void SalvarNovoDado(String novaLinha, String url, String cabecalho) {

        List<String> listaExcel = new ArrayList<String>();
        String primeiraLinha = "";
        try {
            // buscar linhas no csv
            listaExcel = ManipulaArquivo.leitor(url);
            primeiraLinha = listaExcel.get(0);
        } catch (Exception e) {

        }

        // quando não contém cabeçalho no arquivo > adiciona cabecalho
        if (!primeiraLinha.contains(cabecalho.split(";")[0])) {
            listaExcel.add(cabecalho);
        }

        // adicionar nova linha dentro das lista existente
        listaExcel.add(novaLinha);

        // salvar toda lista no csv ( com o dado novo)

        try {
            Menu.LimparTela();
            ManipulaArquivo.escritor(url, listaExcel);
            System.out.println("\n \n ********* SALVO COM SUCESSO ********** \n \n ");
        } catch (IOException e) {
            System.out.println("\n \n ********* ERRO AO SALVAR ********** \n \n ");
        }
    }
}
