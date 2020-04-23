package Day12_JavaREcap;
import java.util.Scanner;
public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Building number: ");
        int Bnumber = scan.nextInt();
        scan.nextLine();

        System.out.println("Street: ");
        String street = scan.nextLine();

        System.out.println("Enter the zipcode: ");
        String zipCode = scan.nextLine();

        System.out.println("Enter city and the state name: ");
        String cityState = scan.nextLine();

        String fullAddress = Bnumber+ " " +street + ", \n" + cityState + ", " + zipCode;
        System.out.println(fullAddress);
        scan.close();







    }
}
