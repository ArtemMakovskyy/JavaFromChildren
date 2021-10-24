package Shildt.Threads.GetItter.GS2;

public class GetSetMethods {
    int stock;
    boolean flag = false;

    synchronized public int getStock() {

        while (!flag){

            System.out.println("in stock now leing " + stock);
            flag = true;
        }
        return stock;
    }


    synchronized public void setStock(int stock) {

        while (flag){

                this.stock = stock;
                System.out.println("on a stock puting " + stock);

            flag = false;
        }


    }
}
