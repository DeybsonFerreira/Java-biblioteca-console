package Biblioteca.Models;

public class Funcionario {
    private int matricula;
    private String nome, endereco, setor, dataIngresso, senha, login;

    public Funcionario() {
        super();
        this.matricula = 0;
        this.nome = "";
        this.endereco = "";
        this.setor = "";
        this.dataIngresso = "";
        this.senha = "";
        this.login = "";
    }

    public Funcionario(int matricula, String nome, String endereco, String setor, String dataIngresso, String senha,
            String login) {
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.setor = setor;
        this.dataIngresso = dataIngresso;
        this.senha = senha;
        this.login = login;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
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
        resultadoLinha += " - [Ingresso = " + dataIngresso + "]";
        resultadoLinha += " - [Setor = " + setor + "]";
        resultadoLinha += " - [Senha = " + senha + "]";
        resultadoLinha += " - [Login = " + login + "]";
        return resultadoLinha;
    }
}