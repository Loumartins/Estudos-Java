package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.Cachorro;

public class AnimalTest01 {
    public static void main(String[] args) {
        Cachorro cao = new Cachorro("Orfeu",4,"SRD");
        System.out.println(cao);
        cao.andar();

    }
}
