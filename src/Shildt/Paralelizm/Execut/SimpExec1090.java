package Shildt.Paralelizm.Execut;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpExec1090 {
    public static void main(String[] args) {
        CountDownLatch cdl1 = new CountDownLatch(5);
        CountDownLatch cdl2 = new CountDownLatch(5);
        CountDownLatch cdl3 = new CountDownLatch(5);
        CountDownLatch cdl4 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(2);

        System.out.println("Зaпycк потоков");
        es.execute(new MyThreadEx(cdl1,"A"));
        es.execute(new MyThreadEx(cdl2,"B"));
        es.execute(new MyThreadEx(cdl3,"C"));
        es.execute(new MyThreadEx(cdl4,"D"));

        try {
            cdl1.await();
            cdl2.await();
            cdl3.await();
            cdl4.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        es.shutdown();
        System.out.println("Зaвepшeниe потоков");


    }
}
class MyThreadEx implements Runnable{
    CountDownLatch latch;
    String name;


    public MyThreadEx(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;

    }

    @Override
    public void run() {
        for (int i = 0; i < 5 ;i++) {
            System.out.println(name+" : " + i);
            latch.countDown();

        }
    }
}