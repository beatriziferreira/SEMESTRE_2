package Semestre2.Unidade4Sem2.Exemplo;

public class Veiculo {
    private int ano;
    private String marca;
    private String modelo;
    private double preco;

    public Veiculo (double preco) {
        this.preco = preco;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPreco() {
        return preco;
    }

    @Override // Altera o comportamento do método toString() da classe Object, que é a superclasse de todas as classes Java.
    public String toString() {
        return "Veiculo [ano = " + ano + ", marca = " + marca + ", modelo = " + modelo + "]";
    }

   

}
