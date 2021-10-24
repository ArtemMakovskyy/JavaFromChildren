package Alishev.java.Interfases;

public class TEST {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");
        animal.showInfo();
        person.showInfo();

        System.out.println();

        outputInfo(animal);
        outputInfo(person);
    }

public static void outputInfo(Info info){
    info.showInfo();
}
}