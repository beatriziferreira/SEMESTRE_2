package Semestre2.Unidade3Sem2;
import java.util.ArrayList;
public class Professor {
    // Exemplo de associação refletida: um professor pode ter um coordenador (outro professor) e também pode ter subordinados (outros professores).
    private String nome;
    private Professor coordenador;
    private ArrayList<Professor> subordinados = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Professor getCoordenador() {
        return coordenador;
    }
    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }
    public void addSubordinado(Professor subordinado) {
        subordinado.setCoordenador(coordenador);
        subordinados.add(subordinado);
    }
    public ArrayList<Professor> getSubordinados() {
        return subordinados;
    }
    public void removeSubordinado(Professor subordinado) {
        subordinados.remove(subordinado);
    }
}
