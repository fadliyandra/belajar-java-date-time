package demoprogrammerdatetime.now;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

public class DayOfWeeTest {
    @Test
    void create() {

        DayOfWeek dayOfWeek1 = DayOfWeek.SUNDAY;
        DayOfWeek dayOfWeek2 = dayOfWeek1.plus(7);
        DayOfWeek dayOfWeek3 = dayOfWeek1.minus(7);

        System.out.println(dayOfWeek1);
        System.out.println(dayOfWeek2);
        System.out.println(dayOfWeek3);

    }
}
