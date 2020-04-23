package day24_Methods;
import java.util.*;
public class returnMethodPractice {
    public static void main(String[] args) {
        int [] arr = {9,8,7,10,4,50,46,74};
        int max = maxNumber(arr);
        System.out.println(max);
        int min = minNumber(arr);
        System.out.println(min);
    }

public static int minNumber (int [] arr){
        Arrays.sort(arr);
        return arr [0];
}

    public static int maxNumber (int [] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


}
