package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class Carro01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280) ;
        Carro c2 = new Carro("Mercedes", 275) ;
        Carro c3 = new Carro("Audi", 290) ;

        Carro.setVelocidadeLimite(180);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
// Modificadores de acesso estático vao fazer o atributo pertencer a classe, ou seja todos os objetos vao ser
// modificados com o mesmo valor.

/*
Pq metodos estaticos nao podem acessar variaveis de instancia??
    pq quando utilizamos estaticos existe a possibilidade de nao existir um objeto em memoria, logo caso nao tenha
    objeto em memoria como voce iria pegar uma variavel que so pode existir em memoria!?
 */

/*
Quando é recomendado utilizar o metodo estatico ou nao estatico??
    Quando os metodos nao acessam uma variavel, um atributo da instancia
 */