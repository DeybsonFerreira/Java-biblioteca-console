package Biblioteca.Models;

public class Emprestimo {

    private long codigo, matriculaCliente, matriculaFuncionario;

    private String dataEmprestimo, dataDevolucao;

    public Emprestimo(
            long codigo, long matriculaCliente, long matriculaFuncionario, String dataEmprestimo,
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

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public long getMatriculaCliente() {
        return matriculaCliente;
    }

    public void setMatriculaCliente(long matriculaCliente) {
        this.matriculaCliente = matriculaCliente;
    }

    public long getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(long matriculaFuncionario) {
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
