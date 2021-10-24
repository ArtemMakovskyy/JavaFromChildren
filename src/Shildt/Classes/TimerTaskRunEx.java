package Shildt.Classes;

import java.util.Timer;
import java.util.TimerTask;

class MyTimerTask extends TimerTask{

    @Override
    public void run() {
        System.out.println("Зaдaииe по таймеру выполняется");
    }
}
public class TimerTaskRunEx {
    public static void main(String[] args) throws InterruptedException {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();
/*Установить первоначальную паузу в  течение одной секунды,
а  затем повторять задание каждые полсекунды
 */
        myTimer.schedule(myTask,100,500);
        Thread.sleep(5000);
        myTimer.cancel();
        System.out.println("cencel");
    }
}
