package Shildt.Threads.GetItter;

public class GetIterMethod {
    int stock;
    boolean flag = false;

    synchronized public void getStock() {
        while (!flag)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("in stock now is: " + stock);

            flag = false;
            notify();


    }

    synchronized public void setStock(int stock) {

        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.stock = stock;
        }
        flag = true;
        System.out.println("sent on stock " + stock);
        notify();
    }
}

