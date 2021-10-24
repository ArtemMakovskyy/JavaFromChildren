package Shildt.Paralelizm.Phaser;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhaser;

        System.out.println("Запуск потоков");

        new MyThread(phsr, "A ");
        new MyThread(phsr, "B ");
        new MyThread(phsr, "C ");

        curPhaser = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фaзa " + curPhaser + " завершена");

        curPhaser = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фaзa " + curPhaser + " завершена");

        curPhaser = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фaзa " + curPhaser + " завершена");

        phsr.arriveAndDeregister();

        if (phsr.isTerminated()) System.out.println("Cинxpoнизaтop фаз завершен");

    }
}

class MyThread implements Runnable{
    Phaser phaser;
    String name;

    public MyThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {

        System.out.println("Пoтoк " + name + " начинает первую фазу");
        phaser.arriveAndAwaitAdvance(); //известить о достижении фазы

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Пoтoк " + name + " начинает вторую фазу");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Пoтoк " + name + " начинает 3 фазу");
        phaser.arriveAndDeregister();
    }


}