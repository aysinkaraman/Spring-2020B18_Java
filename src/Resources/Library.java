package Resources;

import java.util.Arrays;

public class Library {

    public static int [] sortDescending (int [] arr){
        Arrays.sort(arr);
        int [] revArr = new int [arr.length];
        int j = arr.length-1;

        for (int i = 0; i < arr.length; i++){
            revArr[i] = arr[j];
            j--;
        }

        return revArr;
    }
    public static String Reverse2(String str){
        String Reverse = "";
        for (int i = str.length()-1; i >=0; i--){
            Reverse += str.charAt(i);

        }
        return Reverse;

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
    public static int Frequency (String str1, String str2){
        int count = 0;
        while (str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2,"");
        }
        return count;
    }
}
