package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,4));

        Integer maxNum = Collections.max(numbers);
        numbers.removeAll(Arrays.asList(maxNum));
        System.out.println(numbers);
        int secondMax = Collections.max(numbers);
        System.out.println(secondMax);
        System.out.println("======================================");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list3);
        Collections.swap(list3, 0,4);
        System.out.println(list3);
        System.out.println("============================================");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Tuba", "Tuba", "Aysin", "Ayse", "Deniz", "Tuba"));
       /* names.set(0,"Neslihan");
        names.set(1,"Neslihan");
        names.set(5,"Neslihan"); */
       Collections.replaceAll(names,"Tuba","Neslihan");

        System.out.println(names);

    }
}
