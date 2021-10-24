package Shildt.Collection.ThreadCol.TreadEx;

public class Ex7 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.err.println(i);
            Thread.sleep(500);
        }
        System.out.println("Поехали");
    }
}
