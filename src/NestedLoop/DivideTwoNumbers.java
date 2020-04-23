package NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;
        int count = 0;
        while (a>=b){
            a -= b;
            count++;
        }
        if (a == 0){
            System.out.println("The result is: " + count);
        }else{

            System.out.println("The result is " + a + " with a remainder 0");
        }
    }
}
