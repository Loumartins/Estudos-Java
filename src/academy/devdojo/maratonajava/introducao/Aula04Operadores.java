package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //Operadores Aritmeticos
        int numero01 = 10;
        int numero02 = 20;
        int soma = numero01 + numero02;
        System.out.println(numero02+numero01);
        System.out.println(soma);


        int resto = 20 % 2;
        System.out.println(resto);


        // Operadores Relacionais
        int idade = 35;
        double salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = (idade >= 30) && (salario >= 4612);
        boolean isDentroDaLeiMenorQueTrinta = (idade < 30) && (salario >= 3381);


        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+  isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorPlaystation = 5000;

        boolean isPlaystantionCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >=valorPlaystation;
        System.out.println("isPlaystantionCincoCompravel " + isPlaystantionCincoCompravel);

        //Operadores de Atribuição

        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);

        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);

    }
}
// % - Operador comumente utilizado nas verificações se o numero é par ou nao!
// Operadores relacionais --- <> (maior ou menor) // <= (menor ou igual) >= (maior ou igual) // == (comparação) // !=(diferente)
// && (AND)
// || (or)
// ! (not)
// Os operadores de atribuição são : += = -= *=