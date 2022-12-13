package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        //Formatação de uma moeda local utilizando Locale
        // Locale PT-BR
        double amount = 123232.32;
        Locale locale1 = new Locale("pt", "BR");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale1);
        String formattedAmount = currencyFormat.format(amount);
        System.out.println(formattedAmount);
        //Locale Japan
        double amount2 = 243423.55;
        Locale locale2 = Locale.JAPAN;
        NumberFormat currencyFormatJP = NumberFormat.getCurrencyInstance(locale2);
        String formattedAmountJP = currencyFormatJP.format(amount2);
        System.out.println(formattedAmountJP);
    }
}
