package OfficeHours.Practice_04_01_2020;

public class StringMethods2 {
    public static void main(String[] args) {
        String str1 = " ";
        boolean r1 = str1.isEmpty();
        boolean r2 = !str1.isEmpty();
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("============================================================");
        String s1 = "cat";
        String s2 = new String("cat");
        String s3 = "Cat";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s1));
        System.out.println(s3.equalsIgnoreCase(s1));
        String sentence = "I like to learn Java";
        System.out.println(sentence.contains("Java"));
        String sentence2 = "Top 3 viruses are: 1. Corona, 2. Henta, 3. Ebola";
        System.out.println(sentence2.contains("java"));
        System.out.println("========================================================");
        String webAddress = "www.amazon.com";
        System.out.println(webAddress.startsWith("www."));
        System.out.println(webAddress.startsWith("wwww."));
        String gmail = "CybertekSchool@gmail.com";
        System.out.println(gmail.endsWith("@gmail.com"));
        System.out.println(gmail.endsWith("@hotmail.com"));
        






    }
}
