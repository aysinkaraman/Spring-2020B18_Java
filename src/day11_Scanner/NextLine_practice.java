package day11_Scanner;
import java.util.Scanner;
public class NextLine_practice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your age is: " +age);
        input.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();



    }
}
