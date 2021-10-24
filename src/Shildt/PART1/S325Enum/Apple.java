package Shildt.PART1.S325Enum;

public enum Apple {
    Jonathan(25), GoldenDel(15), RedDel(25), Winesap(5), Cortland;

    int apPrice;

    Apple(int price){
        apPrice = price;
    }

    Apple(){
        apPrice = 1;
    }

    private int getApplePrice(){
        return apPrice;
    }
}
