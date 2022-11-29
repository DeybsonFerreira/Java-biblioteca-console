package Biblioteca.Models;

public class Alunos {
    private int matricula;
    private String nome, endereco, curso, dataIngresso;
    private float multa;

    public Alunos() {
        super();
        this.matricula = 0;
        this.nome = "";
        this.endereco = "";
        this.curso = "";
        this.dataIngresso = "";
        this.multa = 0;
    }

    public Alunos(int matricula, String nome, String endereco, String curso, String dataIngresso, Float multa) {
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.curso = curso;
        this.dataIngresso = dataIngresso;
        this.multa = multa;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(String dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        // unica linha de resultados (com cabeçalho)
        String resultadoLinha = "[Matricula = " + matricula + "]";
        resultadoLinha += " - [Nome = " + nome + "]";
        resultadoLinha += " - [Endereco = " + endereco + "]";
        resultadoLinha += " - [Curso = " + curso + "]";
        resultadoLinha += " - [Ingresso = " + dataIngresso + "]";
        resultadoLinha += " - [Multa = " + multa + "]";
        return resultadoLinha;
    }
}