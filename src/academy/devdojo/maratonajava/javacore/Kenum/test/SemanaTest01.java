package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.DiasSemana;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Semana;

public class SemanaTest01 {
    public static void main(String[] args) {
     Semana semana = new Semana("Luiz Henrique Martins", DiasSemana.SEGUNDA_FEIRA, Semana.MateriasEstudadas.BIOLOGIA);
     Semana semana1 = new Semana("Gabriela dos Santos Barbosa", DiasSemana.QUARTA_FEIRA, Semana.MateriasEstudadas.EDUCACAO_FISICA);
        System.out.println(semana);
        System.out.println(semana1);
    }
}
