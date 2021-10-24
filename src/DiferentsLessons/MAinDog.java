package DiferentsLessons;

public class MAinDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Guchka ");
        dog.run();
        Dog dog2 = new Dog("Tuchka ");
        dog2.run();
        System.out.println(Dog.Stat.counter);
        System.out.println(Dog.Stat.id);
    }
}

class Dog {
    private String name = "";
    private Foot foot = new Foot();
//    private int id = -1;

    {
        Stat.counter++;
//        id = ++Stat.id;
        Stat.id++;
    }

    Dog(String name) {
        this.name = name;

    }

    void run() {
        foot.run();
    }


    private class Foot {
        void run() {
            System.out.println("Dog " + name + " is runing");
        }
    }

    static class Stat {
        public static int counter = 0;
        public static int id = 0;
    }

}