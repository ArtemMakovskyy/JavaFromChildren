package Shildt.Paralelizm.Semaphore;

import java.util.concurrent.*;

public class SempfprEx1068 {
    public static void main(String[] args) {
        Semaphore semF = new Semaphore(1);
        new IncThread(semF, "A");
        new DecThread(semF, "B");
    }
}

class Shared {
    static int count = 0;
}

class IncThread extends Thread {
    String name;
    Semaphore sem;

    public IncThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    @Override
    public void run() {

        try {
            System.out.println("Пoтoк" + name + "ожидает разрешения");
            sem.acquire();
            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + "· " + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Пoтoк" + name + " освобождает разрешение");
        sem.release();
    }
}

class DecThread extends Thread {
    String name;
    Semaphore sem;

    public DecThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            System.out.println("Пoтoк" + name + "ожидает разрешения");
            sem.acquire();
            System.out.println("Пoтoк" + name + " получает разрешение");
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + "· " + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Пoтoк" + name + " освобождает разрешение");
        sem.release();
    }
}