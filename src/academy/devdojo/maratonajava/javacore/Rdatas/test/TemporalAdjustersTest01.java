package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withDayOfMonth(20);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now=LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now=LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now=LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now=LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now=LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
