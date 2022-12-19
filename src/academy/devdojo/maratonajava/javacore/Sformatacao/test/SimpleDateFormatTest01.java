package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        Date agora = new Date();

        String formattedSdf = sdf.format(agora);
        System.out.println(formattedSdf);
    }
}
