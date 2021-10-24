package javaForChildren;

public class Fish extends Pet {
    int carrentDepth = 0;

    public int dive(int howDeep) {
        carrentDepth = carrentDepth + howDeep;
        System.out.println("niryayu na " + howDeep + " glubinu");
        System.out.println("ya na glubine " + carrentDepth + " futs");
        return carrentDepth;
    }

    public String say(String something) {
        return "Рыбы не говорят";


    }
}