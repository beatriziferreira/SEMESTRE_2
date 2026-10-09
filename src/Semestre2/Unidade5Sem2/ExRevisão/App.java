package Semestre2.Unidade5Sem2.ExRevisão;

public class App {
    public static void main(String[] args) {
        Cobravel c1 = new Cobravel() {
            @Override
            public double calcularValorCobrar() {
                return 1;
            }
        };
        Cobravel c2 = new Cobravel() {
            @Override
            public double calcularValorCobrar() {
                return 2;
            }
        };
        
        CentralCobranca central = new CentralCobranca();
        central.registrar(c1);
        central.registrar(c2);
        System.out.println(central.getTotalCobrancas());
    }
}
