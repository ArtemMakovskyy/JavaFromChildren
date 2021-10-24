package Shildt.Threads.TEST;

public class StartThreads {
    public static void main(String[] args) throws InterruptedException {
        MtTh1 th1 = new MtTh1("second");
        System.out.println(th1.t.isAlive());
        th1.t.join();
        System.out.println(th1.t.isAlive());
    }
}
