package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;
public class return_Methods {
    public static void main(String[] args) {
        int [] deneme = { 100, 101, 300,1,3,4,6,7,89,90};
        secondmax(deneme);
    }
    public static void secondmax (int [] arr) {
        int [] arr1 = {100,40,50,90,80,45,35,250};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);

    }
}
