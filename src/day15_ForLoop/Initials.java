package day15_ForLoop;
/* 1. write a program that asks user's first and last name, then prints out of the user
Ex:
input: cybertek
       batch18
       output: Your initals is : CB
 */
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        /* String initials = firstName.substring(0,1) + lastName.substring(0,1);
         */
        String initials = "" + firstName.charAt(0)+ lastName.charAt(0);
        initials = initials.toUpperCase();
        System.out.println(initials);

    }
}
