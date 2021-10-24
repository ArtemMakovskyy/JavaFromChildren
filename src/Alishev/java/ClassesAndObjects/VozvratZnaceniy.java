package Alishev.java.ClassesAndObjects;

public class VozvratZnaceniy {
    public static void main(String[] args) {
        TudiSudi ts1 = new TudiSudi();
        TudiSudi ts2 = new TudiSudi();
        ts1.name = "Vlad";
        ts1.age = 65;
        ts1.wheit = 45.6;
        System.out.println(ts1.manSay("Рад видеть. "));
ts1.calcRiterinment();
        System.out.println("Лишний вес  "+ts1.lesWeit()+ts1.smyle(" смешно"));
    }
}


class TudiSudi {
    int age;
    String name;
    double wheit;


    void calcRiterinment() {
int years = 80-age;
        System.out.println("До пенсии "+ name+" "+years+" лет.");
    }

    double lesWeit(){
        double normWeit = 80.5;
        double pohudet;
        pohudet = normWeit-age;
        return pohudet;
    }

    public String manSay(String aWorg) {
        String govor = "Добрый день " + aWorg;
        return govor;
    }
    public String smyle(String haha){
        return haha;
    }

}