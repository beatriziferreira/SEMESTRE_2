package Semestre2.Unidade3Sem2;

public class Livro {
    private String titulo;
    private int ano;
    private Pessoa autor;

    public Livro(String titulo, int ano, Pessoa autor) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public Pessoa getAutor() {
        return autor;
    }
}
