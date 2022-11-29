package Biblioteca.Models;

public class Professor {
    private int matricula;
    private String nome, endereco, dataIngresso, setor;

    public Professor() {
        super();
        this.matricula = 0;
        this.nome = "";
        this.endereco = "";
        this.dataIngresso = "";
        this.setor = "";
    }

    public Professor(int matricula, String nome, String endereco, String dataIngresso, String setor) {
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.dataIngresso = dataIngresso;
        this.setor = setor;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(String dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        String resultadoLinha = "[Matrícula = " + matricula + "]";
        resultadoLinha += " [Nome = " + nome + "]";
        resultadoLinha += " [Endereco = " + endereco + "]";
        resultadoLinha += " [Ingresso = " + dataIngresso + "]";
        resultadoLinha += " [Setor = " + setor + "]";
        return resultadoLinha;
    }
}