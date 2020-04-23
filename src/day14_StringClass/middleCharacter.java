package day14_StringClass;
/*  Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character. */
import java.util.Scanner;
public class middleCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your word");
        String word = input.next();
        String middleCharacter = "";
        int totalChars = word.length();
        int middleNumber = totalChars/2;
        if (totalChars%2 != 0) {
            middleCharacter += word.charAt(middleNumber); }
        System.out.println(middleCharacter);



    }
}
