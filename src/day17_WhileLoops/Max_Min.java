package day17_WhileLoops;
import sun.security.x509.InvalidityDateExtension;

import java.util.Scanner;
public class Max_Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int maxNumber = -999999999;
        for (int i = 1; i <= 5; i++ ){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if (num > maxNumber)
                maxNumber = num;
        }
        System.out.println(maxNumber);
    int minNumber = 999999999;
    for (int i = 1; i <=5; i++ ) {
        System.out.println("enter a number");
        int num2 = scan.nextInt();
        if (num2 < minNumber) {
            minNumber = num2;
        }
    }
        System.out.println(minNumber);
        }
    }
















