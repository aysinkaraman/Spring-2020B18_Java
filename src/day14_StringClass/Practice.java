package day14_StringClass;

public class Practice {
    public static void main(String[] args) {
        String gmail = "cybertekschool@gmail.com";
        String userinputGmail = "CybertekSchool@gmail.com";
        boolean result = gmail.equalsIgnoreCase(userinputGmail);
        if (result) {
            System.out.println("Logged in");
        }
        System.out.println("========================================================");

        String PassWord = "mmasd1235";
        System.out.println("========================================================");
        String webAddress = "www.amazon.com";
        if (webAddress.startsWith("www.")) {
            System.out.println("valid"); }
        String email =  "CybertekSchool@Yahoo.com";
        if (email.endsWith("@gmail.com")) {
            System.out.println("Valid Gmail");
        } else {
            System.out.println("Invalid gmail"); }







    }
}
