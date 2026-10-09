package Semestre2.Unidade4Sem2.Exemplo;

public class VeiculoAereo extends Veiculo {

    public VeiculoAereo() {
        super(0);
    }

    @Override
    public String toString() {
        return "Veiculo áereo -> " + super.toString();
    }
}
