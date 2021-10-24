package Alishev.java.Potoki;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        mt1.shutdown();
    }
}

class MyThread extends Thread {
    private volatile boolean running = true; //volatile переменнаЯ не кешируется в ядрах,
                                              // кешируется в памяти

    public void run() {
        int calc;
        calc = 0;
        while (running) {
            System.out.println("Hello  " + calc);
            calc++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("exit");
            }
        }
    }

    public void shutdown() {
        this.running = false;
        System.err.println("exit");
    }
}