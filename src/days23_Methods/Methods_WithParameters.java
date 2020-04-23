package days23_Methods;

import java.util.*;

public class Methods_WithParameters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = scan.nextByte();
        eligibleToBuy((byte)45);
    }


    public static void eligibleToBuy (byte age){
        if (age >= 21){
            System.out.println("Eligible to by alcohol");
        } else {
            System.out.println("Eligible to buy milk");
        }

    }
}
