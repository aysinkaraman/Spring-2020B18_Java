package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Cybertek";
        char [] ch1 = str.toCharArray();
        System.out.println(str.length() == ch1.length);
        System.out.println("==============================================================");
        String sentence = "I like to learn java java java";
        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        int totalWords = words.length;
        System.out.println(totalWords);














    }
}
