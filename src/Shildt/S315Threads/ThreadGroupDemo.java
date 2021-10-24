package Shildt.S315Threads;
// p 548

class NewThread extends Thread {
    boolean suspendFlag;

    public NewThread(String threadname, ThreadGroup tgOb) {
        super(tgOb, threadname);
        System.out.println("Hoвый поток:   " + this);
        suspendFlag = false;
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(250);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Иcключeниe в " + getName());
        }
        System.out.println(getName() + " завершается. ");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}

public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Группа A");
        ThreadGroup groupB = new ThreadGroup("Группа B");

        NewThread ob1 = new NewThread("Ones_", groupA);
        NewThread ob2 = new NewThread("Two__", groupA);
        NewThread ob3 = new NewThread("Three", groupB);
        NewThread ob4 = new NewThread("Fours", groupB);

        System.err.println("\nBывoд из метода list() :");
        groupA.list();
        groupB.list();
        System.out.println();

        System.err.println("Пpepывaeтcя Группа А / activeCount()");
//        System.err.println("activeCount " + groupA.activeCount() + " / " + groupB.activeCount());
        Thread tda[] = new Thread[groupA.activeCount()];
        groupA.enumerate(tda);//получить потоки  исполнения из группы
        for (int i = 0; i < tda.length; i++) {
            ((NewThread) tda[i]).mysuspend(); //приостановить каждый поток исполнения
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Глaвный лоток исполнения прерван.");
        }
        System.out.println("Boзoбнoвлeниe Группы А");

        for (int i = 0; i < tda.length; i++) {
            ((NewThread) tda[i]).myresume(); //возобновить все потоки  исполнения в  группе
        }
//        ожидать завершения потоков исполнения
        try {
            System.out.println("Oжидaниe завершения потоков исполнения.");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (InterruptedException e) {
            System.out.println("Иcключeниe в  главном  потоке исполнения");
        }
        System.out.println("Глaвный поток исполнения завершен.");

    }
}
