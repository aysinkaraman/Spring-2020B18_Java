package day33_CustomClass;

public class carObjects {
    public static void main(String[] args) {
       Car car1 = new Car();
       car1.brand = "BMW";
       car1.model = "X5";
       car1.year = 2020;
       car1.color = "Red";
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        car1.start();
        car1.drive();
        car1.getCarInfo();
        System.out.println("==================================================");
        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.model = "Camry";
        car2.year = 2020;
        car2.color = "Sand Beige";
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        car2.start();
        car2.drive();
        car2.getCarInfo();
        System.out.println("========================================================");
        Car car3 = new Car();
        car3.brand = "Mercedes";
        car3.model = "C Class";
        car3.year = 2020;
        car3.color = "Black";
        car3.getCarInfo();
        System.out.println("=================================================");
        Car [] cars = {car1, car2, car3};
        cars [0].getCarInfo();
        cars [1].getCarInfo();
        cars [2].getCarInfo();;

    }
}
