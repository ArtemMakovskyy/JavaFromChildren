package Shildt.Classes.IO.IO.Rest;

import java.io.Serializable;
import java.util.Objects;

public class SomePeople implements Serializable {
    int age;
    String name;
    String lastName;
    char sex;

    public SomePeople(int age, String name, String lastName, char sex) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "SomePeople{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomePeople that = (SomePeople) o;
        return age == that.age && sex == that.sex && Objects.equals(name, that.name) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, lastName, sex);
    }
}
