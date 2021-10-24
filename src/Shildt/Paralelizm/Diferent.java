package Shildt.Paralelizm;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Diferent {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Math.random());
        System.out.println(ThreadLocalRandom.current().nextDouble());

        Thread.sleep(1);
        long l = TimeUnit.DAYS.toMillis(14);
//        Thread.sleep(l);
        System.out.println(l);


    }
}
