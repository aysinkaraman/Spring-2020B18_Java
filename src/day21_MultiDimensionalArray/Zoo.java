package day21_MultiDimensionalArray;

public class Zoo {
    public static void main(String[] args) {
        String [] wildAnimals = {"Tiger", "Lion", "Monkey", "Turtle", "Crocodile"};
        String [] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};
        String [] [] zoo = {wildAnimals, birds};
        String kfc = zoo[1][3];
        System.out.println(kfc);
        for(String eachBirds : zoo[1]){
            if (eachBirds.equals("Chicken")){
                continue;
            }
            System.out.println(eachBirds);
        }
    }
}
