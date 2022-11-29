package Biblioteca.Models;

public class Livro {
    private int codigo;
    private String autor, titulo, editora, anoPublicado, issn, tipo;

    public Livro() {
        super();
        this.codigo = 0;
        this.autor = "";
        this.titulo = "";
        this.editora = "";
        this.anoPublicado = "";
        this.issn = "";
        this.tipo = "";
    }

    public Livro(int codigo, String autor, String titulo, String editora,
            String anoPublicado, String issn, String tipo) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.issn = issn;
        this.tipo = tipo;
        this.anoPublicado = anoPublicado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditora() {
        return editora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(String anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    @Override
    public String toString() {
        // unica linha de resultados (com cabeçalho)
        String resultadoLinha = "[Cod = " + codigo + "]";
        resultadoLinha += " - [Autor = " + autor + "]";
        resultadoLinha += " - [Titulo = " + titulo + "]";
        resultadoLinha += " - [Editora = " + editora + "]";
        resultadoLinha += " - [Tipo = " + tipo + "]";
        resultadoLinha += " - [Ano = " + anoPublicado + "]";
        resultadoLinha += " - [ISSN = " + issn + "]";

        return resultadoLinha;
    }

}
