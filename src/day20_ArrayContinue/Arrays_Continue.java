package day20_ArrayContinue;
import java.util.Arrays;
public class Arrays_Continue {
    public static void main(String[] args) {
        String name = "Aysin";
        char [] characters = name.toCharArray();
        System.out.println(Arrays.toString(characters));

        String str1 = "Cybertek School";
        String str2 = "School Cybertek";
        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        System.out.println(Arrays.equals(ch1, ch2));








    }
}
