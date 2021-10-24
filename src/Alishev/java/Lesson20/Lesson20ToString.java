package Alishev.java.Lesson20;

public class Lesson20ToString {
    public static void main(String[] args) {
        Human h1 = new Human("Vasya", 45);
        System.out.println(h1);
    }

    static class Human {
        private String name;
        private int age;

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
              public String toString() {
           return name + ", " + age;
        }
    }
}
