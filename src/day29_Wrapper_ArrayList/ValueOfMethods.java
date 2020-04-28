package day29_Wrapper_ArrayList;

public class ValueOfMethods {
    public static void main(String[] args) {
        String str = "123";
        Integer a = Integer.valueOf(str);
        System.out.println(a);
        byte c = 10;
        System.out.println("=====================================");
        int z1 = 2000;
       // Long L1 = z1;
        String r1 = "true";
        Boolean t1 = Boolean.valueOf(r1);
        boolean t2 = Boolean.valueOf(r1); //unboxing
        System.out.println(t1);
        System.out.println(t2);
        System.out.println("=================================");
        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);
        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2);
        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);
        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3);
        byte minNum2 = Byte.MIN_VALUE;
        System.out.println(minNum2);


    }
}
