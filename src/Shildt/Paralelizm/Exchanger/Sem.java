package Shildt.Paralelizm.Exchanger;
//https://www.youtube.com/watch?v=_NgsIWH5xs0
import java.util.concurrent.Exchanger;

public class Sem {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();
        new Mike(exchanger);
        new Ancet(exchanger);

    }
    static class Mike extends Thread{
        Exchanger<String> exchanger;

        public Mike(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {

            try {
                exchanger.exchange("one");
                sleep(1000);
                exchanger.exchange("two");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static class Ancet extends Thread{
        Exchanger<String> exchanger;

        public Ancet(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                System.out.println(exchanger.exchange("one"));
                System.out.println(exchanger.exchange("two"));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
