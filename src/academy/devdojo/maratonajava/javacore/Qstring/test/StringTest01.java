package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        //Strings são imutáveis!!
        String nome = "William"; // String constant pool
        String nome2 = "William";
        nome = nome.concat(" Suane");
        System.out.println(nome == nome2);

    }
}
