package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[0-9]{3}-[0-9]{3}-[0-9]{4}");
        Matcher matcher = pattern.matcher("123-456-7890");
        if(matcher.matches()){
            System.out.println("A string é um numero de telefone valido nos Estados Unidos ");
        } else
            System.out.println("A string não é um numero de telefone valido nos Estados Unidos");
    }
}
