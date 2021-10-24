package Alishev.java.Interfases;

public class Animal implements Info{
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep(){
        System.out.println("i'm slipeeng...");
    }

    @Override
    public void showInfo() {
        System.out.println(" this id" + this.id);
    }
}
