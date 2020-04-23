package day21_MultiDimensionalArray;

import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {
        int [] arr1D = {1,2,3};
        System.out.println(Arrays.toString(arr1D));
        int [] [] arr2D= {{1,2,3}};
        System.out.println(Arrays.toString(arr2D));
        System.out.println(Arrays.deepToString(arr2D));
int [][][] arr3D = {{{1,2,3}, {4,5,6}}, {{7,8,9}, {10,11,12}}};




    }
}
