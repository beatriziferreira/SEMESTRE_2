package Semestre2.Unidade4Sem2.Exemplo;

public class VeiculoTerrestre extends Veiculo{
    public VeiculoTerrestre(int ano, String marca, String modelo, double preco) {
        super(preco);
        setAno(ano);
        setMarca(marca);
        setModelo(modelo);
    }

    @Override
    public String toString() {
        return "Veiculo terrestre -> " + super.toString();
    }
}