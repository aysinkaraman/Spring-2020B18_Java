package NestedLoop;

public class DoWhilePractice {
    public static void main(String[] args) {
        int num = 0;
        do {
            if (num % 2 == 0){
                System.out.print(num + " ");
        }

                num++;
        }while(num<=100);
        System.out.println();
        int i = 1;
        do{
            i++;
            System.out.println(i);

        }while(i <=5);
        System.out.println("================================");
        int z = 1;
        do{  z++;
            System.out.println(z);

            if (z==3){
                break;
            }

        } while (z<=5);
        System.out.println("================================");
        int t = 1;
        do{
            if (t % 2 != 0){
                t++;
                continue;

            }
            System.out.print(t+"");
            t++;

        }while(t<=100);























    }

    }

