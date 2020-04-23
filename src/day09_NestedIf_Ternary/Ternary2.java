package day09_NestedIf_Ternary;

public class Ternary2 {
    public static void main(String[] args) {
        String result = "";
        if (9>10) {
            result = "9 is gretaer";
        } else { result = "10 is greater"; }

        String result2 = ( 9 > 10) ? " 9 is greater" : "10 is greater";
        System.out.println(result);
        System.out.println(result2);
        System.out.println("===================================================================================================");


        int age = 20;
        boolean eligibility = (age >= 21) ? true : false;
        System.out.println(eligibility);

        int ageOfPerson = 18;
        String eligibleToVote = "";

        String eligibleToVote2 = ( ageOfPerson >= 18) ? "YES" : "NO";
        System.out.println(eligibleToVote2);


    }
}
