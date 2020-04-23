package day21_MultiDimensionalArray;


import java.util.Arrays;

public class Multi_DimensionalArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};
        int [][] arr2D = { {1,2,3} , {4,5,6} };

        System.out.println(arr2D.length);
        int [] arr1D = arr2D[0];
        System.out.println(Arrays.toString(arr1D));
        int num1 = arr2D[1][2];
        System.out.println(num1);
        char[][] ch2D= {{'A', 'B'}, {'D','E','F'}, {'G', 'H', 'I'}};
        char c1 = ch2D[1][0];
        System.out.println(c1);
         char [] ch2 = ch2D[2];
        System.out.println(Arrays.toString(ch2));
        String [] [] str2D = {{"A", "B", "C"}, {"D", "E","F"}, {"J", "H", "I"}};
        String r1 = str2D[2] [1];
        System.out.println(r1);

    }
}
