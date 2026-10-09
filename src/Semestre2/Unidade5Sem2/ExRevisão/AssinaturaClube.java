package Semestre2.Unidade5Sem2.ExRevisão;

public class AssinaturaClube implements Cobravel{
    private Cliente cliente;
    private double valorMensal;
    private int meses;

    public AssinaturaClube(Cliente cliente, double valorMensal, int meses){
        this.cliente = cliente;
        this.valorMensal = valorMensal;
        this.meses = meses;
        if (this.cliente == null){
            throw new IllegalArgumentException("O cliente não pode ser nulo.");
        }
        if (this.valorMensal <= 0){
            throw new IllegalArgumentException("O valor mensal deve ser maior ou igual a 0.");
        }
        if (this.meses <= 0){
            throw new IllegalArgumentException("Mínimo de 1 mês permitido.");
        }
    }

    public Cliente getCliente() {
        return cliente;
    }
    public double getValorMensal() {
        return valorMensal;
    }
    public int getMeses() {
        return meses;
    }

    @Override
    public double calcularValorCobrar() {
        if (meses >= 12){
            double desconto = (valorMensal * meses / 100) * 15;
            return (valorMensal * meses) - desconto;
        }
        return valorMensal * meses;
    }

    
}
