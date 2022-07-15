package demoprogrammerdatetime.now;

import org.junit.jupiter.api.Test;
import org.springframework.format.datetime.DateFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterTest {
    @Test
    void parsing() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy MM dd");


        LocalDate localDate = LocalDate.parse("2020-10-25");
        System.out.println(localDate);

    }
    @Test
    void format() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy MM dd");


        LocalDate localDate = LocalDate.parse("2020-10-25");
        String format = localDate.format(formatter);
        System.out.println(format);

    }
    @Test
    void defaultFormatter() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy MM dd");


        LocalDate localDate = LocalDate.parse("2020-10-25");
        String format = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format);


    }

    @Test
    void i18n() {
        Locale locale = new Locale("in","id");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

        LocalDate localDate = LocalDate.now();
        String format = localDate.format(formatter);
        System.out.println(format);

    }
}
