package demoprogrammerdatetime.now;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.CalendarConversion;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalenderTest {
    @Test
    void create() {

        Calendar calendar = Calendar.getInstance();

        Date date = calendar.getTime();
        System.out.println(date);


        System.out.println(calendar);
    }
    @Test
    void modifyCalender() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,1980);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 10);
        calendar.set(Calendar.HOUR_OF_DAY, 15);
        calendar.set(Calendar.MINUTE, 50);
        calendar.set(Calendar.SECOND, 30);
        calendar.set(Calendar.MILLISECOND, 100);

        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println(date.getTime());

    }
    @Test
    void getCalender() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.MILLISECOND));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

    }

    @Test
     void createe() {

        TimeZone timeZoneDefault = TimeZone.getDefault();
        System.out.println(timeZoneDefault);

    }
}
