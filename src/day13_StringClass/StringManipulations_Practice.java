package day13_StringClass;
import java.util.Scanner;
public class StringManipulations_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") +1 );
        System.out.println(firstName);
        System.out.println(lastName);





    }
}
