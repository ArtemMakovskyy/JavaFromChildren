package Shildt.Threads.WorkJava;

//https://www.youtube.com/watch?v=jw-jS9hmGqg
public class Waitandnotify74 {
    public static void main(String[] args) {
        ThreadB_wn threadB_wn = new ThreadB_wn();
        threadB_wn.start();
        synchronized (threadB_wn){
            try {
                threadB_wn.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadB_wn.total);
        }
    }

    static class ThreadB_wn extends Thread {
        int total;

        @Override
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 5; i++) {
                    total += i;
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                notify();
            }
        }
    }
}
