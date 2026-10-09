package Semestre2.Unidade3Sem2;

public class Pessoa {
    private String nome;
    private String email;
    private Livro obra;

    public Pessoa(String nome, String email, Livro obra) {
        this.nome = nome;
        this.email = email;
        this.obra = obra;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Livro getObra() {
        return obra;
    }

    public void setObra(Livro obra) {
        this.obra = obra;
    }
}
