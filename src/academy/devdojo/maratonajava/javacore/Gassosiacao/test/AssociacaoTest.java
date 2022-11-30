package academy.devdojo.maratonajava.javacore.Gassosiacao.test;

import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunoParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar one piece", alunoParaSeminario, local);

        Seminario[]seminarioDisponiveis = {seminario};
        professor.setSeminarios(seminarioDisponiveis);
        professor.imprime();
    }
}
