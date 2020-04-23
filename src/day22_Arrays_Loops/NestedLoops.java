package day22_Arrays_Loops;

public class NestedLoops {
    public static void main(String[] args) {
        char [][] arr2D = {{'A', 'B'}, {'C', 'D', 'E'} ,{'F', 'J', 'H', 'I'} };

        for(int i = 0; i < arr2D[0].length; i++){
            System.out.println( arr2D[0] [i] );
        }
        for(int i = 0; i < arr2D[0].length; i++){
            System.out.println( arr2D[1] [i] );
        }
        for(int i = 0; i < arr2D[0].length; i++){
            System.out.println( arr2D[2] [i] );
        }
        System.out.println("===================================================");
        for (int j =0; j<arr2D[2].length; j++){
            for (int i = 0; i < arr2D[0].length; i++);{
                System.out.println( arr2D[1] [j] );
            }
        }









    }
}
