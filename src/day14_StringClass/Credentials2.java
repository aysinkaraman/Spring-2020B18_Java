package day14_StringClass;
import java.util.Scanner;
public class Credentials2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your username");
        String scanUsername = scan.next();

        System.out.println("Enter your password");
        String scanPassword = scan.next();
        boolean logedIn = scanUsername.equals("Cybertek") && scanPassword.endsWith("cybertekschool");
        boolean InvalidUserName = !scanUsername.equals("Cybertek") && scanPassword.equals("cybertekschool");
        boolean InvalidPassword = scanUsername.equals("Cybertek") && !scanPassword.equals("cybertekschool");

        if (!scanUsername.isEmpty() && !scanPassword.isEmpty()) {
            if (logedIn) {
                System.out.println("Logged In");
            }else if(InvalidUserName) {
                System.out.println("Password is correct, username is incorrect");
        } else if ( InvalidPassword) {
                System.out.println("Username is correct, password is incorrect");
            } else {
                System.out.println("Both username and password are incorrect");
            } }








    }
}
