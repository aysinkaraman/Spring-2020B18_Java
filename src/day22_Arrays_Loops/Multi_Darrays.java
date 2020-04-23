package day22_Arrays_Loops;


import java.util.Arrays;

public class Multi_Darrays {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int []  [] arr2D = {{1,2,3}};
        int [] arr1D = arr2D [0];
        System.out.println(Arrays.toString(arr1D));
        System.out.println(Arrays.toString(arr2D[0]));
    }
}
