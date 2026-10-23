package RevisaoPosProva.A1;

public class App {
    public static void main(String[] args) {
        System.out.println("Emitidas: " + Senha.getTotalEmitidas());
        Senha s1 = new Senha("Caixa");
        Senha s2 = new Senha("Gerência");
        Senha s3 = new Senha("Caixa");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        try {
            Senha s4 = new Senha(null);
            s4.getNumero();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        }

        Senha s4 = new Senha("Caixa");
        System.out.println(s4.toString());
        System.out.println("Emitidas: " + Senha.getTotalEmitidas());

    }
}