package Alishev.java.Potoki;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {
//        TestThird tt1 = new TestThird();
//        tt1.start();

        Thread thread = new Thread(new RunnerTh());
        thread.start();
        Thread thread2 = new Thread(new RunnerTh());
        thread2.start();

    }
}
class RunnerTh implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<10;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(1);
            }
            System.out.println("first"+i);
        }
    }
}

//class TestThird extends Thread{
//    public void run(){
//        for (int i=0; i<10;i++){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//
//            }
//            System.out.println("first"+i);
//        }
//    }
//}
