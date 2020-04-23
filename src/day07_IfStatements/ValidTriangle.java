package day07_IfStatements;

public class ValidTriangle {
    public static void main(String[] args) {
       double angle1 = 30.5;
       double angle2 = 49.5;
       double angle3 = 100;
       short sumOfAngles = (short) (angle1 + angle2 + angle3);
       boolean validTriangle = sumOfAngles == 180;
       if (validTriangle) {
           System.out.println("The shape is a triangle");}
           if (!validTriangle) {
               System.out.println("The shape is a not valid triangle");}
       }







    }

