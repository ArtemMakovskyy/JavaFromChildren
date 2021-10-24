package Shildt.Threads.GetItter.GS2;

public class GetterIT extends Thread {
    GetSetMethods getSetMethods;
    Thread t;

    public GetterIT(GetSetMethods getSetMethods) {
        this.getSetMethods = getSetMethods;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while (true){
//            try {
//                sleep(20);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            getSetMethods.getStock();

        }

    }
}
