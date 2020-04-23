package day07_IfStatements;

public class MediumNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;
        boolean aMedium = (a < b && a > c) || (a > b && b < c);
        boolean bMedium = (b < c && b > a) || (b > c && b < a);
        boolean cMedium = (c < b && c > a) || (c > b && c < a);
        if(aMedium) { System.out.println( a + " is the medium number"); }
        if(bMedium) { System.out.println( b + " is the medium number"); }
        if(cMedium) { System.out.println( c + " is the medium number"); }






    }
}
