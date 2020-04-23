package NestedLoop;
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter a number");
        int num = scan.nextInt();
        int result = 1;
        while (num>=1) {
           result = result * num;
           num--;
        }
        System.out.println(result);
    }
}
