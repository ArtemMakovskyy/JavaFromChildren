package Alishev.java.ClassesAndObjects;

public class ClassesAndObjects {

    public static void main(String[] args) {
        Person per1 = new Person();
        Person per2 = new Person();
        per1.setName("Vladislav");
        per2.setName("Anton");
        per1.setAge(25);
        per2.setAge(18);
        System.out.println(per1.getName() + " age " + per1.getAge());
        System.out.println(per2.getName() + " age " + per2.getAge());
        per2.sayHello();

        FunktionPrn fp = new FunktionPrn();
        fp.matrice();
    }
}


class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        name = userName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {

        age = userAge;
    }

    public int getAge() {

        return age;
    }
    void sayHello(){

        for(int i=0; i<2;i++){
            System.out.println("Меня зовут "+name);
        }
    }
}
class FunktionPrn{
    void matrice(){
        int matrice [][] = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        for(int i=0;i < matrice.length;i++){                  //
            for(int j =0; j < matrice[i].length; j++){
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println();
        }

    }
}