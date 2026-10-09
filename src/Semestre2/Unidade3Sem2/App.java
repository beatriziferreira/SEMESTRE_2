package Semestre2.Unidade3Sem2;

public class App {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("João", "joao@email.com", null);
        Livro livro = new Livro("Programação Orientada a Objetos", 2021, pessoa);
        pessoa.setObra(livro);
        
        


        


    }

}
