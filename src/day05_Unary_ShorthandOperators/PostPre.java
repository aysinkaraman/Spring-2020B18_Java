package day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {
        //Pre: changes the value of the variable immediately
        int a = 100;
        System.out.println( ++ a);
        System.out.println(a);
        int b = 100;
        System.out.println(--b);
        System.out.println(b);
        // Post: First passes the current value, then eventually changes the variable' value
        int A = 100;
        System.out.println(A++);
        System.out.println(A);
        int B = 100;
        System.out.println(B--);
        System.out.println(B);



    }
}
