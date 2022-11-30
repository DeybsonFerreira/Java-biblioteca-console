package Biblioteca.Models;

public class Emprestimo {

    private int codigo, matriculaCliente, matriculaFuncionario;

    private String dataEmprestimo, dataDevolucao;

    public Emprestimo(
            int codigo, int matriculaCliente, int matriculaFuncionario, String dataEmprestimo,
            String dataDevolucao) {
        super();
        this.codigo = codigo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.matriculaCliente = matriculaCliente;
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public Emprestimo() {
        super();
        this.codigo = 0;
        this.matriculaFuncionario = 0;
        this.matriculaCliente = 0;
        this.dataEmprestimo = "";
        this.dataDevolucao = "";
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMatriculaCliente() {
        return matriculaCliente;
    }

    public void setMatriculaCliente(int matriculaCliente) {
        this.matriculaCliente = matriculaCliente;
    }

    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(int matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    @Override
    public String toString() {
        var resultadoLinha = "[Cod = " + codigo + "]";
        resultadoLinha += " - [Matric. Cliente = " + matriculaCliente + "]";
        resultadoLinha += " - [Matric. Func = " + matriculaFuncionario + "]";
        resultadoLinha += " - [Data Empres. = " + dataEmprestimo + "]";
        resultadoLinha += " - [Data Devol = " + dataDevolucao + "]";

        return resultadoLinha;
    }
}
