package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        //Trazendo a zona que o sistema operacional se encontra
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        //Usando o LocalDateTime para realizar a troca do horario para uma outra zona
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        //Utilizando com outras classes
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        //zoneOffSet deixa voce trabalhar com as zonas porem utilizando os horarios.
        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        //criando uma zone para Manaus
        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offSetManaus);
        System.out.println(offsetDateTime);

        //utilizando o instant
        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(offSetManaus);
        System.out.println(offsetDateTime2);
    }
}
