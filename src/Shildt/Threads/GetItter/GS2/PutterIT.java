package Shildt.Threads.GetItter.GS2;

public class PutterIT extends Thread {
    GetSetMethods getSetMethods;
    Thread t;

    public PutterIT(GetSetMethods getSetMethods) {
        this.getSetMethods = getSetMethods;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
//            try {
//                sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            getSetMethods.setStock(i++);
        }
    }
}
