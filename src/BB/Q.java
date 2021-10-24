package BB;

public class Q {
    int n;
    boolean value = false;

    synchronized public int getN() {
        while (!value)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("adds " + n);
        value = false;
        notify();
        return n;
    }

    synchronized public void setN(int n) {
        while (value)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        this.n = n;
        value = true;
        System.out.println("outputs " + n);
        notify();
    }
}

class Produser implements Runnable {
    Q q;


    public Produser(Q q) {
        this.q = q;
        new Thread(this, "Produser").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.setN(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumewr").start();
    }

    @Override
    public void run() {
        while (true) {
            q.getN();
        }
    }
}