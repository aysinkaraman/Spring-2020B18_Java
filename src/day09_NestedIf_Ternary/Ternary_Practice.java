package day09_NestedIf_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {
        int number = 100;
        char ch1 = (number > 0) ? '+' : '-';
        System.out.println(ch1);

        byte score = 90;


        String grade2 = (score>= 90 && score<= 100) ? "Excellent" : (score>= 80 && score < 90) ? "Great"
                :(score >= 70 && score < 80) ? "Good" :(score >= 60 && score <70) ? "Pass"
                :( score < 60 && score >0)? "Failed" : "Invalid" ;

        System.out.println(grade2);

        int num1 = 100;
        int num2 = 200;
        int min = (num1 < num2) ? num1 : num2;
        System.out.println(min);

        System.out.println("===========================================================================");

        int hour = 14;
        String result = (hour < 12) ? "Good Morning" : (hour > 12 && hour < 18) ? "Good Afternoon" : "Good Evening";
        System.out.println(result);






    }
}
