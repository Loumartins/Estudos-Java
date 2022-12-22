package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        LocalDate agoraDepois2Anos = LocalDate.now().plusYears(2).plusDays(7);
        Period  p1 = Period.between(agora, agoraDepois2Anos);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
