package demoprogrammerdatetime.now;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneTest {
    @Test
    void create() {
        var date1 = new Date();
        var date2 = new Date(System.currentTimeMillis());
        var date3 = new Date(339958800000L);

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);


    }

    @Test
    void date() {
        Date date = new Date();
        System.out.println(date.toString());
    }

    @Test
    void calender() {
        Calendar calendarJakarta = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta"));
        Calendar calendarGMT = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        System.out.println(calendarJakarta.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendarGMT.get(Calendar.HOUR_OF_DAY));

        calendarJakarta.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(calendarJakarta.get(Calendar.HOUR_OF_DAY));
    }
}
