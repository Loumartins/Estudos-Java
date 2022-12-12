package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Luiz Henrique Martins";
        nome.concat(" DevDojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Luiz Henrique Martins");
        sb.append(" DevDojo");
        System.out.println(sb.toString());
    }
}
