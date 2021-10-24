package LampSwitcherFunction;

public class LampOnMain {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();

        sw.electricConsumer = lamp;

        sw.switchOn();


    }
}
