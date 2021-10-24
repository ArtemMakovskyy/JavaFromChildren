package Alishev.java.Serializ.V3;

import java.io.Serial;
import java.io.Serializable;

public class Person3 implements Serializable {
    @Serial
    private static final long serialVersionUID = 1277491159281151901L;

    private int id;
//    private transient int id;
    private String name;
    private int d;

    public Person3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
