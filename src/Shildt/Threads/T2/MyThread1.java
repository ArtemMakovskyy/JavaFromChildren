package Shildt.Threads.T2;

public class MyThread1 implements Runnable {
    String str;
    Process process;
    Thread t;

    public MyThread1(String str, Process process) {
        this.str = str;
        this.process = process;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (process) {
            process.startIt(str);
        }
    }
}
