package day20_ArrayContinue;
import java.util.Scanner;
public class Months {
    public static void main(String[] args) {
        String [] month ={"Jan", "FEb", "Mar", "Apr","May","Jun", "Jul","Aug", "Sep","Oct","Nov","Dec"};
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int attempts = 1;

       while (num > 12 || num <= 0){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num = input.nextInt();
            attempts++;
            if (attempts == 3 && (num > 12 || num <= 0)){
                System.out.println("Invalid Entry");
                System.exit(0);
            }
        }
        String result = month[num-1];

        System.out.println(result);























    }
}
