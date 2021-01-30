package Java_PP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Zad17 {
    public static void main(String[] args) throws ParseException {
        LocalDate dateLesson = LocalDate.of(2021, 02, 06);
        LocalDate today = LocalDate.now();

        Period diff = Period.between(today, dateLesson );
        long p2 = ChronoUnit.DAYS.between(today, dateLesson);
        System.out.println(p2);

    }
}
