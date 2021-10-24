package Shildt.Paralelizm.Phaser;

import java.util.concurrent.Phaser;

public class PhisersEx {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        new Washer(phaser,"A");
        new Washer(phaser,"B");
        new Washer(phaser,"C");
//        phaser.arriveAndAwaitAdvance();
//        phaser.arriveAndAwaitAdvance();
//        phaser.arriveAndAwaitAdvance();
    }
    static class Washer extends Thread{
        Phaser phaser;
        String name;

        public Washer(Phaser phaser, String name) {
//            phaser.register();
            this.phaser = phaser;
            this.name = name;
            start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 7; i++) {
                System.out.println(name + " Woshed..." + i);
                phaser.arriveAndAwaitAdvance();

            }

        }
    }
}
