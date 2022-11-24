package Biblioteca.Models;
//<codigo>;<autor(es)>;<titulo>;<editora>;<tipo>;<ano de publicação>;<issn>

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

    public Livro(int codigo, String autor, String titulo, String editora, String anoPublicado,
            String issn, String tipo) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.anoPublicado = anoPublicado;
        this.issn = issn;
        this.tipo = tipo;
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
        this.titulo = tipo;
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
        return "Livro [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", editora=" + editora
                + ", anoPublicado=" + anoPublicado + ", issn=" + issn + "]";
    }

}
