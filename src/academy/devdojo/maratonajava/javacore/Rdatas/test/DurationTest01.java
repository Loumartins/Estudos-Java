package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime agoraDepois2Anos = LocalDateTime.now().plusYears(2);
        Duration d1 = Duration.between(agora,agoraDepois2Anos);
        System.out.println(d1);
        Duration d2 = Duration.ofDays(20);
        System.out.println(d2);

    }
}
