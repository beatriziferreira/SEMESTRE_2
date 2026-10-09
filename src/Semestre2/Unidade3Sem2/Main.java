package Semestre2.Unidade3Sem2;

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.setNome("André");
        
        Professor prof2 = new Professor();
        prof2.setNome("Aurélio");
        prof2.setCoordenador(prof1);
        
        System.out.println("Nome do professor 2: " + prof2.getNome());
        System.out.println("Coordenador do professor 2: " + prof2.getCoordenador().getNome());

        prof1.addSubordinado(prof2);
        Professor prof3 = new Professor();
        prof3.setNome("Beatriz");
        System.out.println("Nome do professor 3 " + prof3.getNome());

        prof1.addSubordinado(prof3);
        System.out.println("Subordinados do professor 1: ");

      //for (int i = 0 ; i < prof1.getSubordinados().size(); i++) {
        //  System.out.println("- " + prof1.getSubordinados().get(i).getNome());}
        

        //Mesmo código usando for each (mais simples)
        for (Professor prof : prof1.getSubordinados()) {
            System.out.println("- " + prof.getNome());
        }
    }
}
