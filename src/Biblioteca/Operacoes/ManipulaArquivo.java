package Biblioteca.Operacoes;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ManipulaArquivo {

    public static List<String> leitor(String localArquivo) throws IOException {
        Path path = Paths.get(localArquivo);
        List<String> linhas = Files.readAllLines(path);

        // remover listas vazias
        linhas.removeAll(Arrays.asList("", null));

        return linhas;
    }

    public static void escritor(String localArquivo, String linha) throws IOException {
        FileWriter arquivo = new FileWriter(String.valueOf(localArquivo));
        arquivo.write(linha + "\n");
        arquivo.close();
    }

    public static void escritor(String localArquivo, List<String> linhas) throws IOException {
        // escritor para salvar listas
        String linhaCompleta = "";
        for (int i = 0; i < linhas.size(); i++) {
            linhaCompleta += linhas.get(i) + "\n";
        }
        escritor(localArquivo, linhaCompleta);
    }
}
