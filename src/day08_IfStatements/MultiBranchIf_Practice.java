package day08_IfStatements;

public class MultiBranchIf_Practice {
    public static void main(String[] args) {

        double score = 95.5;
        boolean AGrade = score >= 90 && score <= 100;
        boolean BGrade = score >= 80 && score < 90;
        boolean CGrade = score >= 70 && score < 80;
        boolean DGrade = score >= 60 && score < 70;

        char grade = ' ';
        if (AGrade) {
            grade = 'A';
        } else if (BGrade){
            grade = 'B';
        } else if (CGrade) {
            grade = 'C';
        } else if (DGrade) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(grade);

        int numberOfBedrooms = 2;
        int startingPrice = 0;
         if (numberOfBedrooms == 1) {
             System.out.println("One Bedroom Selected");
             startingPrice = 1100;
             System.out.println("Starting Price: " + startingPrice);
         } else if (numberOfBedrooms == 2) {
             System.out.println("Two Bedroom Selected");
             startingPrice = 1850;
             System.out.println("Starting Price: " + startingPrice);
         }
         else if (numberOfBedrooms == 3) {
             System.out.println("Three Bedroom Selected");
             startingPrice = 2550;
             System.out.println("Starting Price: " + startingPrice);
         } else {
             System.out.println("No such Bedrooms available"); }











    }

}
