package Alishev.java.Equals;

public class EqualsLesson42 {
    public static void main(String[] args) {


        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
//        System.out.println(animal1 == animal2);

        System.out.println(animal1.equals(animal2));
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}