package day24_Methods;
import sun.plugin2.main.client.Plugin2EventListener;

import java.util.*;
public class WarmUp {
    public static void Max (int num1, int num2){
        if (num1>= num2){
            System.out.println("Maximum number is: " +num1);
        } else {
            System.out.println("Maximum number is: " + num2);
        }
    }
    public static void calculation(double num1, double num2, char operator){
        switch(operator){
            case '+':
                System.out.println(num1 + num2);
              break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
               break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
public static void palindrome (String str){
        String reversed = "";
        for ( int i = str.length()-1; i >= 0; i-- ){
            reversed += str.charAt(i);
        }
    System.out.println(str.equalsIgnoreCase(reversed));

}
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Max(a,b);
        calculation(10,20,'*');
        calculation(300, 400, '+');
        int n1 = 10000;
        int n2 = 100;
        calculation(n1,n2,'/');
        palindrome("level");
       while (true) {

           Scanner scan = new Scanner(System.in);
           System.out.println("Enter num1: ");
           int num1 = scan.nextInt();
           System.out.println("Enter num2: ");
           int num2 = scan.nextInt();
           System.out.println("Enter operator: ");
           char operator = scan.next().charAt(0);
           calculation(num1, num2, operator);
           System.out.println("Do you want to continue?");
           String answer = scan.next();
           while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
               System.out.println("Invalid Entry, Please re-enter");
               System.out.println("Do you want to continue");
               answer = scan.next();
           }
           if (answer.equalsIgnoreCase("no")){
               break;
           }
       }













    }

}