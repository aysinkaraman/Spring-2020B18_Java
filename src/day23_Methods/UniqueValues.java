package day23_Methods;

public class UniqueValues {
    public static void main(String[] args) {
        String arr [] = {"A", "B", "A", "C", "B", "D", "E", "F"};
       for (String each2 : arr) {
           int count = 0;
           for (String each : arr) {
               if (each.equals(each2)) {
                   count++;

               }
           }
           if (count == 1) {
               System.out.println(each2);
           }
       }
        System.out.println("===========================================================================");




       String arrFor [] = {"A", "B", "A", "C", "B", "D", "E", "F"};
        for (String eachFor : arrFor ) {
            int countFor = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(eachFor)) {
                    countFor++;
                }
            }
            if (countFor == 1) {
                System.out.println(eachFor);

            }
        }




















































    }
}
