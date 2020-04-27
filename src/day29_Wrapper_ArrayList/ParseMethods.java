package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {
        String str = "123";
       int a1 = Integer.parseInt(str);
        System.out.println(str +1 ); //text
        System.out.println(a1+1);
        byte b1 = Byte.parseByte(str);//unboxing
        System.out.println(b1 + 5);
        Integer I1 = (int)Byte.parseByte(str); //autoboxing
        String str2 = "10.5";
        float f1 = Float.parseFloat(str2);
        System.out.println(f1 +1);
        double f2 = Double.parseDouble(str2);
        System.out.println(f2+1);


        String str3 = "3147483647";
        long num1 = Long.parseLong(str3);
        System.out.println(num1+2);
        Long num3 = Long.parseLong(str3);
        System.out.println(num3+2);
        String result1 = "false";
        boolean r1 = Boolean.parseBoolean(result1);
        System.out.println(!r1);



    }
}
