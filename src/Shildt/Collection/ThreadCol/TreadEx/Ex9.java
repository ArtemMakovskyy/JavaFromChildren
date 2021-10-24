package Shildt.Collection.ThreadCol.TreadEx;

public class Ex9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("method main begins");
        Thread thread = new Thread(new Worker());
         System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());
        System.out.println("method main ends");

    }
}
class Worker implements Runnable{

    @Override
    public void run() {
        System.err.println("work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println("work ends");
    }
}