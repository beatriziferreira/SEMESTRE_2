package Semestre2.Unidade4Sem2.Exemplo;

public class MotoEletrica extends VeiculoTerrestre {
    
    public MotoEletrica(int ano, double preco) {
        super(ano, "Genérica", "Padrão", preco);
    }

    @Override
    public String toString() {
        return "Veiculo terrestre -> " + super.toString() + " (Moto elétrica)";
    }
}
