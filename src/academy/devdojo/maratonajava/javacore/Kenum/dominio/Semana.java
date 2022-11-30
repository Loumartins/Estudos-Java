package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Semana {
     public enum MateriasEstudadas {
        BIOLOGIA,
        MATEMATICA,
        HISTORIA,
        EDUCACAO_FISICA,
        FISICA,
        QUIMICA;
    }
    private String nome;
    private DiasSemana diasSemana;
    private MateriasEstudadas materiasEstudadas;

    public Semana(String nome, DiasSemana diasSemana, MateriasEstudadas materiasEstudadas) {
        this.nome = nome;
        this.diasSemana = diasSemana;
        this.materiasEstudadas = materiasEstudadas;
    }

    @Override
    public String toString() {
        return "Semana{" +
                "nome='" + nome + '\'' +
                ", diasSemana=" + diasSemana +
                ", materiasEstudadas=" + materiasEstudadas +
                '}';
    }
}
