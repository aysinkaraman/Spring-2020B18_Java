package Day12_JavaREcap;
import java.util.Scanner;
public class Scanner_Next {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String fullAddress ="";
        System.out.println("Enter the number of the buiilding");
        short Bnumber = scan.nextShort();
        fullAddress += Bnumber + "";
        System.out.println("Enter the Street Name");
        String streetName = scan.next();
        fullAddress += streetName + " ";
        System.out.println("Enter the type of the road");
        String roadType = scan.next();
        fullAddress += roadType + ", ";
        System.out.println("Enter the city name, state, zip code");
        String cityName = scan.next();
        fullAddress += cityName+" ";

        String state = scan.next();
        fullAddress += state+", ";

        int zipcode = scan.nextInt();
        fullAddress += zipcode;

        System.out.println("Address is: " +fullAddress);





















    }
}
