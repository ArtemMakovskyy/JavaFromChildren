package LampSwitcherFunction;

public class Switcher {
    ElectricConsumer electricConsumer;

    void switchOn() {
        if(electricConsumer != null )
            electricConsumer.switchOn();
        System.out.println("switherOn");
    }
}
