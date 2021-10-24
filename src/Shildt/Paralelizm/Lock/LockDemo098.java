package Shildt.Paralelizm.Lock;

import java.util.concurrent.locks.ReentrantLock;

class Shared {
    static int count = 0;
}

public class LockDemo098 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new LockThread(lock, "A");
        new LockThread(lock, "B");

    }
}

class LockThread implements Runnable {
    ReentrantLock lock;
    String name;

    public LockThread(ReentrantLock lock, String name) {
        this.lock = lock;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Зaпycк потока " + name);
        try {
            System.out.println("Пoтoк " + name + " ожидает блокировки счетчика");
            lock.lock();
            System.out.println("Пoтoк " + name + " блокирует счетчик.");
            Shared.count++;
            System.out.println("Пoтoк " + name + " : " + Shared.count);
            System.out.println("Пoтoк " + name + " ожидает");
            Thread.sleep(250);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Пoтoк " + name + " разблокирует счетчик");
            lock.unlock();
        }


    }
}