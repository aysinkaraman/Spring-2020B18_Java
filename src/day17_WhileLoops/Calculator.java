package day17_WhileLoops;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i >- 12; ) {
            System.out.println("Enter first number");
            int num1 = input.nextInt();
            System.out.println("Enter second number");
            int num2 = input.nextInt();
            System.out.println("Math operator: ");
            String operator = input.next();
            if (operator.equals("+")) {
                System.out.println("Addition is: " + (num1 + num2));
            } else if (operator.equals("-")) {
                System.out.println("Subtraction is: " + (num1 - num2));
            } else if (operator.equals("*")) {
                System.out.println("Multiplication is : " + (num1 * num2));
            } else if (operator.equals("/")) {
                System.out.println("Division is: " + (num1 + num2));
            } else if (operator.equals("%")) {
                System.out.println("Remainder is: " + (num1 % num2));
            } else {
                System.out.println("Invalid Operator");
            }
            System.out.println("Do you want to contunie?");
            String answer = input.next();
            if (answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using the calculator");
                break;
            }
        }
    }
}
