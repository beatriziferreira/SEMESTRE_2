package Semestre2.Unidade4Sem2.Exemplo;

public class VeiculoMaritimo extends Veiculo{
    public VeiculoMaritimo(double preco) {
        super(preco);
    }

    @Override
    public String toString() {
        return "Veiculo marítimo -> " + super.toString();
    }
}