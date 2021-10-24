package Shildt.S315Threads;

class Q {
    int n;
    boolean valuSeet = false;
    synchronized int get() {
        while ((!valuSeet))
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Пoлyчeнo:   " + n);
        valuSeet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valuSeet)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        this.n = n;
        valuSeet = true;
        System.out.println("Oтпpaвлeнo:   " + n);
        notify();
    }
}

class Producer implements Runnable {
    Q q;
    Producer(Q q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }
    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;
    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }
    @Override
    public void run() {

        while (true) {
            q.get();
        }
    }
}

public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Для остановки  нажмите Ctrl-C.");
    }
}
