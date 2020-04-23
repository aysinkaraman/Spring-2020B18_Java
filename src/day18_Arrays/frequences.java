package day18_Arrays;

public class frequences {
    public static void main(String[] args) {
        String str = "AABCC";

        String result = "";
        String nonDup = "";
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += str.charAt(i);
            }
        }
        // System.out.println(nonDup);
        for (int j = 0; j <= nonDup.length() - 1; j++) {
            nonDup.charAt(j);


        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 'A') {
                count++;
            }
        }
        result += "" + 'A' + count;
        System.out.println(result);
    }
    }
}
