package Shildt.Paralelizm.Atomic.Test;
//https://www.youtube.com/watch?v=pHl6m4CIKj4
import java.util.concurrent.atomic.AtomicInteger;

public class T1 {
    static int i;
    static AtomicInteger aIn = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 10_000; j++) {
            new MyThread().start();
        }
        Thread.sleep(10);
        System.out.println(i + " _ai: " +aIn.get()+" dif"+"");

    }
    static class MyThread extends Thread{
        @Override
        public void run() {
            i++;
            aIn.incrementAndGet();
        }
    }
}
