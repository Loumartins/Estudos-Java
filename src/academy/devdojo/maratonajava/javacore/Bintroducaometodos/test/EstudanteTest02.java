package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Luiz";
        estudante01.idade = 20;
        estudante01.sexo = 'M';

        estudante01.imprime();

        estudante02.nome="Gabriela Barbosa";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        estudante02.imprime();

    }
}
