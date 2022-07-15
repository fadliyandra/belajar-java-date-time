package demoprogrammerdatetime.now;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    @Test
    void create() {

        Period period1 = Period.ofDays(10);
        Period period2 = Period.ofWeeks(10);
        Period period3 = Period.ofMonths(10);
        Period period4 = Period.ofMonths(10);
        Period period5 = Period.ofYears(10);
        Period period6 = Period.of(10, 10, 10);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
        System.out.println(period6);

    }

    @Test
    void get() {
        Period period = Period.of(10,10,10);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }
    @Test
    void betwen() {
        Period period = Period.between(
                LocalDate.of(1993, 04, 27),
                LocalDate.now()
        );

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }

}
