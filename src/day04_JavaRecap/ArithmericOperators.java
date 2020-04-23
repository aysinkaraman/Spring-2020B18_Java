package day04_JavaRecap;

public class ArithmericOperators {
        public static void main(String[] args) {
        double d = 10/4;
        System.out.println(d); //2.0
        System.out.println(10.0/4);
        System.out.println(10/4.0);
        System.out.println(10.0/4.0);
        float f1 = 10/4;
        System.out.println(f1); // it prints as decimal
        boolean evenNumber = 25 % 2 == 0;
        //if 25 divide by 2 has a remainder of zero, then it's even number

        System.out.println(evenNumber);

        System.out.println(25 % 2);
        boolean oddNumber = 22 % 2 != 0;
            // 0!= 0 ==> false
        System.out.println(oddNumber);

            System.out.println(10%2 == 0); //10 is even number
            System.out.println( 11%2 != 0); // odd number
            System.out.println("10 is even number: " + (10%2 == 0) );
            System.out.println("11 is even number: " + (11%2 == 0));
            System.out.println("25 is odd number: " + (25%2 != 0) );

            System.out.println("25 is even number: " + (10 % 2 == 0) );

            System.out.println("25 is even number: " + !(10%2 == 0) );
            System.out.print("Hello");
            System.out.print("Batch17");

















    }
}
