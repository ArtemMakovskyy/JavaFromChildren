package Shildt.Collection.ITVDN_Coll.compareTo;
//https://www.youtube.com/watch?v=Dm6ybcQmGpw

class Animl implements Comparable {
    String breed;
    int weight;
    int speed;
    int price;

    public Animl(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                breed +
                        ", weight=" + weight +
                        ", speed=" + speed +
                        ", price=" + price;
    }

    //Сортируем по скорости и цене
    @Override
    public int compareTo(Object o) {
        int tmp = this.speed - ((Animl) o).speed;
        if (tmp == 0) {
            return this.price - ((Animl) o).price;
        } else
            return tmp;
    }
}

public class MainAn {
    public static void main(String[] args) {
        Animl cat = new Animl("Oriental", 7, 25, 5000);
        Animl dog = new Animl("Labr", 30, 20, 4000);
        Animl bird = new Animl("King Pin", 15, 8, 50000);
        Animl[] c = {cat, dog, bird};
//        Arrays.sort(c);
        for (Animl tmp : c) {
            System.out.println(tmp);
        }
    }
}