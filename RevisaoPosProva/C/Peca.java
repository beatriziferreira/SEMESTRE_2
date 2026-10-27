package RevisaoPosProva.C;

public class Peca extends ItemSetup implements ComGarantia{

    private int quantidade;

    public Peca(String descricao, double precoBase, int quantidade) {
        super(descricao,  precoBase);
        this.quantidade = quantidade;
        if(this.quantidade <= 0){
            throw new IllegalArgumentException("Quantidade inválida.");
        }
    }

    @Override
    public double calcularGarantiaExtendida() {
        return calcularPreco() * 0.15;
    }

    @Override
    public double calcularPreco() {
        if (quantidade >= 3){
            return getPrecoBase() * quantidade * 0.9;
        }
        return getPrecoBase() * quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    
}
