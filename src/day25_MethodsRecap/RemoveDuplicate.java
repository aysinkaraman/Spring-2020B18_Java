package day25_MethodsRecap;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "ABAB";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }
        System.out.println(result);


        String str2 = "ABABABAAB";
        String result2 = removeDuplicates(str2);
        System.out.println(result2);
    }

    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }
        return result;
    }
}

