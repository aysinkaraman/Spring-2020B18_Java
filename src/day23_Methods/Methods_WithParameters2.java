package day23_Methods;

public class Methods_WithParameters2 {
    public static void main(String[] args) {
        String names = "Aysin";
        ReverseString(names);
        System.out.println("Hello");
    }
    public static void ReverseString (String str){
        for (int i = str.length()-1; i >=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
