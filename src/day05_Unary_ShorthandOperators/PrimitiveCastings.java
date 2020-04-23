package day05_Unary_ShorthandOperators;

public class PrimitiveCastings {
    public static void main(String[] args) {
        int a = 10;
        long b = a; // implicit casting is done automatically
        //b=10L
        int a1 = 100;
        long b1 = (long) a1; // manually doing the implicit casting
        // int c1 = b1; cannot assigned cause long is greater than int
    }
}



