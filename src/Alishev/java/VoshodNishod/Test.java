package Alishev.java.VoshodNishod;

public class Test {
    public static void main(String[] args) {
        /**
Animal animal = new Animal();
animal.eat();


Dog dog = new Dog();
dog.bark();
dog.eat();
*/

        //upcasting

//        Dog dog = new Dog();
//        Animal animal = dog;
        //тоже, что и сверху
Animal animal = new Dog();
animal.eat();

// Downcasting
        Dog dog2 = (Dog)animal;
        dog2.bark();
        dog2.eat();



    }
}
