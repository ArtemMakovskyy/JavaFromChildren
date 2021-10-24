package Shildt.PART1.Reoeat;

public class SetGeter {
    public static void main(String[] args) {
        People p1 = new People("Vasia", 35);
        People p2 = new People("Sasha", 25);
        People p3 = new People("Masha", 20);

        p1.dannie();
        p2.dannie();
        p3.dannie();
    }
}

class People {
    private String name;
    private int age;
    private static String sex;
    private static int countPeople;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("in name");
        } else {
            name = username;
        }
    }

    public void setAge(int usage) {
        age = usage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void dannie() {
        System.out.println(name + " , " + age + "  toutel people is: " + countPeople);
    }


}