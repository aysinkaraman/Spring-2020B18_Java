package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {
        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('A');
        list1.add('B');
        list1.add('C');
        list1.add('D');
        list1.add('C');
    int indexnum = list1.indexOf('C');
    int lastindexnum = list1.lastIndexOf('C');
        System.out.println(indexnum);
        System.out.println(lastindexnum);

        Character ch1 = 'C';
        //list1.remove(ch1); remove the first C
        list1.remove(list1.lastIndexOf('C'));
        System.out.println(list1);
        System.out.println("=============================================================");
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9,10,11,12,13};
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int each : arr1 ){
            list2.add(each);
        }
        for (int each : arr2 ){
            list2.add(each);
        }
        System.out.println(list2);




    }
}
