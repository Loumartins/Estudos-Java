package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto p = new Produto("notebook", 4, 3000);
        p.calculaImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
