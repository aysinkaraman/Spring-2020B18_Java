package day11_Scanner;
import java.util.Scanner;
public class SumofFiveNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();
        double num5 = scan.nextDouble();
        double sum = 0;
        if (num1 > 0) {
            sum += num1;
        }
        if (num2 > 0) {
            sum += num2;
        }
        if (num3 > 0) {
            sum += num3;
        }
        if (num4 > 0) {
            sum += num4;
        }
        if (num5 > 0) {
            sum += num5;
        }
        System.out.println(sum);



    }
}
