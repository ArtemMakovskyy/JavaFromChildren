package Alishev.java.Les45Serealization;

import java.io.Serializable;

public class Person implements Serializable {
    int id;
    String name;
    static int counter;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        counter++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
