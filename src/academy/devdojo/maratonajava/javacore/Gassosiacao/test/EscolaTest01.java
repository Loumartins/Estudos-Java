package academy.devdojo.maratonajava.javacore.Gassosiacao.test;

import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya Sensei");
        Professor[] professores = {professor};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
