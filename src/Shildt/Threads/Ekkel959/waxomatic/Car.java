package Shildt.Threads.Ekkel959.waxomatic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Car {
    private boolean waxOn = false;

    public synchronized void waxed() {
        waxOn = true;
        notifyAll();
    }

    public synchronized void buffed() {
        waxOn = false;
        notifyAll();
    }

    public synchronized void waitForWaxing() throws InterruptedException {
        while (waxOn == false) wait();
    }

    public synchronized void waitForBuffing() throws InterruptedException {
        while (waxOn == true) wait();
    }
}

class WaxOn implements Runnable {
    private Car car;

    public WaxOn(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("wax on!");
            try {
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            car.waxed();
            try {
                car.waitForBuffing();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Ending Wax On Task");
        }
    }
}
class WaxOff implements Runnable{
    Car car;

    public WaxOff(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("wax off!");

            try {
                TimeUnit.MILLISECONDS.sleep(200);
                car.buffed();
                car.waitForBuffing();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }





            System.out.println("Ending Wax Of Task");
        }
    }
}
class WaxPMaric{
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new WaxOff(car));
        exec.execute(new WaxOn(car));
        TimeUnit.SECONDS.sleep(5);
        exec.shutdown();

    }
}