package day13_StringClass;

import java.util.jar.JarOutputStream;

public class StringManupilations3 {
    public static void main(String[] args) {
        String str = "I like Java programming John";
        int num1 = str.indexOf("J");
        int num2 = str.indexOf("John");
        System.out.println(num1);
        System.out.println(num2);

        String str2 = "Cybertek school is awesome";
        int firstS = str2.indexOf("s");
        int secondS = str2.indexOf("is") + 1;
        System.out.println(firstS);
        System.out.println(secondS);
        int maxIndekNumber = "Cybertek".length() - 1;
        System.out.println(maxIndekNumber);
        String names = "Muhtar";
        int a1 = names.indexOf("Good Guy");
        System.out.println(a1);
        String fullname = "Aysin Karaman";
        String firstName = fullname.substring(0, fullname.indexOf(" "));
        String lastName = fullname.substring(fullname.indexOf(" ")+1);
        System.out.println(firstName);
        System.out.println(lastName);








    }
}
