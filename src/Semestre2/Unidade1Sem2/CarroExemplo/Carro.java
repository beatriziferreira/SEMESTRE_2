package Semestre2.Unidade1Sem2.CarroExemplo;

public class Carro {

    String marca;
    String modelo;
    int ano;
    String cor;
    int velocidadeAtual;
    boolean ligado;

    void acelerar() {
        velocidadeAtual = velocidadeAtual + 10;
        // Tem o mesmo efeito da linha acima
        // velocidadeAtual += 10;
    }

    void freiar() {
        velocidadeAtual = velocidadeAtual - 10;
    }

    boolean situacaoAtual() {
        return ligado;
    }

    void ligar(boolean ligar) {
        ligado = true;
    }

    void desligar(boolean desligar) {
        ligado = desligar;
    }

}
