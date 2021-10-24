package Shildt.Collection.ITVDN_Coll;
//https://www.youtube.com/watch?v=Dm6ybcQmGpw
import java.util.Arrays;
import java.util.Comparator;

class AnimalITVD2 {
    String breed;
    int weight;
    int price;

    public AnimalITVD2(String breed, int weight, int price) {
        this.breed = breed;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return breed + '\'' +
                ", weight=" + weight +
                ", price=" + price;
    }
}

public class AnimalIAnonimClass {
    public static void main(String[] args) {
        AnimalITVD2 cat = new AnimalITVD2("Or", 7, 5000);
        AnimalITVD2 dog = new AnimalITVD2("La", 30, 4000);
        AnimalITVD2 bird = new AnimalITVD2("Ki", 15, 56000);
        AnimalITVD2[] c = {cat, dog, bird};

        Arrays.sort(c, new Comparator<AnimalITVD2>() {
            @Override
            public int compare(AnimalITVD2 o1, AnimalITVD2 o2) {
                return o1.price - o2.price;
            }
        });
        for (AnimalITVD2 tmp : c) {
            System.out.println(tmp);
        }
    }
}
