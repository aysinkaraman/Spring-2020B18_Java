package day05_Unary_ShorthandOperators;

public class leapYear {
    public static void main(String[] args) {

        /*
         1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020
        output:
            2020 is leap year: true
         */
        //short year = 2020;
        short year = 2025;
        // leapyear: year % 4 == 0
        boolean leapYear = year % 4 == 0;
        //System.out.println(year + " is leap year: " + leapYear);
String result = year + " is leap year: " + leapYear;
        System.out.println(result);



    }
}
