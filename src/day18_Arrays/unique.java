package day18_Arrays;
import java.util.Scanner;
public class unique {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter a word");
        String str = input.next();

        String result = "";

        for (int j = 0; j <=str.length()-1; j++){
char ch2 = str.charAt(j);

        int count = 0;
        for (int i = 0; i <= str.length()-1; i++){
            char ch = str.charAt(i);
            if (ch ==ch2){
                count++;
            }
        }
        if(count == 1){
            result+=ch2;
        }

        System.out.println(count);
        System.out.println(result);
    }
    }
}
