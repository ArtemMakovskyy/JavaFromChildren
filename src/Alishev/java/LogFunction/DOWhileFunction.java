package Alishev.java.LogFunction;

import java.util.Scanner;

public class DOWhileFunction {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int five;
        do {
            System.out.println("in 5");
            five = s.nextInt();
        }while(five != 5);

        System.out.println("ok");
    }

}