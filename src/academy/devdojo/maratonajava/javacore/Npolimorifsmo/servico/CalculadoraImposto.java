package academy.devdojo.maratonajava.javacore.Npolimorifsmo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorifsmo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorifsmo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorifsmo.dominio.Tomate;

public class CalculadoraImposto {

    /* public static void calcularImpostoComputador(Computador computador) {
    double imposto = computador.calcularImposto();
    System.out.println("Computador " + computador.getNome());
    System.out.println("Valor " + computador.getValor());
    System.out.println("Imposto a ser pago " imposto);
    }
    */

    /* public static void calcularImpostoTomate(Tomate tomate) {
    double imposto = tomate.calcularImposto();
    System.out.println("Tomate " + tomate.getNome());
    System.out.println("Valor " + tomate.getValor());
    System.out.println("Imposto a ser pago " imposto);
    }
  */

 //Refatoração de codigo dos metodos calcularImpostoTomate e calcularImpostoComputador
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Valor do produto: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        // Integrando o cast e instanceOf para chamar o atributo dataValidade do objeto tomate
        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}
