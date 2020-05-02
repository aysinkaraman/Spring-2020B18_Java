package day32_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {
        Predicate<Integer> oddNumber = x -> x %2 != 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(oddNumber);
        System.out.println(list);
        System.out.println("======================================================");
        Predicate<Integer> lessThan5 = y -> y < 5;
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(lessThan5);
        System.out.println(list2);
        System.out.println("=====================================================");
        Predicate<String> startsWithT = s -> !s.startsWith("T");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Tuba", "Tarik", "Tarcin", "Aysin", "Nazim"));
        names.removeIf(startsWithT);
        System.out.println(names);
        System.out.println("=================================================");
        Predicate<String> startsWithNorA = each -> each.startsWith("N") || each.startsWith("A");
        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList("Aysin", "Tuba", "Ayse", "Batu", "Nazim"));
        nameList.removeIf(startsWithNorA);
        System.out.println(nameList);
        System.out.println("==========================================================");
        Predicate<Character> removeDigit = d -> Character.isDigit(d);
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'B', 'C', '3', '4', '5', '@', '&', 'Z'));
        chars.removeIf(removeDigit);
        System.out.println(chars);
        System.out.println("=====================================================================");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        nums.removeIf()


    }
}
