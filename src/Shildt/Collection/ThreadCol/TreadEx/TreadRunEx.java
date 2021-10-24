package Shildt.Collection.ThreadCol.TreadEx;
class Work implements Runnable{
    public Work() {
        new Thread(this).start();
    }
    @Override
    public void run() {
        System.out.println("+");
    }
}

public class TreadRunEx {
    public static void main(String[] args) {
        Work w = new Work();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("++");
            }
        }).start();


        new Thread(() -> System.out.println("+P+")).start();


    }
}
