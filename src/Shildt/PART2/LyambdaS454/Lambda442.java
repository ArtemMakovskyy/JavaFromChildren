package Shildt.PART2.LyambdaS454;

import java.util.Random;

interface MyNumber {
    double getValue();
}

interface NurnericTest {
    boolean test(int n);
}

interface NurnericTest2 {
    boolean test(int n, int d);
}


public class Lambda442 {
    public static void main(String[] args) {

        Random r = new Random();
        MyNumber mn;
        MyNumber mn2;
        MyNumber mn3;
        mn = () -> 123.54;

        mn2 = () -> Math.random() * 100;
        mn3 = () -> (100 * r.nextDouble());
        System.out.println(mn2.getValue() + " " + mn3.getValue());
        /**
         /////////////////////////////////
         **/
        NumericTestt isEven;
        isEven = n -> (n % 2) == 0;
        if (isEven.test(10)) System.out.println("even");
        else System.out.println("not even");

        if (isEven.test(9)) System.out.println("even");
        else System.out.println("not even");

        NumericTestt isEven2 = n -> n >= 0;
        if (isEven2.test(0)) System.out.println("+");
        else System.out.println("-");
        if (isEven2.test(-5)) System.out.println("+");
        else System.out.println("-");
        /**
         /////////////////////////////////
         **/
        NurnericTest2 nt2 = ((n, d) -> n % d == 0);
        if (nt2.test(10, 2)) System.out.println(true);
        else System.out.println(false);
        if (nt2.test(10, 4)) System.out.println(true);
        else System.out.println(false);


    }
}

