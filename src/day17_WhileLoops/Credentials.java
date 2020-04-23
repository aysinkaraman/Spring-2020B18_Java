package day17_WhileLoops;
import java.util.Scanner;
public class Credentials {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter user name");
        String username = scan.next();
        int count = 1;

        System.out.println("Enter Password");
        String password = scan.next();
        boolean valid = username.equals("cybertek") && password.equals("cybertek123");
        while( !valid) {
            System.out.println("Please re-enter your credentials");
            System.out.println("Enter username");
            username = scan.next();
            System.out.println("enter password");
            password = scan.next();
            valid = (username.equals("cybertek") && password.equals("cybertek123"));
            count++;
            if (count == 3 && !valid) {
                System.out.println("your account is locked");
                break;
            }

        }
        if (valid) {
            System.out.println("Logged in");
        }
    }
}
