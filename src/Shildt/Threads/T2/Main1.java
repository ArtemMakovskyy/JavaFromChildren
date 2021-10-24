package Shildt.Threads.T2;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        Process process = new Process();
        MyThread1 myThread1 = new MyThread1("Запускаем", process);
        MyThread1 myThread2 = new MyThread1("многопоточный", process);
        MyThread1 myThread3 = new MyThread1("режим", process);

        myThread1.t.join();
        myThread2.t.join();
        myThread3.t.join();
    }
}
