package day24_Methods;


import java.util.Arrays;
import Resources.Library;

public class test {
    public static void main(String[] args) {
        String str = "level";
       String reverse =  Library.Reverse2(str);
        System.out.println(str.equalsIgnoreCase(reverse));
int [] arr = {10000, 3000, 2000, 40000, 50000, 10000000};
        arr = Library.sortDescending(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



    }
}
