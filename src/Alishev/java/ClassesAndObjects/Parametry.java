package Alishev.java.ClassesAndObjects;

public class Parametry {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        p1.setName("Влад", 50, 82.5);
        p2.setName("Саша", 32, 75.36);
        p3.setName("Петя", 18, 65.2);
        p4.setName("Коля", 10, 30.25);
        p1.prnDannie();
        p2.prnDannie();
        p3.prnDannie();
        p4.prnDannie();
    }
}

class Person {
    String name;
    int age;
    double weight;

    void setName(String userName, int userAge, double userWeight) {
        name = userName;
        age = userAge;
        weight = userWeight;
    }

    void prnDannie() {
        System.out.println("Меня зовут - " + name + ", мне " + age + " лет. Я вешу - " + weight + " кг., допенсии лет." + doPensii());
    }

    int doPensii() {
        int pens;
        pens = 81 - age;
        return pens;
    }

    public String manSay(String aWorg) {
        String govor = "Добрый день " + aWorg;
        return govor;
    }
}

