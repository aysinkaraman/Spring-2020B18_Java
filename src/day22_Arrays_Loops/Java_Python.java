package day22_Arrays_Loops;

public class Java_Python {
    public static void main(String[] args) {
        String sentence = "I like java and javascript";
        int countJava =0;
        int countPyton = 0;
        String [] words = sentence.split(" ");
        for (String each : words){
            if (each.contains("java")){
                countJava++;
            }
            if (each.contains("python")){
                countPyton++;
            }
        }
        System.out.println(countJava ==  countPyton);
    }
}
