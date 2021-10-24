package Shildt.Threads.GetItter;

public class Getter implements Runnable {
    GetIterMethod getIterMethod;
    Thread t;

    public Getter(GetIterMethod getIterMethod) {
        this.getIterMethod = getIterMethod;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while (true){
            getIterMethod.getStock();
            try {
                Thread.sleep(0,100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
