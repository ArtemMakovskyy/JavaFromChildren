package Shildt.Threads.T3;

public class PRN1 implements Runnable {


    @Override
   synchronized public void run() {

        while (true) {
            try {
                wait(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("prn 1");
            Thread.yield();//рекомендация переключиться на другой поток


        }

    }
}
