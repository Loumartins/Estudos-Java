package academy.devdojo.maratonajava.javacore.Npolimorifsmo.test;

import academy.devdojo.maratonajava.javacore.Npolimorifsmo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorifsmo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorifsmo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorifsmo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
