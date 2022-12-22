package academy.devdojo.maratonajava.javacore.Rdatas.test;

import academy.devdojo.maratonajava.javacore.Gassosiacao.dominio.Local;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

class ObterProximoDiaUtil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek){
            // No exercicio, os dias uteis são de Segunda - Feira à Quinta - Feira
            case THURSDAY: addDays = 4; break;
            case FRIDAY : addDays = 3;break;
            case SATURDAY: addDays = 2;break;
            default: addDays=1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}

public class TemporalAdjustersTest02 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(10).with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
