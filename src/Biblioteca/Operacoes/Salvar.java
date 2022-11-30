package Biblioteca.Operacoes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Biblioteca.Menus.Menu;

public class Salvar {

    public static void SalvarNovoDado(String novaLinha, String url, String cabecalho) {

        List<String> listaExcel = new ArrayList<String>();

        try {
            // buscar linhas no csv
            listaExcel = ManipulaArquivo.leitor(url);
        } catch (IOException e) {

        }
        // adicionar nova linha dentro das lista existente
        listaExcel.add(cabecalho);
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
