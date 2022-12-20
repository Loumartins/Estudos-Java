package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        //Transformando uma string em uma data e em um hórario
        LocalDate date = LocalDate.parse("1996-08-04");
        LocalTime time = LocalTime.parse("19:31:45");
        System.out.println(date);
        System.out.println(time);
        //Realizando a "junção" entre o local date e o local time
        LocalDateTime dt1 = date.atTime(time);
        LocalDateTime td2 = time.atDate(date);
        System.out.println(dt1);
        System.out.println(td2);

        System.out.println(localDateTime);

    }
}
