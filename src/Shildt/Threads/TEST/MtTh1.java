package Shildt.Threads.TEST;

public class MtTh1 implements Runnable{
    String name;
    Thread t;


    public MtTh1(String name) {
        this.name = name;
        new Thread(this, name).start();
        System.out.println(t);

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i+ " " + name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
