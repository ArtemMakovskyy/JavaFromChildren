package Alishev.java;

abstract class Animal{
    void eat(){
        System.out.println("i'm eating...");
    }
    abstract void makeSound();
}

class Cat extends Animal{

    @Override
    void makeSound() {
        System.out.println("myawww...");
    }
}

class Dog extends Animal{

    @Override
    void makeSound() {
        System.out.println("gaff...");

    }
}


public class Abst41 {
    public static void main(String[] args) {
Cat cat = new Cat();
Dog dog = new Dog();
cat.makeSound();
dog.makeSound();
cat.eat();
dog.eat();

    }
}
