package OfficeHours.Practice_03_18_2020;

public class LogicalOperators_Practice {
    public static void main(String[] args) {
      //  ||, &&, !

        boolean r1 = "Muhtar" == "Bady Guy";
        System.out.println(r1);
        boolean r2 = "Muhtar" != "Good Guy";
        System.out.println(r2);
        boolean r3 = 10 >= 9;
        System.out.println(r3);
        boolean r4 = !false == !true;
        System.out.println(r4);
        // || as long as one condition is true result will be true
        boolean result1 = 9 !=8 || 9==8;
        System.out.println(result1);
        boolean result2 =  'a' == 'A' || 'A' =='b';
        // && as long as one condition is false result will be false
        boolean result3 = 6 > 5 && 6<4;
        System.out.println(result3);
        boolean result4 = !false != false && !true == false;
        System.out.println(result4);




















    }
}
