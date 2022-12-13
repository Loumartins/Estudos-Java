package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest03 {
    public static void main(String[] args) {
        //Utilização do NumberFormat para transformação em porcentagem
        double number = 0.25;
        Locale locale = new Locale("en", "US");
        NumberFormat percentFormatter = NumberFormat.getPercentInstance(locale);
        String formattedPercenter = percentFormatter.format(number);
        System.out.println(formattedPercenter);

        //Utilização do NumberFormat para transformação em decimal
        NumberFormat decimalFormatter = NumberFormat.getNumberInstance(locale);
        String formattedDecimal = decimalFormatter.format(number);
        System.out.println(formattedDecimal);

        //Utilização do NumberFormat para transformação em inteiro.
        NumberFormat integerFormatter = NumberFormat.getIntegerInstance(locale);
        String formattedInteger = integerFormatter.format(number);
        System.out.println(formattedInteger);
    }
}
