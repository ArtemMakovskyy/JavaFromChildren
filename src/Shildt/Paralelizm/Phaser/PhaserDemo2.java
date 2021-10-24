package Shildt.Paralelizm.Phaser;

import java.util.concurrent.*;

public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phaser = new MyPhaser(1, 4);
        System.out.println("Запуск потоков \n");

        new MyThread2(phaser,"A");
        new MyThread2(phaser,"B");
        new MyThread2(phaser,"C");
        while (!phaser.isTerminated()){
            phaser.arriveAndAwaitAdvance();
        }

        System.out.println("Cинxpoнизaтop фаз завершен");
    }
}

class MyPhaser extends Phaser {
    int numPhases;

    public MyPhaser(int parties, int numPhases) {
        super(parties);
        this.numPhases = numPhases - 1;
    }

    @Override
    protected boolean onAdvance(int p, int regParties) {
        System.out.println("Фaзa " + p + " завершена.\n");
        if (p == numPhases || regParties == 0) return true;
        return false;

    }
}

class MyThread2 implements Runnable{
Phaser phaser;
String name;

    public MyThread2(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!phaser.isTerminated()){
            System.out.println("Пoтoк " + name + " начинает фазу •"+phaser.getPhase());
            phaser.arriveAndAwaitAdvance();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}