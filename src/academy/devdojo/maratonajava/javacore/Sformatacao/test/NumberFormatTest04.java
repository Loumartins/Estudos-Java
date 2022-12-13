package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest04 {
    public static void main(String[] args) {
        //Utilização do NumberFormat para internacionalização de Moeda
        double amount = 42343.343;
        Locale locale1 = new Locale("en", "US");
        NumberFormat currecyFormatted = NumberFormat.getCurrencyInstance(locale1);
        String formattedCurrency = currecyFormatted.format(amount);
        System.out.println(formattedCurrency);
    }
}
