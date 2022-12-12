package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "           Luiz";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        //verificação de tamanho de uma string
        System.out.println(nome.length());
        //Metodo de troca de caracteres da primeira posição
        System.out.println(nome.replace("z", "h"));
        //Metodo para todos os caracteres ficarem minusculos
        System.out.println(nome.toLowerCase());
        //Metodo para todos os caracteres ficarem maiusculos
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.substring(0,4));
        //Metodo trim remove os valores em brancos que temos no começo e no fim
        System.out.println(nome.trim());
        }
}
