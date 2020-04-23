package day15_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {
        String resultOdd = "";
        for (int number = 1; number <= 100;  number += 2) {
            System.out.println(number + "   ");
            resultOdd = resultOdd + number +" ";
        }
        System.out.println(resultOdd);
        String resultEven = "";
        for (int number1 = 0; number1 <= 100; number1 +=2 ) {
           resultEven = resultEven += number1 + " ";

        }
        System.out.println(resultEven);
    }

}
