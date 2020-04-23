package OfficeHours.Practice_04_15_2020;
import java.util.Arrays;
public class ArraysUtility {
    public static void main(String[] args) {
        int [] arr = {9,10,8,65,8,6,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int [] salaries = {10000, 200000, 30, 5000, 432, 123123,2000000};
        Arrays.sort(salaries);
        System.out.println(Arrays.toString(salaries));
        System.out.println(("Minimum salary: " + salaries[0]));
        System.out.println("Maximum salary: " + salaries[salaries.length-1]);
        System.out.println("=============================================================");
        int [] arr1 = {1,2,3};
        int [] arr2 = {2,1,3};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));


















































    }
}
