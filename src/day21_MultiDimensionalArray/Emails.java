package day21_MultiDimensionalArray;

public class Emails {
    public static void main(String[] args) {
        String [] emails = {"cybertek@gmail.com", "cybertek@yahoo.com", "cybertek@hotmail.com", "cybertek@outlook.com"
        };
        for (String EachEmail: emails){
            if (!EachEmail.endsWith("@gmail.com")){
                System.out.println(EachEmail);
            }
        }
    }
}
