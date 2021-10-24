package Shildt.Collection.ITVDN_Coll;
//https://www.youtube.com/watch?v=Dm6ybcQmGpw
import java.util.Arrays;
import java.util.Comparator;

class AnimalITVD {
    String breed;
    int weight;
    int price;

    public AnimalITVD(String breed, int weight, int price) {
        this.breed = breed;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "AnimalITVD{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}

class ComparatorByPrice implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((AnimalITVD)o1).price - ((AnimalITVD)o2).price;
    }
}
class ComparatorByWeight implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((AnimalITVD)o1).weight - ((AnimalITVD)o2).weight;
    }
}

public class AnimalITVDMain {
    public static void main(String[] args) {
        AnimalITVD cat = new AnimalITVD("Or", 7, 5000);
        AnimalITVD dog = new AnimalITVD("La", 30, 4000);
        AnimalITVD bird = new AnimalITVD("Ki", 15, 50000);
        AnimalITVD[] c = {cat, dog, bird};

        Arrays.sort(c, new ComparatorByPrice());
        for (AnimalITVD tmp : c) {
            System.out.println(tmp);
        }
        System.out.println();
        Arrays.sort(c, new ComparatorByWeight());
        for (AnimalITVD tmp : c) {
            System.out.println(tmp);
        }
    }
}
