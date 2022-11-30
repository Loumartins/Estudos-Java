package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();
        carro.nome = "Corolla";
        carro.modelo = "Sedan";
        carro.ano = 2022;
        carro1.nome = "Ford Fiesta";
        carro1.modelo = "Hatch";
        carro1.ano = 2022;
        System.out.println("O primeiro carro tem nome de: " + carro.nome + " o modelo dele é: "
        + carro.modelo + " o ano dele é: " + carro.ano);
        System.out.println("O segundo carro tem nome de: " + carro1.nome + " o modelo dele é: "
                + carro1.modelo + " o ano dele é: " + carro1.ano);
    }
}
