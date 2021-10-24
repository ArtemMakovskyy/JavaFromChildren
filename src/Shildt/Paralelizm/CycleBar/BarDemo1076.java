package Shildt.Paralelizm.CycleBar;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo1076 {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3,new BarAction());
        System.out.println("start threads");
        new Thread(new MyThread(cb,"a"));
        new Thread(new MyThread(cb,"b"));
        new Thread(new MyThread(cb,"c"));
        new Thread(new MyThread(cb,"dd"));
        new Thread(new MyThread(cb,"ee"));
        new Thread(new MyThread(cb,"ff"));


    }
}

class MyThread implements Runnable{
    CyclicBarrier cbar;
    String name;

    public MyThread(CyclicBarrier cbar, String name) {
        this.cbar = cbar;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name);
        try {
            cbar.await();
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class BarAction implements Runnable{

    @Override
    public void run() {
        System.out.println("barier is achieved ");
    }
}
