package RevisaoPosProva.A2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Midia f = new Filme("Interestelar", 20.0);
        Midia s = new Serie("Dark", 15.0, 3);
        Midia d = new Documentario("Pre-historic Planet", 15.0);
        ArrayList<Midia> catalogo = new ArrayList<>();
        catalogo.add(f);
        catalogo.add(s);
        catalogo.add(d);
        double totalLegenda = 0;
        for (Midia m : catalogo) {
            if (m instanceof Legendavel) {
                totalLegenda += ((Legendavel) m).calcularPrecoLegenda();
            }
        }

        System.out.println(totalLegenda);

    }
}
