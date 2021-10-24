package Shildt.Paralelizm.Semaphore;

import java.util.concurrent.Semaphore;

class Q {
    int n;

    static Semaphore of = new Semaphore(0);
    static Semaphore on = new Semaphore(1);

    void get() {
        try {
            of.acquire();
            System.out.println("получено " + n);
            on.release();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    void put(int n) {
        try {
            on.acquire();
            this.n = n;
            System.out.println("отправлено " + n);
            of.release();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, " Producer ").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            q.put(i);
        }
    }
}


class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            q.get();
        }
    }
}


public class ProdConsumer {
    public static void main(String[] args) {
        Q q = new Q();
        new Thread(new Consumer(q), "Consumer").start();
        new Thread(new Producer(q), " Prcducer ").start();

    }
}
