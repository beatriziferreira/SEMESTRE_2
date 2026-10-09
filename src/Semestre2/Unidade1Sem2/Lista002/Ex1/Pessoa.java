package Semestre2.Unidade1Sem2.Lista002.Ex1;
public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    double calcularImc() {
        return peso / (altura * altura);
    }

    void exibirImc() {
        double imc = calcularImc();
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + String.format("%.2f", imc));
    }

}