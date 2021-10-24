package krolic.lesson5;
//https://www.youtube.com/watch?v=OVE3Yilmdno
import krolic.Nambers;
import krolic.lesson7.Bus;

public class Main {
    public static void main(String[] args) {
        Bus ouerBus = new Bus();
        Bus firstBus = new Bus();
        Bus secondBus = new Bus();
        Nambers myNumbers = new Nambers();

        ouerBus.color = "Green";
        firstBus.color = "Red";
        secondBus.color = "Grey";

        ouerBus.model = "BMW";
        firstBus.model = "Zapor";
        secondBus.model = "Mers";

        ouerBus.showColor();
        firstBus.showColor();
        secondBus.showColor();
        myNumbers.showNams();

double pi = 3.14;




    }
}
