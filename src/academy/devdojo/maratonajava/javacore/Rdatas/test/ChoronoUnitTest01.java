package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChoronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1996, Month.APRIL, 8, 12,0,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario,now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario,now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario,now));
        System.out.println(ChronoUnit.YEARS.between(aniversario,now));
    }
}

