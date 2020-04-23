package day21_MultiDimensionalArray;

public class Longest_Shortest_Words {
    public static void main(String[] args) {
        String [] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana"};
        int maxLengthString = names [0].length();
        String longestWord = "";
        int minLengthString = names[0].length();
        String shortestword = "";
        for (int i = 0; i <= names.length-1; i++ ){
            if (names[i].length() > maxLengthString){
                maxLengthString = names [i].length();
                longestWord=names[i];

            }
            if (names[i].length() < minLengthString ) {
                minLengthString = names[i].length();
                shortestword = names[i];
            }
        }
        System.out.println(longestWord);
        System.out.println(shortestword);
    }
}
