package academy.devdojo.maratonajava.javacore.Npolimorifsmo.test;

import academy.devdojo.maratonajava.javacore.Npolimorifsmo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorifsmo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorifsmo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorifsmo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11000);
        Tomate tomate = new Tomate("Siciliano", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 3000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
