package Shildt.Threads.T3;

public class PRN2 implements Runnable{
//    PRN1 prn1 = new PRN1();
//    PRN2 prn2 = new PRN2();
    @Override
 synchronized    public void run() {
        while (true){
            try {
                wait(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("prn 2");
            Thread.yield();//рекомендация переключиться на другой поток

        }

    }
}
