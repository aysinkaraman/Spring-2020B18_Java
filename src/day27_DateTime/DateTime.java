package day27_DateTime;
import java.time.LocalDate;
public class DateTime {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020,10,25);
        System.out.println(date1);
        LocalDate birthday = LocalDate.of(1992,9,29);
        System.out.println(birthday);
       boolean result1 =  date1.isAfter(birthday);
        System.out.println(result1);
        boolean result2 = birthday.isBefore(date1);
        System.out.println(result2);
        boolean result3 = birthday.isEqual(date1);
        System.out.println(result3);
        boolean result4 = birthday.isLeapYear();
        System.out.println(result4);
        System.out.println("==================================================");
        LocalDate now = LocalDate.now();
        System.out.println(now + " <3");





























    }

}
