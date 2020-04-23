package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {
        int age = 17;
        boolean USCitizen = true;

        if (age > 17) {
            System.out.println("You are eligible to vote");
        } else if (age < 18) {
            System.out.println("You MUST be 18 or older to able to vote");
        } else {
            System.out.println("Only the US citizens are eligible to vote for Donald Trump");
        }


        System.out.println("=======================================================");

        int score = 98;

        String grade = "";

        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70){
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            }else {
                 grade = "F"; }
    } else {
        grade = "Invalid";
    }

        System.out.println(grade);

        System.out.println("==================================================");

        int score2 = 75;
        String grade2 = "";
        if (score2 >= 0 && score2 <= 100) {
            grade2 = (score>=90) ? "A" : (score2 >= 80) ? "B" : (score2 >= 70) ? "C" : (score >= 60) ? "D" : "F";

        }else{
            grade2 = "Invalid";
        }
        System.out.println(grade2);




        
    }
}
