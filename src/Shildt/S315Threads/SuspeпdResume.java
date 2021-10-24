package Shildt.S315Threads;

class NewThread2 implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread2(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток " + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 15; i++) {
                System.out.println(name + ": " + i);
                Thread.sleep(250);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + "прерван.");
        }
        System.out.println(name + "завершен.");
    }
//////////////////////////////////////////////
    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}


public class SuspeпdResume {
    public static void main(String[] args) {
        NewThread2 ob1 = new NewThread2(" Один ");
        NewThread2 ob2 = new NewThread2(" Два ");
        NewThread2 ob3 = new NewThread2(" Три ");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Пpиocтaнoвкa  потока Один");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Boзoбнoвлeниe потока Один");


            ob2.mysuspend();
            System.out.println("Пpиocтaнoвкa  потока Два");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Boзoбнoвлeниe потока Два");

        } catch (InterruptedException e) {
            System.out . println( "Глaвный поток прерван");
        }
        //ожидать завершения потоков исполнения
        try {
            System.out.println("Oжидaниe завершения потоков.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out . println( "Глaвный поток прерван");
        }
        System.out.println( "Глaвный поток завершен");
    }
}
