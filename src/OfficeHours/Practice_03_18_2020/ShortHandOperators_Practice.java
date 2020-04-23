package OfficeHours.Practice_03_18_2020;

public class ShortHandOperators_Practice {
    public static void main(String[] args) {
      // +=: addition assignment
      int a =100;
      // a = a + 200; instead of this
        a += 200; // a = 300

        System.out.println(a);

         a += 200 * 3; // a = 900
        System.out.println(a);

        // -= subtraction assignment
       // a = a - 400
       a -= 400;
        System.out.println(a);
        int b = 300;
        b -= 3 * 40;
        System.out.println(b);

        // *= multiplication assignment
        int x = 5;
        //x = x *3; // 15 // but instead of this
        x *= 3;
        System.out.println(x);
        x *= 2+1;
        System.out.println(x);
        // /=: division assignment
        int n = 900;
        // n = n/3 instead of this
        n /= 3; // 300
        System.out.println(n);
        n /= 3*5;
        System.out.println(n);
        // %=: remainder assignment
        // remainder: numerator - (denominator * whole number for result)
        int m = 10;
        // m = m % 3; instead of this
        m %= 3;
        System.out.println(m);
         int y = 300;
         y %= 3*5;
        System.out.println(y);
        int t = 400;
        t %= 10*2;
        System.out.println(t);











    }

}
