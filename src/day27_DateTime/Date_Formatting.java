package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_Formatting {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM/dd/yy");
        LocalDate date2 = LocalDate.of(1999,12,25);
        String str1 = date2.format(dtf2);
        System.out.println(str1);

    }
}
