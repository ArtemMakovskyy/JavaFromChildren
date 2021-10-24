package Shildt.Classes;

import java.util.Arrays;
import java.util.Random;
class RandDemoArrays{
    void test() {
       Random r = new Random();
        int b;
       int arLan = 0;
       int renDate = r.nextInt()/100000;
       if (renDate < 0) {
           arLan = renDate * -1;
       } else arLan = renDate;
        System.out.println(arLan);

       int arr[] = new int[arLan];
       System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt()/100;
        }
        System.out.println(Arrays.toString(arr));
   }
}
public class RandDerno671 {
    public static void main(String[] args) {
        Random random = new Random();
        double val;
        double sum = 0;
        int bell[] = new int[10];
        for (int i = 0; i < 100; i++) {
            val = random.nextGaussian();
            sum += val;
            double t = -2;
            for (int x = 0; x < 10; x++, t += 0.5)
                if (val < t) {
                    bell[x]++;
                    break;
                }
        }
        System.out.println("Cpeднee всех значений :   " + (sum / 100));
//        вывести кривую  распределения
        for (int i = 0; i < 10; i++) {
            for (int x = bell[i]; x > 0; x--)
                System.out.print("*");
            System.out.println();
        }

        RandDemoArrays randDemoArrays = new RandDemoArrays();
randDemoArrays.test();


    }
}
