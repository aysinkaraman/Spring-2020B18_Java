package OfficeHours.Practice_04_22_2020;



public class void_Methods {
    public static void main(String[] args) {
        print();
        smoke(20);
    }
    public static void print (){
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }
    public static void smoke (int age){
        if (age >18){
            System.out.println("Eligible to smoke");
        } else {
            System.out.println("not eligible");
        }
    }
}
