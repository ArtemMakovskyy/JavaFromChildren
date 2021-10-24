package Shildt.Collection.ITVDN_Coll.Iterator;
//https://www.youtube.com/watch?v=Dm6ybcQmGpw
import java.util.ArrayList;
import java.util.Iterator;

class Animal {
    String breed;
    int price;

    public Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return breed + " " + price;
    }
}

public class MAinINT {
    public static void main(String[] args) {
//        Animal cat = new Animal("Sphinx", 4000);
//        Animal dog = new Animal("Malamute", 3000);
//        Animal bird = new Animal("Crow", 2000);
//        Animal[] c = {cat, dog, bird};
//
//        for (Animal temp : c) {
//            temp.price += 1000;
//        }
//
//        for (Animal temp : c) {
//            System.out.println(temp.breed + " " + temp.price);
//        }

        ArrayList<Animal> al = new ArrayList<>();
        al.add(new Animal("Sphinx", 5000));
        al.add(new Animal("Malamute", 4000));

Iterator <Animal> ai = al.iterator();
while (ai.hasNext()){
    Animal temp = ai.next();
    temp.price += +5;
    System.out.println(temp.price);
}

        System.out.println(al);
    }
}
