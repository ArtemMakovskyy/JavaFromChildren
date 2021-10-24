package Shildt.Threads.GetItter;

public class Puttter implements Runnable {
    GetIterMethod getIterMethod;
    Thread t;

    public Puttter(GetIterMethod getIterMethod) {
        this.getIterMethod = getIterMethod;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            getIterMethod.setStock(i++);
            try {
                Thread.sleep(0,100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
