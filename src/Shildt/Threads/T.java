package Shildt.Threads;

public class T {
    public static void main(String[] args) {
        ThreadT t = new ThreadT();
        synchronized (t) {
            try {
                t.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(t.i);
    }
}


class ThreadT extends Thread {
    int i;

    public ThreadT() {
        start();
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                sleep(500);
                for (int j = 0; j < 5; j++) {
                    i += j;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            notify();
        }
    }
}