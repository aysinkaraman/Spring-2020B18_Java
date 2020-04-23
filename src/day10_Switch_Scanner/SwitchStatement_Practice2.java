package day10_Switch_Scanner;

import static java.lang.System.*;

public class  SwitchStatement_Practice2 {
    public static void main(String[] args) {

        int num = 1;

        switch (2) {
            case 1:
                num += 3;

            case 2:
                num += 2;

                case 3:
                num += 10;

            default:
                num -= 5;
                break;


        }
        System.out.println(num);
    }
}
