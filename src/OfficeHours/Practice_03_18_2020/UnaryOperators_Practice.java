package OfficeHours.Practice_03_18_2020;

public class UnaryOperators_Practice {
    public static void main(String[] args) {
     int a = 20;
        System.out.println(a++);
        System.out.println(a);
        int b = 30;
        int c = b--;
        System.out.println(b); // 29
        System.out.println(c); // 30 (cause post not affect immediately)

        int d = 40;
        int e = d++;
        System.out.println(d);
        System.out.println(e);

        int x = 200;
        System.out.println(--x);
        System.out.println(x);


        int z = 100;
        z = z++ + --z - z-- + ++z;
        System.out.println(z);


        int u = 900;
        int r = - ++u + ++u + -u++;
        System.out.println(r);













    }
}
