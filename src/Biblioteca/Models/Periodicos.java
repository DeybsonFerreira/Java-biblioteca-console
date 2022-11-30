package Biblioteca.Models;

public class Periodicos {

    private int codigo;
    private String autor, titulo, editora, tipo, issn;
    private float fatorImpacto;

    public Periodicos() {
        super();
        this.codigo = 0;
        this.autor = "";
        this.titulo = "";
        this.editora = "";
        this.tipo = "";
        this.issn = "";
        this.fatorImpacto = 0F;
    }

    public Periodicos(int codigo, String autor, String titulo, String editora,
            String tipo, String issn, float fatorImpacto) {
        super();
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.tipo = tipo;
        this.issn = issn;
        this.fatorImpacto = fatorImpacto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getFatorImpacto() {
        return fatorImpacto;
    }

    public void setFatorImpacto(float fatorImpacto) {
        this.fatorImpacto = fatorImpacto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        // unica linha de resultados (com cabeçalho)
        String resultadoLinha = "[Cod = " + codigo + "]";
        resultadoLinha += " - [Autor = " + autor + "]";
        resultadoLinha += " - [Titulo = " + titulo + "]";
        resultadoLinha += " - [Editora = " + editora + "]";
        resultadoLinha += " - [Tipo = " + tipo + "]";
        resultadoLinha += " - [ISSN = " + issn + "]";
        resultadoLinha += " - [fatorImpacto = R$" + fatorImpacto + "]";

        return resultadoLinha;
    }
}