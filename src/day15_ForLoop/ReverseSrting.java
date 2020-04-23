package day15_ForLoop;

public class ReverseSrting {
    public static void main(String[] args) {
        String str = "Java is fun";
        String reverse1 = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);
        int lastIndexNum = str.length()-1;

        for (int i = lastIndexNum; i >= 0;  i--) {
        }
        String reverse2 = "";
        for (int i = lastIndexNum; i >=0; i--) {
            reverse2 += str.charAt(i);
        }
        System.out.println(reverse2);
    }
}
